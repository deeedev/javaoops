public class Cat extends Animal implements Pet{

	public Cat(int leg, String color, String hair, String name) {
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
		System.out.println("Meaw..");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Cat is a Pet Animal");
	}

}
