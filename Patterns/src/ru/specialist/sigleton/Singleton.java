package ru.specialist.sigleton;

public class Singleton {
	
	private Singleton() {}
	
	private static volatile Singleton instance = null;
	
	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		
		return instance;
		
	}
}
