package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

/**
@author junmeng.xu
@date  2016年8月15日下午3:03:15
 */
public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {
	private static final long serialVersionUID = 354608575396978688L;

	protected PersonServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<PersonEntity> GetList() {
		System.out.println("Get Person Start !");
		List<PersonEntity> personList = new LinkedList<PersonEntity>();
		
		PersonEntity person1 = new PersonEntity();
		person1.setAge(25);
		person1.setId(0);
		person1.setName("xujunmeng");
		personList.add(person1);
		
		PersonEntity person2 = new PersonEntity();
		person2.setAge(22);
		person2.setId(1);
		person2.setName("hahaha");
		personList.add(person2);
		
		return personList;
	}

}
