import java.util.*;
class Two{
	
	int largeElementOfArray(int arr[],int n){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("the maximum value is: "+max);
		return 0;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("the array is: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
			
		}
		System.out.println();
		Two t = new Two();
		t.largeElementOfArray(arr,n);
	}
}