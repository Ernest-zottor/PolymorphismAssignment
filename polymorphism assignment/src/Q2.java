
public class Q2 {

	public static void main(String[] args) {

		Monster m1 = new FireMonster("fm1");   
		Monster m2 = new WaterMonster("um1");  
		Monster m3 = new StoneMonster("sm1");  


		System.out.println(m1.attack()); //FireMonster 
		System.out.println(m2.attack()); //WaterMoster
		System.out.println(m3.attack());  //StoneMonster

	}

}

class Monster {

	private String name;

	public Monster(String name) {
		this.name = name;
	}

	public String attack() {
		return "Attack with what! >~o>~o";

	}
}

class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with fire! >>>>>>>"; 
	}
}

class WaterMonster extends Monster {

	public WaterMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with water! ~~~~~~";
	}
}

class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stones! OOOOOOO";
	}
}