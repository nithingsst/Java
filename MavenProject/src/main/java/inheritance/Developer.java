package inheritance;

public class Developer extends Employer{
	
	int developers =5;
	
	public void numberofprojects() {
		System.out.println("Number of projects are 11");
	}

	public static void main(String[] args) {
		
		Developer d = new Developer();
		d.numberofprojects();
		d.salary();
		System.out.println(d.project);
		System.out.println(d.developers);

		Tester t = new Tester();
		t.salary();
		t.testers();
	}

}
