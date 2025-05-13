package Array;

public class CharArray {

	public static void main(String[] args) {
		char[] name= {'K','e','e','r','t','h','a','n','a',' ','D','a','s'};
		System.out.println("Capital Letters:");
		for(int a=0;a<name.length;a++) {
			if(Character.isUpperCase(name[a])) {
				System.out.print(name[a]+" ");
			}
			
		}
		System.out.println();
		System.out.println("My name");
		for(int b=0;b<name.length;b++) {
		System.out.print(name[b]);
	}
		System.out.println();
		System.out.println("Lower case");
		for(int c=0;c<name.length;c++) {
			if(Character.isLowerCase(name[c])) {
				System.out.print(name[c]+" ");
			}
		}
		System.out.println();
		System.out.println("Remove space");
		for(int d=0;d<name.length;d++) {
			if(!Character.isSpace(name[d])) {
				System.out.print(name[d]);
			}
		}	
	}
}