package ru.specialist.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphScene {
	public static List<GraphObject> scene = new ArrayList<GraphObject>();
	
	public static void drawScene() {
		for(GraphObject g : scene)
			g.draw();
	}
	
	public static void colorScene(String color) {
		for(GraphObject g : scene)
			g.setColor(color);
	}
	
	public static void scaleScene(double factor) {
		for(GraphObject g : scene) {
			if ( g instanceof Scaleable ) {
				Scaleable s = (Scaleable)g;
				s.scale(factor);
			}
		}
	}
	

}
