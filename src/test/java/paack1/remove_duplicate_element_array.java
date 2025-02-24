package paack1;

public class remove_duplicate_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"java", "c" , "java"};
		int len=  name.length;
		for(int i=0; i<len ; i++) {
			for(int j = i+1; j<len ; j++) {
				if(name[i].equals(name[j])) {
					System.out.println("duplicate : " + name[i]);
				}
			}
		}
	}}
