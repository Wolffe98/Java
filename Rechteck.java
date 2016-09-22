package klassen;

public class Rechteck {
	
	double a;
	double b;
	
	public Rechteck() {
		setA(0);
		setB(0);
	}
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	void setA(double a) {
		this.a = a;
	}
	
	void setB(double b) {
		this.b = b;
	}
	
	double getFlaeche() {
		return b * a;
	}
	
	public String toString() {
		return "Rechteckfläche: "+getFlaeche();
	}

	
}
