package ru.specialist.observer;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	
	private List<ElectricityListener> listeners = 
			new ArrayList<>();
	
	public void addElectricityListener(ElectricityListener l) {
		listeners.add(l);
	}
	
	public void removeElectricityListener(ElectricityListener l) {
		listeners.remove(l);
	}
	
	public void switchOn() {
		System.out.println("Выключатель включен");
		// raise event
		for(ElectricityListener l : listeners)
			l.electricity( this );
	}

}
