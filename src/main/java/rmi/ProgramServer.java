package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


/**
@author junmeng.xu
@date  2016年8月15日下午3:09:34
 */
public class ProgramServer {

	public static void main(String[] args) throws Exception {
		
		PersonService personService = new PersonServiceImpl();
		
		//注册通信端口
		LocateRegistry.createRegistry(6600);
		
		//注册通讯路径
		Naming.rebind("rmi://192.168.1.43:6600/PersonService", personService);
		
		System.out.println("Service Start!");
		
		
		
	}
	
}
