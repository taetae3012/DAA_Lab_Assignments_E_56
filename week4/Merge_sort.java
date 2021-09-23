package week4;

import java.util.Scanner;

public class Merge_sort {
	
	static void mergeSort(int []arr,int l,int r,int c,int in) {
		if(l<r) {
			int m=l-(l-r)/2;
			mergeSort(arr,l,m,c,in);
			mergeSort(arr,m+1,r,c,in);
			merge(arr,l,m,r,c,in);
		}
	}
		static void merge(int []arr,int l,int m,int r,int c,int in) {
			int n1=m-l+1;
			int n2=r-m;
			
			int []L=new int[n1];
			int []R=new int[n2];
			
			for(int i=0;i<n1;i++) {
				L[i]=arr[l+i];
			}
			for(int j=0;j<n2;j++) {
				R[j]=arr[m+1+j];
			}
			
			int a=0,x=0,k=l;
			while(a<n1&& x<n2) {
				c++;
				if(L[a]<=R[x]) {
					arr[k++]=L[a++];
				}
				else {
					arr[k++]=R[x++];
					in+=n1-a;
				}
			}
			while(a<n1) {
				arr[k++]=L[a++];
			}
			while(x<n2){
				arr[k++]=R[x++];
			}
			
			
		}
  
public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int c=0,in=0;
	    int n=sc.nextInt();
	    for(int j=0;j<n;j++) {
	    int m=sc.nextInt();
	    int arr[]=new int[m];
	    
	    for(int i=0;i<m;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    mergeSort(arr,0,m-1,c,in);
	    for(int i=0;i<m;i++) {
	    	System.out.print(arr[i]+ " ");
	    }
	    System.out.println("comparisons" + c);
	    System.out.println("inversions"+ in);
	    }  
	  sc.close();  
	}
}
