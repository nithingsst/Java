package inheritance;

public class Daughter extends Father {
	
	int age = 28;
	public void dwealth(){
		System.out.println("Daughter account balance is 5 Lakhs");
	}

	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.ageOfGrandFather();
		d.ageOfFather();
		System.out.println(d.dwealth());
System.out.println(d.fwealth());
System.out.println(d.gfwealth());
	}
}
