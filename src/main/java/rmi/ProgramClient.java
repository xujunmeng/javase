package rmi;

import java.rmi.Naming;
import java.util.List;

/**
@author junmeng.xu
@date  2016年8月15日下午3:12:09
 */
public class ProgramClient {

	public static void main(String[] args) throws Exception{
		
		//调用远程对象，注意RMI路径与接口必须与服务器配置一致
		PersonService personService = (PersonService) Naming.lookup("rmi://192.168.1.43:6600/PersonService");
		
		List<PersonEntity> personList = personService.GetList();
		
		for (PersonEntity personEntity : personList) {
			System.out.println(personEntity);
		}
		
	}
	
}
