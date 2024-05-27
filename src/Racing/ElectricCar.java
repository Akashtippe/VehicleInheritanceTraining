package Racing;

public class ElectricCar extends Car{
	
	private int batteryCapacity;
	private int range;

	public ElectricCar(String color, String make, String model, int year, double weight, double horsePower,
			int numDoors, String transmissionType,int batteryCapacity,int range) {
		super(color, make, model, year, weight, horsePower, numDoors, transmissionType);
		// TODO Auto-generated constructor stub
		this.batteryCapacity=batteryCapacity;
		this.range=range;
	}
	public void display() {
		System.out.println("Car = Color:"+getColor()+" ,make :"+getMake()+", model:"+getModel()+
				",year:"+getYear()+",weight:"+getWeight()+",horsePower:"+getHorsePower()+
				",Doors:"+numDoors+",Transmission:"+transmissionType+",batteryCapacity:"+batteryCapacity+
				",range:"+range);
		
	}
	
	public int calculateEnergyCapacity(int batteryCapacity,int range) {
		return batteryCapacity  * range;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	

}
