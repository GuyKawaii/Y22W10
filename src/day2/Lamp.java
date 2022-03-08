package day2;

public class Lamp {
	private Boolean isOn;
	
	Lamp(Boolean isOn){
		this.isOn = isOn;
	}
	
	Lamp(){
		this.isOn = false;
	}
	
	boolean getState() {
		return this.isOn;
	}
	
	void pushButton() {
		this.isOn = !this.isOn;
	}
	
	@Override
	public String toString() {
		if (isOn) {
			return "on";
		}
		return "off";
	}
}
