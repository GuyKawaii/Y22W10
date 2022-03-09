package day3;

public class Car {
	private String brand;
	private String model;
	private String honk;
	private boolean isEngineOn;
	private Driver driver;
	
	Car(String brand, String model, String honk) {
		this.brand = brand;
		this.model = model;
		this.honk = honk;
		this.isEngineOn = false;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	String getModel() {
		return this.model;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String geHonk() {
		return this.honk;
	}
	
	void setHonk(String honk) {
		this.honk = honk;
	}
	
	String getHonk() {
		return this.honk;
	}
	
	void sound() {
		if (driver != null)
			System.out.println(this.honk);
		else
			System.out.println("No driver to honk");
	}
	
	void turnEngineOn() {
		if (driver != null)
			this.isEngineOn = true;
		else
			System.out.println("No driver to turn on");
	}
	
	void turnEngineOff() {
		if (driver != null)
			this.isEngineOn = false;
		else
			System.out.println("No driver to turn off");
	}
	
	void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	Driver getDriver() {
		return driver;
	}
	
	void drive() {
		if (isEngineOn && driver != null)
			System.out.printf("%s %s drives\n", this.brand, this.model);
		else
			System.out.println("Engine is turned off");
	}
	
	void park() {
		if (driver == null)
			System.out.println("No driver to park");
		else if (!isEngineOn)
			System.out.println("Engine is off");
		else
			System.out.printf("%s %s has parked\n", this.brand, this.model);
	}
	
	@Override
	public String toString() {
		return this.brand + " " + this.model + " with honk: " + this.honk;
	}
}
