
public class Maruti extends Car {
	
	String model;
	String brand;
	BMW bmw;
	
	public Maruti(String model, String brand, BMW bmw,int noOfWheels, int noOfDoors, String color, boolean isAirBagAvailable) {
		super( noOfWheels, noOfDoors, color, isAirBagAvailable);
		this.model = model;
		this.brand = brand;
		this.bmw = bmw;
	}

	public void openAirBag() {
		System.out.println("AirBag Opened");
	}
	
	public static void main(String[] args) {
		
		BMW bmw = new BMW("SLClass", "BMW");
		Maruti m = new Maruti("M800","Maruti Suzuki",bmw,4,4,"Grey",false);
		BMW bm = m.bmw;
		System.out.println(m.noOfDoors);
		System.out.println(m.Color);
		System.out.println(bm.Brand);
		System.out.println(bm.model);
		bmw.test();
		m.test();
		
	}
}
