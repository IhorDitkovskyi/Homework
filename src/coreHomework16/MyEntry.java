package coreHomework16;

import java.io.Serializable;

public class MyEntry<K,V extends Serializable> implements Serializable {

	private static final long serialVersionUID = -8994709821439372279L;

	private K key;
	
	private V value;

	public MyEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", value=" + value + "]";
	}
	
	
	
	
	
}
