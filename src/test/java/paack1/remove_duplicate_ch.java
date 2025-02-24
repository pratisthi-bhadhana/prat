package paack1;

public class remove_duplicate_ch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "delldell";
		String result ="";
		for(int i=0; i<str.length();i++)
		{
			String ch = "" + str.charAt(i) ;
			if(result.contains(ch)) {
				continue;
			}
			result += ch;
			//Adds ch to result only if it is not already present.
		}
		System.out.println(result);
	}

}
