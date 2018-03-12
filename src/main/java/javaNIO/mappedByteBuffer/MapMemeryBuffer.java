package javaNIO.mappedByteBuffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
@author junmeng.xu
@date  2016年8月16日下午4:37:47
 */
public class MapMemeryBuffer {

	public static void main(String[] args) throws Exception {
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		
		FileInputStream fileInputStream = new FileInputStream("E://resource//announce//diaodiao.zip");
		
		FileOutputStream fileOutputStream = new FileOutputStream("E://resource//announce//diaodiaobak.zip");
		
		FileChannel fileInChannel = fileInputStream.getChannel();
		
		FileChannel fileOutChannel = fileOutputStream.getChannel();
		
		
		fileInChannel.read(byteBuffer); //读取
		
		MappedByteBuffer mappedByteBuffer = fileInChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileInChannel.size());
		
		fileOutChannel.write(mappedByteBuffer);
		
		
		
	}
	
}
