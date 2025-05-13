package Array;

public class LargestAndLeastArray {

	public static void main(String[] args) {
		int[] num= {42,10,55,79,23,54};
		int max=num[0];
		int min=num[0];
		for(int a:num) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println("Largest array element is "+max);
		for(int b:num) {
			if(b<min) {
				min=b;
			}
		}
		System.out.println("Least array element is "+min);
	}

}
