package daa;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {
	static int exponentialSearch(int[] arr,int x) {
		int n=arr.length;
		if(arr[0]==x) {
			return 0;
			
		}
		int i=1;
		while(i<n&&arr[i]<=x)
			i=i*2;
		return Arrays.binarySearch(arr, i/2,Math.min(i, n-1),x);
	}
	public static void main(String[] args) {
		/*int arr[]= {1,3,4,35,78};
		
		int index=exponentialSearch(arr,35);
		
		System.out.println(index);*/
		 ExponentialSearch ob=new ExponentialSearch();
		   Scanner sc=new Scanner(System.in);
		   int test=sc.nextInt();
		   
		   for(int i=0;i<test;i++) {
			   int n=sc.nextInt();
			   int arr[]=new int[n];
			   for(int j=0;j<n;j++) {
				   arr[j]=sc.nextInt();
			   }
			   int x=sc.nextInt();
			   int result=ob.exponentialSearch(arr,x);
			  System.out.println(result);
			   
		   }
			
	}
}
