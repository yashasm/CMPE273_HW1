
public class GameCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterTerrorist CT = new CounterTerrorist();
		Terrorist T = new Terrorist();
		
		System.out.println("Terrorist moves and uses weapon");
		T.walk();
		T.run();
		T.useWeapon();
		System.out.println("==================================");
		System.out.println("Counter Terrorist moves and uses weapon");
		CT.walk();
		CT.run();
		CT.useWeapon();
		
	}

}
