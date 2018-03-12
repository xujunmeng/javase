package javaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author junmeng.xu
 * @date 2016年4月1日下午6:32:33
 */
public class Main {

	public static void main(String[] args) {

		String path = "E:\\abc.txt";
		try {
			String encoding = "GBK";
			File file = new File(path);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				int sum = 0;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if(lineTxt.startsWith("=")){
						String[] split = lineTxt.split(" ");
						String a = split[0];
						String b = split[1];
						int bb = Integer.parseInt(b);
						sum += bb;
					}
				}
				System.out.println(sum);
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

	}

}
