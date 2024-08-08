import java.util.*;
class Six{

	int superior(int arr[],int n){
		int count = 1;
		for(int i=0;i<n-1;i++){
			if(arr[i]<arr[i+1]){
				count ++;
			}
		}
		return count;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println();
		System.out.print("arr = ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("the array is: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		Six s = new Six();
		int result = s.superior(arr,n);
		System.out.println("The result is: "+result);
	}
}