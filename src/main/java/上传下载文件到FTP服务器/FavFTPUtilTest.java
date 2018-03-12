package 上传下载文件到FTP服务器;

import org.junit.Test;

/**
 * Created by james on 2017/7/20.
 */
public class FavFTPUtilTest {

    @Test
    public void testFavFTPUtil() {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String filename = "test.txt";
        String originfilename = "D:\\test.txt";
        FavFTPUtil.uploadFileFromProduction(hostname, port, username, password, pathname, filename, originfilename);
// String localpath = "D:/";

// FavFTPUtil.downloadFile(hostname, port, username, password, pathname, filename, localpath);
    }


    /**
     * 下载文件
     *
     * @param hostname  FTP服务器地址
     * @param port      FTP服务器端口号
     * @param username  FTP登录帐号
     * @param password  FTP登录密码
     * @param pathname  FTP服务器文件目录
     * @param filename  文件名称
     * @param localpath 下载后的文件路径
     * @return
     */
    @Test
    public void testDownload() {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String filename = "test.zip";
        String localpath = "D:\\downloadFromFTP";
        boolean b = FavFTPUtil.downloadFile(hostname, port, username, password, pathname, filename, localpath);
        System.out.println(b);
    }


    /**
     * 删除文件
     *
     * @param hostname FTP服务器地址
     * @param port     FTP服务器端口号
     * @param username FTP登录帐号
     * @param password FTP登录密码
     * @param pathname FTP服务器保存目录
     * @param filename 要删除的文件名称
     * @return
     */
    @Test
    public void testDel() {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String filename = "20170802000950.zip";
        boolean b = FavFTPUtil.deleteFile(hostname, port, username, password, pathname, filename);
        System.out.println(b);
    }

    @Test
    public void testDel2() {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        FavFTPUtil.deleteFile2(hostname, port, username, password, pathname);
    }

    @Test
    public void downAll() {
        String hostname = "36.110.177.25";
        int port = 21;
        String username = "shyiwl001";
        String password = "EvJqcbG";
        String pathname = "share";
        String localpath = "D:\\downloadFromFTP";
        FavFTPUtil.downloadFile2(hostname, port, username, password, pathname, localpath);
    }
}
