package inheritance;

public class Car extends Vehicle {

	String model="BMW";
	public void show() {
		
		System.out.println("Method of car");
	}
		
		public static void main(String[] args) {
			
			Car c = new Car();
			c.run();
			c.show();
			System.out.println(c.model);
			System.out.println(c.speed);
	}
	}


