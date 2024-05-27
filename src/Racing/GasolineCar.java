package Racing;

public class GasolineCar extends Car{
	private int fuelCapacity;
	private int mpg;

	public GasolineCar(String color, String make, String model, int year, double weight, double horsePower,
			int numDoors, String transmissionType,int fuelCapacity,int mpg) {
		super(color, make, model, year, weight, horsePower, numDoors, transmissionType);
		// TODO Auto-generated constructor stub
		this.fuelCapacity=fuelCapacity;
		this.mpg=mpg;
	}
	public void display() {
		System.out.println("Car = Color:"+getColor()+" ,make :"+getMake()+", model:"+getModel()+
				",year:"+getYear()+",weight:"+getWeight()+",horsePower:"+getHorsePower()+
				",Doors:"+numDoors+",Transmission:"+transmissionType+",fuelCapacity:"+fuelCapacity+
				",mpg:"+mpg);
		
	}
	
	public  int calculateTotalRange(int fuelCapacity,int mpg) {
		return fuelCapacity  * mpg;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	

}
