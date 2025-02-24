package paack1;

public class largest_smallest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers []= {-100,4,-50,-986,-98765};
		int largest=0;
		int smallest=0;
		for(int i=1; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest= numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest= numbers[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
