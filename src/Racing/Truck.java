package Racing;

public class Truck extends Vehicle{
	private double bedSize;
	private int towingCapacity;

	public Truck(String color, String make, String model, int year, double weight, double horsePower,
			double bedSize,int towingCapacity) {
		super(color, make, model, year, weight, horsePower);
		// TODO Auto-generated constructor stub
		this.bedSize=bedSize;
		this.towingCapacity=towingCapacity;
	}

	@Override
	public void display() {
		System.out.println("Car = Color:"+getColor()+" ,make :"+getMake()+", model:"+getModel()+
				",year:"+getYear()+",weight:"+getWeight()+",horsePower:"+getHorsePower()+
				",bedsize:"+bedSize+",towingCapacity:"+towingCapacity);
		
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

	public double getBedSize() {
		return bedSize;
	}

	public void setBedSize(double bedSize) {
		this.bedSize = bedSize;
	}

	public int getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	
	

}
