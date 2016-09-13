
public abstract class Character {
	WeaponSelected weapon;
	
	public void walk(){
		System.out.println("Walking one step at a time");
	};
	
	public void useWeapon(){
		weapon.useWeapon();
	}
	
	public abstract void run();

}
