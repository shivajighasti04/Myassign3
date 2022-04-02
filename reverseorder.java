//Java program to print the element of an array in reverse order
package Assignment3;

public class reverseorder {
	public static void main(String[] args) {
		int[]  arr=new int[] {1,2,3,4,5,6,7,8};
		System.out.println("Original array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i] +"");
			
		}
		
	}

	}
