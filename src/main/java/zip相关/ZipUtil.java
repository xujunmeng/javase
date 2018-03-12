package zip相关;

import org.junit.Test;
import 上传下载文件到FTP服务器.FavFTPUtil;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by james on 2017/7/21.
 * 将一个字符串按照zip方式压缩和解压缩
 */
public class ZipUtil {

    // 压缩
    public static byte[] compress2(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return new byte[]{};
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toByteArray();
    }

    // 压缩
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString("ISO-8859-1");
    }

    // 解压缩
    public static String uncompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(str
                .getBytes("ISO-8859-1"));
        GZIPInputStream gunzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        // toString()使用平台默认编码，也可以显式的指定如toString("GBK")
        return out.toString();
    }

    // 测试方法
    public static void main(String[] args) throws IOException {

        String compress = ZipUtil.compress("中国China");
        System.out.println(compress);


        String uncompress = ZipUtil.uncompress(compress);
        System.out.println(uncompress);


    }

    public static final InputStream byte2Input(byte[] buf) {
        return new ByteArrayInputStream(buf);
    }

    public static final byte[] input2byte(InputStream inStream)
            throws IOException {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, 100)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }

    /**
     * 上传文件（可对文件进行重命名）
     *
     * @param hostname       FTP服务器地址
     * @param port           FTP服务器端口号
     * @param username       FTP登录帐号
     * @param password       FTP登录密码
     * @param pathname       FTP服务器保存目录
     * @param filename       上传到FTP服务器后的文件名称
     * @param originfilename 待上传文件的名称（绝对地址）
     * @return
     */
    @Test
    public void test() throws IOException {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String filename = "20170721120700.zip";

        byte[] compress = ZipUtil.compress2("中国China");

        InputStream inputStream = byte2Input(compress);

        FavFTPUtil.uploadFile(hostname, port, username, password, pathname, filename, inputStream);
    }

    @Test
    public void test2323() throws IOException {




        String str = "sdflakjserkwhekjh23j4hklksdfkljdasfasdfdasfa";
        InputStream fileInputStream = new  ByteArrayInputStream(str.getBytes());

        //创建字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:/jd.txt");

        byte[] buff = new byte[1024];

        int hasRead = 0;

        //循环从输入流中取出数据
        while((hasRead = fileInputStream.read(buff)) > 0){
            //每读取一次，即写入文件输出流，读了多少，就写多少
            fileOutputStream.write(buff, 0, hasRead);
        }






    }


    public static String inputStream2String(InputStream is)   throws   IOException{
        ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream();
        int   i=-1;
        while((i=is.read())!=-1){
            baos.write(i);
        }
        return   baos.toString();
    }

}
