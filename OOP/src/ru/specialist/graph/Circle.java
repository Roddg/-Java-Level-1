package ru.specialist.graph;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Circle extends GraphObject 
implements Scaleable, Externalizable {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	private int r;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		if (r > 0)
			this.r = r;
		else
			throw new IllegalArgumentException("r <= 0");
	}
	
	private Circle(int x, int y, int r) {
		this(x,y,r,DEFAULT_COLOR);
	}
	
	private Circle(int x, int y, int r, String color) {
		super(color);
		
		this.x = x;
		this.y = y;
		//this.r = r;
		setR(r);
	}
	
	public static Circle createCircle(int x, int y, int r) {
		return createCircle(x,y,r,GraphObject.DEFAULT_COLOR);
	}
	
	public static Circle createCircle(int x, int y, int r, String color) {
		Circle c = new Circle(x,y,r,color);
		GraphScene.scene.add(c);
		return c;
	}
	
	
	public void scale(double factor) {
		//r = (int)(r * factor);
		setR((int)(getR()*factor));
	}
	
//	public void scale() {
//		scale(DEFAULT_FACTOR);
//	}
	
	@Override
	public void draw() {
		
		//super.draw();
		
		System.out.printf("Circle (%d, %d) R: %d  %s\n",
				getX(),getY(),getR(),getColor());
		
	}
	
	@Override
	public String toString() {
		
		return String.format("Circle (%d, %d) R: %d  %s",
				getX(),getY(),getR(),getColor());
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
