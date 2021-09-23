package week5;

import java.util.Scanner;

public class Counting_sort {
	
	static void func(char arr[],int n) {
		int i;
		int c[]=new int[26];
		for( i=0;i<n;i++)
			c[arr[i]-'a']++;
		
		int max=0;
		for(i=1;i<26;i++) {
			if(c[i]>c[max])
				max=i;
		}
		if(c[max]==1)
		    System.out.println("No duplicates present");
		    return;
		
		    
	}
	
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int j=0;j<n;j++) {
	    String s=sc.nextLine();
	   char arr[]=s.toCharArray();
	    
	    
	    
	    func(arr,n);
	  
	    }  
	    
	}
}
