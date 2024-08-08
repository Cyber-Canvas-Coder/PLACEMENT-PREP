import java.util.Scanner;

class Three {

    int find(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("The target index is: " + i);
                return i; // Return the index when the target is found
            }
        }
        System.out.println("Target not found in the array.");
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        Three t = new Three();
        t.find(arr, n, target);
    }
}
