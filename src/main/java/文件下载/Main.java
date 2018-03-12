package 文件下载;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
@author junmeng.xu
@date  2016年6月27日下午1:51:23
 */
public class Main {

	public static void main(String[] args) {  
        try{  
            downLoadFromUrl("http://www.cninfo.com.cn/finalpage/2016-04-22/1202232326.PDF",  
                    "89ar9jreg90q4iom3oidsjr3", "pdf", "e:/resource/announce/diaodiao/");  
        }catch (Exception e) {  
        	e.printStackTrace();
        }  
    }  

    @Test
    public void test22(){
        try {
            downLoadFromUrl("http://www.cninfo.com.cn/finalpage/2016-11-07/cninfo1202817435.js",
                    "asd232df", "txt", "e:/resource/announce/diaodiao/");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

	/** 
     * 从网络Url中下载文件 
     * @param urlStr 
     * @param fileName 
     * @param savePath 
     * @throws IOException 
     */ 
    public static void  downLoadFromUrl(String urlStr,String fileName, String fileType, String savePath) throws IOException{  
        URL url = new URL(urlStr);    
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();    
                //设置超时间为3秒  
        conn.setConnectTimeout(5*1000);  
        //防止屏蔽程序抓取而返回403错误  
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");  
  
        //得到输入流  
        InputStream inputStream = conn.getInputStream();    
        //获取自己数组  
        byte[] getData = readInputStream(inputStream);      
  
        //文件保存位置  
        File file = new File(savePath+fileName+"."+fileType);      
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
        FileOutputStream fos = new FileOutputStream(file);       
        fos.write(getData);   
        if(fos!=null){  
            fos.close();    
        }  
        if(inputStream!=null){  
            inputStream.close();  
        }  
  
  
        System.out.println("info:"+url+" download success");   
  
    }  
    /** 
     * 从输入流中获取字节数组 
     * @param inputStream 
     * @return 
     * @throws IOException 
     */  
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {    
        byte[] buffer = new byte[2048];    
        int len = 0;    
        ByteArrayOutputStream bos = new ByteArrayOutputStream();    
        while((len = inputStream.read(buffer)) != -1) {    
            bos.write(buffer, 0, len);    
        }    
        bos.close();    
        return bos.toByteArray();    
    }   
}
