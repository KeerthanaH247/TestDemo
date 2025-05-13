package Array;

public class ArrayNumberPrograms {

	public static void main(String[] args) {
		int[] i= {23,7,4,43,29,5,66,9,1,10};
		System.out.println("Array Traversal");
		for (int j=0;j<i.length;j++) {			
			System.out.println(i[j]);
	}
		System.out.println("Even Numbers");
		for(int k=0;k<i.length;k++) {
			if(i[k]%2==0) {
				System.out.println(i[k]);
			}
		}
		System.out.println("Odd numbers");
		for(int m=0; m<i.length;m++) {
			if(i[m]%2==1)
				System.out.println(i[m]);
		}
		System.out.println("Two digit number");
		for(int n=0;n<i.length;n++) {
			if(i[n]>9 && i[n]<100) {
				System.out.println(i[n]);
			}
		}
		System.out.println("Divisible by 5");
		for(int p=0;p<i.length;p++) {
			if(i[p]%5==0)
				System.out.println(i[p]);
		}
		System.out.println("Square root");
		for(int n=0;n<i.length;n++) {
			System.out.printf("%.2f\n", Math.sqrt(i[n]));//Format Specifier
		}
		System.out.println("Cube root");
		for(int q=0;q<i.length;q++) {
			System.out.printf("%.2f\n",Math.pow(i[q], 3));
		}
		System.out.println("Sum of even digits");
		int sum=0;
		for(int r=0;r<i.length;r++) {
			if(i[r]%2==0) {
				sum=sum+i[r];
			}
		}
		System.out.println("Sum="+sum);
		int sum1=0;
		System.out.println("Sum of two digit numbers");
		for(int s=0;s<i.length;s++) {
			if(i[s]>9 && i[s]<100) {
				sum1=sum1+i[s];
			}
		}
		System.out.println("sum of 2 digit numbers is:"+sum1);
		double product =1;
		System.out.println("Product of even numbers");
		for(int t=0;t<i.length;t++) {
			if(i[t]%2==0) {
			product=product*i[t];
			}
			}
		System.out.println(product);
		System.out.println("Count even numbers");
		int count=0;
		 for(int u=0;u<i.length;u++) {
			 if(i[u]%2==0) {
				 count++;
			 }
		 }
		System.out.println("There are "+count+" even numbers in an array");
		System.out.println("Maximum and Minimum ");
		int max=i[0];
		int min=i[0];
		for(int v=0;v<i.length;v++) {
			if(i[v]>max)
				max=i[v];
			if(i[v]<min)
				min=i[v];
			
		}
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
		
		
		
		
		
		
		
		
	}	
	
	
}
