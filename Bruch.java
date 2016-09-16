package klassen;

class Bruch {
		int zaehler;
		int nenner;
		
		void ausgeben() {
			System.out.print(zaehler + "/" + nenner);
		}
		void kuerzen() {
			int m, n, r;
			m =zaehler;
			n = nenner;
			r = m % n;
			while (r > 0) {
				m = n;
				n = r;
				r = m % n;
			}
			zaehler = zaehler / n;
			nenner = nenner / n;
		}
		void gekuerztausgeben() {
			kuerzen();
			ausgeben();
		}
		void erweitern(int a) {
			zaehler *= a;
			nenner *= a;
		}
		void multiplizieren(Bruch m) {
			zaehler *= m.zaehler;
			nenner *= m.nenner;
		}
		double dezimalwert() {
			return (double) zaehler/nenner;
		}
} 		
