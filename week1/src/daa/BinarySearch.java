package daa;
import java.util.Scanner;
//Program for the binary search algorithm
//algo is right working problem is in the main loop
//firstly committed the program week2 remainning
//whole thing is not pushed to the github.

public class BinarySearch {
	
	int binarysearch(int arr[],int l,int r,int x) {
		if(r>=l) {
			int mid =1+(r-l)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				return binarysearch(arr,l,mid-1,x);
			}
			return binarysearch(arr,mid+1,r,x);
		}
		return -1;
	}
	
	
   public static void main(String[] args) {
	   BinarySearch ob=new BinarySearch();
	   Scanner sc=new Scanner(System.in);
	   int test=sc.nextInt();
	   
	   for(int i=0;i<test;i++) {
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int j=0;j<n;j++) {
			   arr[j]=sc.nextInt();
		   }
		   int x=sc.nextInt();
		   int result=ob.binarysearch(arr,0,n-1,x);
		   if(result==-1) {
			   System.out.println("Not Present");
		   }
		   else {
			   System.out.println("Present"+result);
		   } 
		   
	   }
			   
	 
	   
	  
	
	   
}
}
