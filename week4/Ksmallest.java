package week4;

import java.util.Scanner;
import java.lang.Math;

public class Ksmallest {
	
	static void swap(int n1,int n2) {
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		
	}
	
	static int partition(int arr[],int l,int r) {
		int x=(int)(Math.random()%(r-l+1)+1);
		swap(arr[x],arr[r]);
		int p=arr[r];
		int i,j=0;
		for(i=l-1;j<r;j++) {
			j=l;
			if(arr[j]<p) {
				i++;
				swap(arr[i+1],arr[r]);
			}
		}
			swap(arr[i+1],arr[r]);
			return (i+1);
		}
	
	
	static int quickSort(int arr[],int l,int r,int key) {
		if(l<r) {
			int p=partition(arr,l,r);
			if(p==key)
				return arr[p];
			if(key<p)
				return quickSort(arr,l,p-1,key);
			else
				return quickSort(arr,p+1,r,key);
		}
		return 0;
	}

public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int j=0;j<n;j++) {
	    int m=sc.nextInt();
	    int arr[]=new int[m];
	    
	    for(int i=0;i<m;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int ans=quickSort(arr,0,m-1,k-1);
	    if(ans==-1)
	    	System.out.println("not present");
	    else
	    	System.out.println(ans);
	  
	    }  
	  sc.close();  
	}

}
