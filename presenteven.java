//Java program to print the element of an array present on an even position
package Assignment3;
public class presenteven {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {2,5,4,8,5};
		System.out.println("Element of given array present on even position:");
		
		for(int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
