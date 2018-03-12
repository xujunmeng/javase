package javaCollection.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
@author junmeng.xu
@date  2016年3月2日下午2:00:15
 */
public class Main {

	public static void main(String[] args) {
		List<String> existSids = new ArrayList<String>();
		existSids.add("1");
		existSids.add("2");
		existSids.add("3");
		List<String> existSids2 = new ArrayList<String>();
		existSids2.add("3");
		existSids2.add("4");
		existSids2.add("5");
		 HashSet<String> newHashSet = Sets.newHashSet(Sets.union(
                 Sets.newHashSet(existSids),
                 Sets.newHashSet(existSids2)));
		 for (String string : newHashSet) {
			System.out.println(string);
		}
		
	}
	//生成sql查询时in后面的语句
	private static void dealSqlInstance() {
		List<String> sids = new ArrayList<String>();
		sids.add("62274142");
		sids.add("62274167");
		sids.add("62274177");
		sids.add("62274179");
		sids.add("62274207");
		String strs = "";
		for (String string : sids) {
			strs += "'"+string+"',";
		}
		System.out.println(strs);
		String substring = "("+strs.substring(0, strs.length()-1)+")";
		System.out.println(substring);
	}
	
	
	
	//比较两个list  不同的元素
	public void test(){
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		list1.add("G");
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add("F");
		list2.add("G");
		list2.add("H");
		list2.add("I");
		list2.add("J");
		List<String> different = getDifferent(list1,list2);
		for (String string : different) {
			System.out.println(string);
		}
	}


	private static List<String> getDifferent(List<String> list1, List<String> list2) {
		Map<String, Integer> map = new HashMap<String, Integer>(list1.size() + list2.size());
		
		List<String> diff = new ArrayList<String>();
		
		List<String> maxList = list1;
		List<String> minList = list2;
		if(list2.size() > list1.size()){
			maxList = list2;
			minList = list1;
		}
		
		for (String string : maxList) {
			map.put(string, 1);
		}
		for (String string : minList) {
			Integer cc = map.get(string);
			if(cc != null){
				map.put(string, ++cc);
				continue;
			}
			map.put(string, 1);
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				diff.add(entry.getKey());
			}
		}
		
		return diff;
	}
	
	
	
	@Test
	public void testss(){
		ArrayList<Object> newArrayList = null;
		if((newArrayList.size() >= 2) && (!CollectionUtils.isEmpty(newArrayList))){
			System.out.println("asdfasd");
		}
		
	}
	
	@Test
	public void test2222(){
		List<String> list1 = new ArrayList<String>();
		list1.add("11");
		list1.add("22");
		list1.add("33");
		list1.add("44");
		list1.add("55");
		list1.add("66");
		list1.add("77");
		list1.add("88");
		list1.add("99");
		list1.add("111");
		list1.add("222");
		for (int i = 1; i <= 10; i++) {
			System.out.println(list1.subList(0, i));
		}
	}

	@Test
	public void test235() {
		List<Xiong> list = Lists.newArrayList();
/*		Xiong obj = new Xiong("name1", 23);
		Xiong obj2 = new Xiong("name2", 43);
		Xiong obj3 = new Xiong("name3", 31);
		list.add(obj);
		list.add(obj2);
		list.add(obj3);*/

		List<Xiong> list2 = Lists.newArrayList();
		Xiong obj4 = new Xiong("name2", 43);
		Xiong obj5 = new Xiong("name4", 86);
		list2.add(obj4);
		list2.add(obj5);
		list.removeAll(list2);
		list.addAll(list2);
		System.out.println(list);

	}

	// 尽量不要这样操作，因为会破坏inventorySerialNos的结构，程序中如果后面需要用到原来的inventorySerialNos就会出现问题！！！
	@Test
	public void test2223() {
		List<String> inventorySerialNos = Lists.newArrayList();
		inventorySerialNos.add("111");
		inventorySerialNos.add("222");
		inventorySerialNos.add("333");
		List<String> dbInventorySerialNos = Lists.newArrayList();
		dbInventorySerialNos.add("222");
		inventorySerialNos.removeAll(dbInventorySerialNos);
		System.out.println(inventorySerialNos);
	}

	@Test
	public void test23634() {
		List<String> inventorySerialNos = Lists.newArrayList();
		inventorySerialNos.add("111");
		inventorySerialNos.add("222");
		inventorySerialNos.add("333");
		List<String> dbInventorySerialNos = Lists.newArrayList();
		dbInventorySerialNos.add("222");
		List<String> inventoryHisSerialNos = Lists.newArrayList();
		for (String inventorySerialNo : inventorySerialNos) {
			if (!dbInventorySerialNos.contains(inventorySerialNo)) {
				inventoryHisSerialNos.add(inventorySerialNo);
			}
		}
		System.out.println(inventoryHisSerialNos);
	}
	
	//把集合的元素顺序倒过来
	public void test22222(){
		ArrayList<String> list = Lists.newArrayList();
		for (int i = (list.size() - 1); i >= 0; i--) {                              
			System.out.println(list.get(i));                                        
		}                                                                           
	}
	
}
class Xiong {
	private String name;
	private Integer age;

	public Xiong(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Xiong xiong = (Xiong) o;

		if (name != null ? !name.equals(xiong.name) : xiong.name != null) return false;
		return age != null ? age.equals(xiong.age) : xiong.age == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (age != null ? age.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Xiong{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}