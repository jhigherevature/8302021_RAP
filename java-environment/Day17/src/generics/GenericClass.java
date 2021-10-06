package generics;

public class GenericClass<K, Placeholder> {
	private K key;
	private Placeholder value;
	
	public Placeholder getValue() {
		return value;
	}	
	public void setValue(Placeholder value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}	
	public void setKey(K key) {
		this.key = key;
	}
}
