package Package_1;

public class Student {
	
	int roll_no= 30;
	int age = 12;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
		
		}
	public void display2()
	{
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student deepak = new Student();
		
		deepak.display1();
		deepak.display2();
		
		System.out.println(deepak.roll_no);
		System.out.println(deepak.age);

	}

}
