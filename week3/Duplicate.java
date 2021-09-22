package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
	
	static void func(int arr[],int n) {
		int i=0,flag=0;
		Arrays.sort(arr);
		while(i<n-1) {
			if(arr[i]==arr[i+1]) {
				flag=1;break;
			}
			i++;
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
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
	    
	    func(arr,m);
	  
	    }  
	    sc.close();
	    
	}
}
