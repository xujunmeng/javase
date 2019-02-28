package javaCollection.list;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

	@Test
	public void se4rsr() {
		List<Person> persons = Lists.newArrayList();

		Person person3 = new Person();
		person3.setAge(33);
		person3.setName("cc");
		persons.add(person3);

		Person person2 = new Person();
		person2.setAge(22);
		person2.setName("bb");
		persons.add(person2);

		Person person = new Person();
		person.setAge(11);
		person.setName("aa");
		persons.add(person);

		List<Person> personList = persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

		System.out.println(personList);

		System.out.println(persons);

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
