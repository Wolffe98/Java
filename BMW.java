package klassen;

import java.awt.*;

public class BMW extends Auto {
	
	private String asozial;
	public BMW (Color carColor, String name, int speed, String asozial) {
		
		super (carColor, name, speed);
		this.asozial = asozial;
	}
	public String getAsozial() {
		return asozial;
	}
	public void setAsozial(String asozial) {
		this.asozial = asozial;
	}

}
