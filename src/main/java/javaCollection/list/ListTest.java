package javaCollection.list;

import java.util.HashMap;
import java.util.Map;

/**
@author junmeng.xu
@date  2016年3月14日下午5:34:29
 */
public class ListTest {

	public static void main(String[] args) {
		
		Map<String, Person> maps = new HashMap<String, Person>();
		Person person = new Person();
		person.setAge(11);
		person.setName("aaa");
		Person person2 = new Person();
		person2.setAge(111);
		person2.setName("aaaa");
		maps.put("1", person);
		maps.put("2", person2);
		Person p = maps.get("1");
		System.out.println(p);
	}
	
	
}
class Person {
	private String name;
	private int age;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
