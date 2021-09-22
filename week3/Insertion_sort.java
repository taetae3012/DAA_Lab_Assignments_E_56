package week3;

public class Insertion_sort {
	  static int comp=0;
	 static  int shift=0;

	
		static void insertionSort(int []arr,int n) {
			int temp=0,j=0;
			for(int i=1;i<n;i++) {
				j=i;
				shift++;
			while(j>0&&arr[j-1]>arr[j]) {
				if(arr[j-1]>arr[j]) {
					comp++;
					shift++;
				}
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		}
		
	public static void main(String[] args) {
		int []arr= {-23,65,-31,76,46,89,45,32};
		int n=arr.length;
		insertionSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " " );			
		}
		System.out.println("\ncomparisons="+ comp);
		System.out.println("shifts="+ shift);
		
	}
	}



