package zip相关;

import 上传下载文件到FTP服务器.FavFTPUtil;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by james on 2017/7/28.
 */
public class ZipOutputStreamDemo {

    public static void main(String args[]) throws IOException {
        String str = "sdflakjserkwhekjh23j4hklksdfkljdasfasdfdasfa";
        InputStream fileInputStream = new  ByteArrayInputStream(str.getBytes());

        //创建字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("jd.txt");

        byte[] buff = new byte[1024];

        int hasRead = 0;

        //循环从输入流中取出数据
        while((hasRead = fileInputStream.read(buff)) > 0){
            //每读取一次，即写入文件输出流，读了多少，就写多少
            fileOutputStream.write(buff, 0, hasRead);
        }
        fileInputStream.close();
        fileOutputStream.close();



        //定义要压缩的文件  也就是说在D盘里有个 demo.txt 的文件(必须要有,否者会有异常,实际应用中可判断);
        File file = new File("jd.txt");

        //定义压缩文件的名称
        File zipFile = new File("test.zip");

        //定义输入文件流
        InputStream input = new FileInputStream(new File("jd.txt"));

        //定义压缩输出流
        ZipOutputStream zipOut = null;

        //实例化压缩输出流,并制定压缩文件的输出路径  就是D盘下,名字叫 demo.zip
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));

        zipOut.putNextEntry(new ZipEntry(file.getName()));

        byte[] buff2 = new byte[1024];

        int hasRead2 = 0;

        while((hasRead2 = input.read(buff2)) > 0) {
            zipOut.write(buff, 0, hasRead2);
        }
        input.close();
        zipOut.close();


        InputStream input2 = new FileInputStream(new File("test.zip"));


        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String filename = "test.zip";


        FavFTPUtil.uploadFile(hostname, port, username, password, pathname, filename, input2);

        File file3 = new File("jd.txt");
        file3.delete();
        File file4 = new File("test.zip");
        file4.delete();
    }

}
