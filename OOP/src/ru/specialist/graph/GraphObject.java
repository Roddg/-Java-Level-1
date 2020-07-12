package ru.specialist.graph;

/*
 *		Modifier		Access Level		Visibility 
 * 		public			public				world
 *						package				package only 		
 */

public abstract /* final */ class GraphObject implements Colorful{
	
	// À¿¡Œ–¿“Œ–Õ¿ﬂ
	// scene
	// drawScene
	
	public static final String DEFAULT_COLOR = "black";
	
	/*
	 *		Modifier		Access Level		Visibility 
	 * 		public			public				world
	 * 		private			private				this class only
	 * 						package				this package
	 * 		protected		protected			this package + subclass			
	 */
	private String color;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GraphObject() {
		this(DEFAULT_COLOR);
	}
	
	public GraphObject(String color) {
		setColor(color);
		//this.color = color;
		//scene.add( this ); // BAD
	}
	
	public abstract void draw();

	
	
	
}
