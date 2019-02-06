
public class SuperHero {
	private String name;
	private String superpower;
	private int strength;

	public SuperHero(String name, String superpower, int strength) {
		this.name = name;
		this.superpower = superpower;
		this.strength = strength;
	}

	public String getName() {
		return "My Superhero " + name;
	}

	public String getSuperpower() {
		return " has superpower of "+ superpower;
	}

	public String getsStrength() {
		return "and strength level of " + strength + " out of 10.";
	}

}
