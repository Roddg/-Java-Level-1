package ru.specialist.graph;

import java.util.ArrayList;
import java.util.List;

// Circle
//  x,y,r
//  Circle(x,y,r)
//  draw()
//  scale(double)
//  moveBy(dx,dy)
// 			subclass		super class
public class Point extends GraphObject {
	
	public int x;
	public int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf("Point (%d, %d) %s\n", x, y, getColor());
	}
	
	public void moveBy(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

}
