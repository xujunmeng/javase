package javaNIO.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.util.stream.Stream;

/**
 * @author junmeng.xu
 * @date 2016年8月22日下午3:09:46
 */
// files类主要是用来对文件的
public class Main {

	public static void main(String[] args) throws Exception {

		moveFile();

	}

	/**
	 * 非常方便的对文件进行移动操作 将tt.txt从pathFrom文件夹位置移动到pathTo文件夹下
	 * 此方法可以和copy这个方法相比较，用法相同，其他增删改查操作请参考api即可
	 * 
	 * @throws Exception
	 */
	public static void moveFile() throws Exception {
		
		String separator = System.getProperty("file.separator");
		
		Path pathFrom = Paths.get("D://test", "bb.txt");
		
		//这个路径是当前项目的相对路径   不要误认为是C盘的目录！！！！！
		Path path = Paths.get(separator + "data" + separator + "datapub" + separator + "dev" + separator + "pre");
		
//		Path path = Paths.get(separator + "test");
		
//		Path path = Paths.get(separator + "test");
		
		Stream<Path> list = Files.list(path);
		list.forEach((a) -> {
			boolean directory = Files.isDirectory(a);
			System.out.println(directory);
			System.out.println(a);
		});
		
		// 其中dd.txt文件可以不存在，如果存在会被替换掉
		Path pathTo = Paths.get("D://test", "dd.txt");

		try {
			// 文件的大小bytes
			System.out.println(Files.size(pathFrom));

			// 调用文件移动方法
			Files.move(pathFrom, pathTo, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 测试文件的属性信息 包括文件的修改时间、是否是文件夹、创建时间等
	 */
	@SuppressWarnings("deprecation")
	public static void fileAttributes() {
		Path path = Paths.get("e:/logs");
		// 1
		System.out.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
		// 2
		try {
			// 获得文件的基础属性
			BasicFileAttributes attributes = Files.readAttributes(path,
					BasicFileAttributes.class);
			System.out.println(attributes.isDirectory());
			System.out.println(new Date(attributes.lastModifiedTime()
					.toMillis()).toLocaleString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建文件夹 遍历文件夹下的问价
	 */
	public static void createDir() {
		Path path = Paths.get("C:/data/pub/dev/pre");
		try {
			// 创建文件
			if (Files.notExists(path)) {
				Files.createDirectories(path);
				System.out.println("create dir");
			} else {
				System.out.println("dir exists");
			}
			// 在创建的文件夹下建几个txt文件,例如
			// 2.txt
			// ff 文件夹
			// java.bat
			// _java.txt
			// 遍历文件夹下面的文件
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			for (Path p : paths) {
				System.out.println(p.getFileName());
			}
			System.out.println();
			// 创建一个带有过滤器,过滤文件名以java txt bat结尾的文件
			DirectoryStream<Path> pathsFilter = Files.newDirectoryStream(path,
					"*.{java,txt,bat}");
			for (Path p : pathsFilter) {
				System.out.println(p.getFileName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static final String	COLL_FUND_HOLDERS_TEN_FORMER			= "fund.fund_holders_ten_former";
    public static final String	COLL_FUND_INTERMEDIARY					= "fund.fund_intermediary";
	
	
}
