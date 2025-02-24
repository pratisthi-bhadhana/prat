package paack1;

public class classextendabstraction extends Classabstraction {//child class

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("Body given by child class");
	}
public static void main(String[]arg) {
	classextendabstraction ob = new classextendabstraction();// creating object of child class
	ob.abc();
	ob.xyz();
}
}
