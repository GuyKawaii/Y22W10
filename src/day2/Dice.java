package day2;

import java.util.Random;

public class Dice {
	private int faceValue;
	Random rnd = new Random();
	
	Dice() {
		this.faceValue = 1;
	}
	
	int getFaceValue() {
		return this.faceValue;
	}
	
	void roll() {
		this.faceValue = rnd.nextInt(6) + 1;
	}
}
