package ru.specialist.graph;

@FunctionalInterface
public interface Scaleable {
	public static final double DEFAULT_FACTOR = 2;
	
	//public abstract
	void scale(double factor);
	
	// since java 9
	private void scaleImpl() {
		this.scale(DEFAULT_FACTOR);
	}
	
	// since java 8
	default void scale() {
		this.scaleImpl();
	}
}

interface Scaleable3D
// extends Scaleable 
{
	void scale3D(double factorX,double factorY, double factorZ);
	default void scale() {
		this.scale3D(Scaleable.DEFAULT_FACTOR, Scaleable.DEFAULT_FACTOR, Scaleable.DEFAULT_FACTOR);
	}
}

class Sphere implements Scaleable, Scaleable3D {

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void scale() {
		Scaleable.super.scale();
		//Scaleable3D.super.scale();
	}
	
	@Override
	public void scale3D(double factorX, double factorY, double factorZ) {
		// TODO Auto-generated method stub
		
	}
	
}
