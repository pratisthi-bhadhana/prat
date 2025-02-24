package paack1;

public class interface_class implements interface1 {

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("body given by child class for interface1");
	}

	@Override
	public void second() {
		// TODO Auto-generated method stub
		System.out.println("body given by child class for interface2");
	}
	
	public static void main(String[]arg) {
		interface_class ob = new interface_class();// creating object of child class
		ob.first();
		ob.second();

}
}