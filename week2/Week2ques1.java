package daa;
import java.util.Arrays;
import java.util.Scanner;

public class Week2ques1 {
	
	public static void func(int[] numbers,int target) {
		int flag=0;
		if(numbers==null) {
			return;
		}
		int low=0,high=numbers.length-1;
		int startIndex=-1;
		while(low<=high) {
			int mid=(high-low)/2+low;
			if(numbers[mid]>target) {
				high=mid-1;
			}else if(numbers[mid]==target) {
				startIndex=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		int endIndex=-1;
		low=0;
		high=numbers.length-1;
		while(low<=high) {
			int mid=(high-low)/2+low;
			if(numbers[mid]>target) {
				high=mid-1;
			}else if(numbers[mid]==target) {
				endIndex=mid;
				low=mid+1;
			}
			else {
				low=mid+1;
			}
		}
		
		if(startIndex!=-1 && endIndex!=-1) {
			for(int i=0;i+startIndex<=endIndex;i++) {
				//if(i>0)
					//System.out.println(',');
				//System.out.println(i+startIndex);
					flag++;
			}
		}
		System.out.println(target+ "-"+ flag );
		
	}
	
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
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
