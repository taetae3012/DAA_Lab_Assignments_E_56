package week3;

public class Selection_sort {
	  static int comp=0;
	 static  int swaps=0;

	
		static void selectionSort(int []arr,int n) {
			int temp=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
			         comp++;
			         if(arr[i]>arr[j]) {
			        	 temp=arr[i];
			        	 arr[i]=arr[j];
			        	 arr[j]=temp;
			         }
		}
				swaps++;
		}
		}
		
	public static void main(String[] args) {
		int []arr= {-13,65,-21,76,46,89,45,12};
		int n=arr.length;
		selectionSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " " );			
		}
		System.out.println("\ncomparisons="+ comp);
		System.out.println("swaps="+ swaps);
		
	}
	}




