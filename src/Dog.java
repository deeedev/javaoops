public class Dog extends Animal implements Pet{

	public Dog(int leg, String color, String hair, String name) {
		super(leg, color, hair, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void sound() {
		System.out.println("Bark..");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Dog is pet animal");
		
	}
}
