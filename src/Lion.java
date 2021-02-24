public class Lion extends Animal {

	public Lion(int leg, String color, String hair, String name) {
		super(leg, color, hair, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sound() {
		System.out.println("Roar...");
	}
}
