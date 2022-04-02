//Write java program to find the largest element in an array
package Assignment3;
public class smallelement {
	public static void main(String[] args) {
		
	
	int[] arr=new int[] {20,5,50,97,77};
	int min=arr[0];
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] < min)
			min=arr[i];
		
	}
	System.out.println("Largest element present in given array:" + min);
	
}

}



