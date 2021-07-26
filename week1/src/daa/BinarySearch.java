package daa;
import java.util.Scanner;

public class BinarySearch {
	
	public static void binarysearch(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				System.out.println("Present");
				break;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Not Present");
		}
	}
	
	
   public static void main(String[] args) {
	 /*  Scanner sc=new Scanner(System.in);
	   int test=sc.nextInt();
	   int arr[]=new int[40];
	   for(int i=0;i<test;i++) {
		   int size=sc.nextInt();
		   for(int j=0;j<size;j++) {
		   arr[i]=sc.nextInt(); 
	   }
		   int first=0;
		   int last=arr.length-1;
		   int key=sc.nextInt();
		binarysearch(arr,first,last,key);
	   }
	*/
	   int arr[]= {1,23,45,78};
	   binarysearch(arr,0,3,78);
	   
}
}
