package 动态加载jar文件;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.log4j.Logger;

/**
@author junmeng.xu
@date  2016年9月12日下午5:24:01
 */
public class Main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws Exception {
		
		//系统类库路径
		File libPath = new File("D:/");
		//获取所有的.jar和.zip文件
		File[] jarFiles = libPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".jar") || name.endsWith(".zip");
			}
		});
		
		if(jarFiles != null){
			//从URLClassLoader类中获取类所在文件夹的方法
			Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
			//获取方法的访问权限
			boolean accessible = method.isAccessible();
			try {
				if(accessible == false){
					//设置方法的访问权限
					method.setAccessible(true);
				}
				//获取系统类加载器
				URLClassLoader classLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
				for(File file : jarFiles){
					URL url = file.toURI().toURL();
					try {
						method.invoke(classLoader, url);
						log.error("读取jar文件[name={}]" + file.getName());
					} catch (Exception e) {
						log.error("读取jar文件[name={}]失败" + file.getName());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				method.setAccessible(accessible);
			}
			
			
		}
		
	}
	
}
