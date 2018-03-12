package rmi;

import java.io.Serializable;

/**
@author junmeng.xu
@date  2016年8月15日下午3:00:45
 */
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = -5541139372701765210L;

	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
}
