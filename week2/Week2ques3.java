package daa;

import java.util.Arrays;
import java.util.Scanner;

public class Week2ques3 {
	
	static int binarysearch(int arr[],int l,int r,int x) {
		if(r>=l) {
			int mid =l+(r-l)/2;
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
	
	static void func(int arr[],int key) {
		int count=0;
		int n=arr.length;
		
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(binarysearch(arr,i+1,n-1,arr[i]+key)!=-1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	   // int n=sc.nextInt();
	   // for(int j=0;j<n;j++) {
	    int m=sc.nextInt();
	    int arr[]=new int[m];
	    
	    for(int i=0;i<m;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int key=sc.nextInt();
	    func(arr,key);
	  
	    
	    
	}

}
