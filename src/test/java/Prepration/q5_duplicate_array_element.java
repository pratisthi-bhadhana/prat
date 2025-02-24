package Prepration;

public class q5_duplicate_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[]= {"jave", "c", "java"};
int len= name.length;

for(int i=0; i<len; i++) {
	for(int j=i+1; j<len; j++) {
		if(name[i].equals(name[j])) {
			System.out.println("duplicate" + name[i]);
		}

	}}}
}
