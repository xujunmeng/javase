package javaNIO.channel;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
@author junmeng.xu
@date  2016年8月16日上午11:37:33
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		File file = new File("data.txt");
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		FileChannel channel = outputStream.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		String string = "java nio";
		
		buffer.put(string.getBytes());
		
		buffer.flip();  //此处必须要调用buffer的flip方法
		
		channel.write(buffer);
		
		channel.close();
		
		outputStream.close();
		
		
		
	}
	
}
