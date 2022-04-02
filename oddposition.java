//writw a java program to print the elements of an array present on odd position
package Assignment3;

public class oddposition {
	public static void main(String[] args) {
		
	
	
	int[] arr=new int[] {2,5,4,8,7};
	System.out.println("Element of given array present on odd position:");
	
	for(int i=0; i<arr.length; i=i+2) {
		System.out.println(arr[i]);
	}



	}
}


