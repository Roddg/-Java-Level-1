package ru.specialist.observer;

public class Lamp implements ElectricityListener {

	@Override
	public void electricity(Object sender) {
		System.out.println("����� ��������");
		
	}

}
