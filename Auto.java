package klassen;

import java.awt.Color;

public class Auto {
	private Color carColor = new Color (0,50,50);
	private String name = new String();
	private int speed = 0;
	
	public Auto(Color carColor, String name, int speed) {
		this.carColor = carColor;
		this.name = name;
		this.speed = speed;
	}
	
	public Auto() {
		carColor = new Color (0,0,0);
		name = new String("");
		speed = 0;
	}

	public Color getCarColor() {
		return carColor;
	}

	public void setCarColor(Color carColor) {
		this.carColor = carColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
