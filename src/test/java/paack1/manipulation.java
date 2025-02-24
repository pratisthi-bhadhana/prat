package paack1;

public class manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="The rains have started here";
		String str1 ="The rains Have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));// 2nd occurance 
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));///-1 value is not there
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,9));
		
		String s= "    Hello     world   ";//remove forward and backward space
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String test ="hello_dear_devil";
		String testval[]= test.split("_");
		for(int i=0; i< testval.length;i++)
			System.out.println(testval[i]);
		
		
		
	}

}
