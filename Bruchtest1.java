package klassen;

public class Bruchtest1 {

	public static void main(String[] args) {
		Bruch b = new Bruch();
		b.zaehler = 3;
		b.nenner = 12;
		b.ausgeben();
		System.out.print("\nUnd nach dem Kürzen: ");
		b.erweitern(4);
		b.kuerzen();
		b.ausgeben();
		System.out.print(b.dezimalwert());
	}
}
