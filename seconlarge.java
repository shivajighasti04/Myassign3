//Find the second largest number in array
package Assignment3;
public class seconlarge {
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for(int i=0; i<total;i++)
			
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,5,7,8};
		int b[]= {44,66,99,77,44,55,22};
		System.out.println("Second largest:"+getSecondLargest(a,6));
		System.out.println("Second largest:"+getSecondLargest(b,7));
		
	}

}
