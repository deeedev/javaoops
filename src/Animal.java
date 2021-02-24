public class Animal extends Zoo{
	int leg;
	String color;
	String hair;
	String name;
	
	public Animal(int leg, String color, String hair, String name) {
		super();
		this.leg = leg;
		this.color = color;
		this.hair = hair;
		this.name = name;
	}

	public int getLeg() {
		return leg;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleep...");
	}
	
	public void sound() {
		System.out.println("Urrr...");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog(4, "Brown", "black", "Tommy");
//		Cat cat = new Cat(4, "Grey", "Brown", "Kitty");
//		Lion lion = new Lion(4, "Brown", "Black", "King");
		
//		Animal an = new Animal(1, "", "Red", "asda0");
//		an.Address();
		System.out.println(dog.getName());
		System.out.println(dog.getColor());
		System.out.println(dog.getHair());
		System.out.println(dog.getLeg());
		dog.eat();
		dog.sleep();
		dog.sound();
		System.out.println(dog.isPet());
		
		System.out.println("--------------------");
		
//		System.out.println(cat.getName());
//		System.out.println(cat.getColor());
//		System.out.println(cat.getHair());
//		System.out.println(cat.getLeg());
//		cat.eat();
//		cat.sleep();
//		cat.sound();
//		System.out.println(cat.isPet());
//		
//		System.out.println("--------------------");
//		
//		System.out.println(lion.getName());
//		System.out.println(lion.getColor());
//		System.out.println(lion.getHair());
//		System.out.println(lion.getLeg());
//		lion.eat();
//		lion.sleep();
//		lion.sound();
//		
//		System.out.println("--------------------");
		
	}

	@Override
	public void Address() {
		// TODO Auto-generated method stub
		System.out.println("Address is set");
	}
	
}
