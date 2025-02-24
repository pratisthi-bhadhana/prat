package paack1;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Dev";
String b = "Pratisthi";

a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());

System.out.println(a);
System.out.println(b);
}

}