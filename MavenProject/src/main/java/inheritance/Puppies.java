package inheritance;

public class Puppies extends Dog{

	String types="Lab";
	public void pome() {
		System.out.println("Dog is running");
	}
	public static void main(String[] args) {
		Puppies p=new Puppies();
		p.run();
		p.bark();
		p.pome();
		System.out.println(p.animalleg);
		System.out.println(p.Dogbreed);
		System.out.println(p.types);
		

	}

}
