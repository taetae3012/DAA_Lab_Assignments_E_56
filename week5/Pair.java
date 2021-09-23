package week5;
import java.util.Arrays;
import java.util.Scanner;

public class Pair {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int flag=0;
	int test=sc.nextInt();
	for(int i=0;i<test;i++) {
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int j=0;j<n;j++) {
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		Arrays.sort(arr);
		int a=0,b=n-1;
		while(a<b) {
			int s=arr[a]+arr[b];
			if(s==sum) {
				System.out.println(arr[a]+ " "+ arr[b]);
				flag=1;
				a++;
				b--;
			}
			else if(s<sum)
				a++;
			else
				b--;
		}
		if(flag==0)
			System.out.println("No such pair exits");
		
	}
	
}
}
