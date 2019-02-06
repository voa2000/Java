

public class Tutorial5 {

	public static void main(String[] args) {

		SuperHero spiderman = new SuperHero("Spiderman","Wrist web-shooters to shoot spider web material",10);
		SuperHero batman = new SuperHero("Batman","Night vision",10)
;

		System.out.println(spiderman.getName()+ spiderman.getSuperpower()+spiderman.getsStrength());
		System.out.println(batman.getName()+batman.getSuperpower()+" "+batman.getsStrength());
	}

}
