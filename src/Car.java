public class Car extends KIA{
	int noOfWheels;
	int noOfDoors;
	String Color;
	boolean isAirBagAvailable;
	
	public Car(int noOfWheels, int noOfDoors, String color, boolean isAirBagAvailable) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfDoors = noOfDoors;
		Color = color;
		this.isAirBagAvailable = isAirBagAvailable;
	}



	public void start() {
		System.out.println("Started....");
	}



	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("This is test in Car");
	}
}
