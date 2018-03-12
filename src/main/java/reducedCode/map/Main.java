package reducedCode.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;

/**
@author junmeng.xu
@date  2016年4月7日上午11:20:26
 */
public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		Map<String, String> transformMap = transformMap(list, input -> {
            System.out.println(input);
            return null;
        });
		
	}
	
	public static <T, K, V> Map<K, V> transformMap(Collection<T> inList, Function<T, TransformEntry<K, V>> transform){
		Map<K, V> transformMap = new LinkedHashMap<K, V>();
		for (T inElem : inList) {
			TransformEntry<K, V> entry = transform.apply(inElem);
			if(entry == null){
				continue;
			}
			transformMap.put(entry.getKey(), entry.getValue());
		}
		return transformMap;
	}
	
}
