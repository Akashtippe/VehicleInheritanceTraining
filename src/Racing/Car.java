package Racing;

public class Car extends Vehicle{
	protected int numDoors;
	protected String transmissionType;
	
	public Car(String color, String make, String model, int year, double weight, double horsePower,
			int numDoors,String transmissionType) {
		super(color, make, model, year, weight, horsePower);
     this.numDoors=numDoors;
     this.transmissionType=transmissionType;
	}
	@Override
	public void display() {
		System.out.println("Car = Color:"+getColor()+" ,make :"+getMake()+", model:"+getModel()+
				",year:"+getYear()+",weight:"+getWeight()+",horsePower:"+getHorsePower()+
				",Doors:"+numDoors+",Transmission:"+transmissionType);
		
	}

	@Override
	public double quater_MileSpeed() {
		return 224 * Math.cbrt(horsePower/weight);
		 
		
	}

	@Override
	public double quater_MileTime() {
		return 6.290 * Math.cbrt(weight/horsePower);
	
	}
	@Override
	public double TopSpeed() {
		return 20 * Math.cbrt(horsePower);
		// TODO Auto-generated method stub
		
	}
	public int getNumDoors() {
		return numDoors;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	

}
