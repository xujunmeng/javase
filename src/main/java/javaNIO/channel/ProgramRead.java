package javaNIO.channel;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
@author junmeng.xu
@date  2016年8月16日下午1:59:55
 */
public class ProgramRead {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = new FileInputStream("d:\\cloud.log");
		
		//获取通道
		FileChannel fc = fin.getChannel();
		
		//创建缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		//读取数据到缓冲区
		fc.read(buffer);
		
		buffer.flip();
		
		while(buffer.remaining() > 0){
			byte b = buffer.get();
			System.out.print((char)b);
		}
		
		fin.close();
	}
	
}
