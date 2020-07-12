package ru.specialist;

public class ReadonlyStorage<T extends Comparable<? super T>> {
	
	private T data; // Comparable data;
					// Object data;
	
	public boolean isGreater(T x) {
		return data.compareTo(x) > 0;
		
	}

	public T getData() {
		return data;
	}

	public ReadonlyStorage(T data) {
		this.data = data;
	}
	
	
	
}
