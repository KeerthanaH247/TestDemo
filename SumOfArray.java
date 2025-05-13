package Array;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0;
		int[] num= {12,15,20,25,30};
		
		for(int a:num) {
			sum+=a;
		}
		System.out.println("Sum of array elements:"+sum);
	}

}
