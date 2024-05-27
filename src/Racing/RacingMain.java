package Racing;

public class RacingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle is car
		Vehicle car=new Car("black","SRTDODGE","DODGE DEMON",2018,1961,1025,4,"TorqueFlite8Hp90Automatic");
		car.display();
		System.out.println("quater_MileSpeed of car="+car.quater_MileSpeed());
		System.out.println("quater_MileTime of car="+car.quater_MileTime());
		System.out.println("Top speed of car="+car.TopSpeed());
		
		System.out.println("---------------------------------------------------------");
	//Vehicle is truck
		Vehicle truck=new Truck("Red","Tesla","CyberTruck",2022,3104,600,50.2,13000);
		truck.display();
		System.out.println("quater_MileSpeed of Truck="+truck.quater_MileSpeed());
		System.out.println("quater_MileTime of Truck="+truck.quater_MileTime());
		System.out.println("Top speed of Truck="+truck.TopSpeed());
		
		System.out.println("---------------------------------------------------------");
Vehicle gasolinecar= new GasolineCar("white","toyota","Supra",2023,1530,2000,2,"automatic",50,26);
gasolinecar.display();
System.out.println("quater_MileSpeed of gasolinecar="+gasolinecar.quater_MileSpeed());
System.out.println("quater_MileTime of gasolinecar="+gasolinecar.quater_MileTime());
System.out.println("Top speed of gasolinecar="+gasolinecar.TopSpeed());



	}

}
