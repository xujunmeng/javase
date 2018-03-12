package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
@author junmeng.xu
@date  2016年8月15日下午3:02:18
 */
public interface PersonService extends Remote {

	public List<PersonEntity> GetList() throws RemoteException;
	
}
