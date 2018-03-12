package javaNIO.channel;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
@author junmeng.xu
@date  2016年8月16日下午2:07:40
 */
public class ProgramWriter {

	private static byte message[] = { 2,23,43,54,23,23,35,64,6,35,42,24 };
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fileOutputStream = new FileOutputStream("data2.txt");
		
		FileChannel fc = fileOutputStream.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		for(int i = 0 ; i < message.length ; ++i){
			buffer.put(message[i]);
		}
		
		buffer.flip();
		
		fc.write(buffer);
		
		fileOutputStream.close();
		
	}
	
}
