package paack1;

public class remove_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "$$^%^^^% java*&*^%^%^% selenium";
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
