package inheritance;

public class Son extends Father {
	int age =26;
	public void swealth() {
		System.out.println("Son account balance is 10 Lakhs");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.ageOfGrandFather();
		s.ageOfFather();
		System.out.println(s.gfwealth);
		System.out.println(s.fwealth);

	}

}
