package daa;

import java.util.Scanner;

public class Week2ques2 {
	
	public static void func(int arr[]) {
		/*boolean found=false;
		int max=arr.length-1,min=0;
		int ind=0;*/
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			int sum=arr[i];
			boolean found=false;
		
		int max=arr.length-1;
		 int min=0;
		while(min<max) {
			if(arr[min]+arr[max]<sum)
				min++;
			else if(arr[min]+arr[max]>sum)
				max--;
			else {
				found=true;
				break;
			}
		
		}
		
		if(found) {
			System.out.println((min+1)+ " " +(max+1) + " " + (i+1));
			flag=false;
		}
		
		}
		if(flag)
			System.out.println("No sequence found");
	
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
	    
	    func(arr);
	  
	    }  
	    
	}
}
