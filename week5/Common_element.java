package week5;
import java.util.Scanner;

public class Common_element {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int b[]=new int[m];
	for(int i=0;i<m;i++) {
		b[i]=sc.nextInt();
	}
	int i=0,j=0;
	while(i<m && j<n) {
		if(a[i]==b[j]) {
			System.out.println(a[i]+ " ");
			i++;j++;
		}
		else if(a[i]<b[j])
			i++;
		else
			j++;
	}
}
}
