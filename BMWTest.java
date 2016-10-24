package klassen;

import java.awt.Color;

public class BMWTest {

	public static void main(String[] args) {
		
		BMW eins = new BMW(new Color(0,0,0), "Hanzo", 42, "asozial");
		System.out.println (eins.getAsozial()
				+" "+ eins.getName()
				+" "+ eins.getCarColor());
		System.out.println(eins);

	}

}

