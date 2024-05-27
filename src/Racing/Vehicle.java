package Racing;

 abstract class Vehicle {
	private String color;
	private String make;
	private String model;
	private int year;
	protected double weight;
	protected double horsePower;
	
	public Vehicle(String color, String make, String model, int year, double weight, double horsePower) {
		super();
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		this.weight = weight;
		this.horsePower = horsePower;
	}
	
	public abstract  double quater_MileSpeed() ;

	public abstract double quater_MileTime();
	
	public abstract double TopSpeed();
	
	public abstract void display();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	
	
	

}
