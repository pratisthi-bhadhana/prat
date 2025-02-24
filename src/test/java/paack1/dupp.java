package paack1;

public class dupp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = new String ("Automation");
int count = 0;
char[] ch =str.toCharArray();

System.out.println("duplicates are");

for(int i=0; i<ch.length; i++){
	for(int j=i+1; j<ch.length;j++) {
		if(ch[i]==ch[j]) {
			System.out.println(ch[j]);
			count++;
			ch[j]='\0';
		}
	}
}

	}

}
