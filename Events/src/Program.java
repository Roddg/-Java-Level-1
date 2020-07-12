
public class Program {
	
	public static void fireFighters(Object sender) {
		System.out.println("Пожарные приехали");
		
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		sw.addElectricityListener(
			new ElectricityListener() {
				public void electricity(Object sender) {
					System.out.println("Пожар");
				}
			});
		
		sw.addElectricityListener( s -> System.out.println("Fire") );
		
		AirCondition ac = new AirCondition();
		
		//sw.addElectricityListener( s -> ac.cool(s) );
		sw.addElectricityListener( ac::cool );
		//sw.addElectricityListener( s->Program.fireFighters(s) );
		sw.addElectricityListener( Program::fireFighters );
		
		
		sw.switchOn();

	}

}
