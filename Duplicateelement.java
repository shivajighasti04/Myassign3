//Write a java program to print the duplicate element of an array
package Assignment3;
public class Duplicateelement {
	
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,3,2,8,9,8,5};
		System.out.println("Duplicate element in given array: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
