import ru.specialist.sigleton.Singleton;
import ru.specialist.observer.*;

public class Program {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance(); 
				//new Singleton();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Runtime.getRuntime().exit(0);
		
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
				}
		);
		
		sw.addElectricityListener( s -> System.out.println("Fire") );
		
		
		sw.switchOn();

	}

}
