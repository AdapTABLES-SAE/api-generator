package structures;

import java.util.Objects;

public class Pair<T,V> {

	private T key;
	private V value;
	
	public Pair(T t, V v){
		this.key = t;
		this.value = v;
	}

	public T getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}
	
	
	
}
