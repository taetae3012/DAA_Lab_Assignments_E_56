package daa;

import java.util.Scanner;

public class JumpSearch {
	public static int jumpSearch(int[] arr,int x) {
		int n=arr.length;
		int step=(int )Math.floor(Math.sqrt(n));
		int prev=0;
		while(arr[Math.min(step, n)-1]<x) {
			prev=step;
			step+=(int)Math.floor(Math.sqrt(n));
			if(prev>=n) {
				return -1;
			}
		}
			while(arr[prev]<x) {
				prev++;
				if(prev==Math.min(step, n)) {
					return -1;
				}
			}
			if(arr[prev]==x) {
				return prev;
			}
		
		return -1;
	}
public static void main(String[] args) {
	/*int arr[]= {1,3,4,35,78};
	
	int index=jumpSearch(arr,35);
	
	System.out.println(index);*/
	 JumpSearch ob=new JumpSearch();
	   Scanner sc=new Scanner(System.in);
	   int test=sc.nextInt();
	   
	   for(int i=0;i<test;i++) {
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int j=0;j<n;j++) {
			   arr[j]=sc.nextInt();
		   }
		   int x=sc.nextInt();
		   int result=ob.jumpSearch(arr,x);
		   if(result==-1) {
			   System.out.println("Not Present");
			   
		   }
		   else {
		  System.out.println("Present"+result);
		   }
	   }
}
}
