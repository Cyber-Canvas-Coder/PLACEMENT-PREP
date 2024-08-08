import java.util.*;

class Ten {

    int equilibrium(int arr[], int n) {
        int sumRight;
        int sumLeft;
        for (int i = 0; i < n; i++) {
            sumRight = 0;
            sumLeft = 0;

            // Calculate right sum
            for (int j = i + 1; j < n; j++) {
                sumRight += arr[j];
            }
           

            // Calculate left sum
            for (int k = i - 1; k >= 0; k--) {
                sumLeft += arr[k];
            }
            
            // Check for equilibrium
            if (sumRight == sumLeft) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        System.out.print("arr = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        Ten t = new Ten();
        int equilibriumIndex = t.equilibrium(arr, n);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
