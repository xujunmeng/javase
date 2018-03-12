package reducedCode.map;

/**
@author junmeng.xu
@date  2016年4月7日上午11:23:31
 */
public class TransformEntry<k,V>{

	private k key;
	private V value;

	public TransformEntry(k key, V value) {
		this.key = key;
		this.value = value;
	}

	public k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
