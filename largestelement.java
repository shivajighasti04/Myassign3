//Java program to print the largest element in an array
package Assignment3;
public class largestelement {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {20,5,50,97,77};
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max=arr[i];
			
		}
		System.out.println("Largest element present in given array:" + max);
		
	}

}
