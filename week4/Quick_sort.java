package week4;

import java.util.Scanner;

public class Quick_sort {
	
	static void swap(int n1,int n2) {
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		
	}
	
	static int partition(int arr[],int l,int r,int c,int s) {
		int x=(int)(Math.random()%(r-l+1)+1);
		swap(arr[x],arr[r]);
		int p=arr[r];
		int i,j=0;
		for(i=l-1;j<r;j++) {
			j=l;
			c++;
			if(arr[j]<p) {
				i++;
				s++;
				swap(arr[i+1],arr[r]);
			}
		}
			swap(arr[i+1],arr[r]);
			return (i+1);
		}
	
	static void quickSort(int []arr,int l,int r,int c,int s) {
		if(l<r) {
			int p=partition(arr,l,r,c,s);
			quickSort(arr,l,p-1,c,s);
			quickSort(arr,p+1,r,c,s);
		}
	}

public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int c=0,s=0;
	    int n=sc.nextInt();
	    for(int j=0;j<n;j++) {
	    int m=sc.nextInt();
	    int arr[]=new int[m];
	    
	    for(int i=0;i<m;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    quickSort(arr,0,m-1,c,s);
	    for(int i=0;i<m;i++) {
	    	System.out.print(arr[i]+ " ");
	    }
	    System.out.println("comparisons" + c);
	    System.out.println("swaps"+ s);
	    }  
	  sc.close();  
	}
}
