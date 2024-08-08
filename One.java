import java.util.*;

class One {
    String reverse(int n) {
        String result = "";
        
        while (n != 0) {
            int rem = n % 10;
            result = result + rem;
            n = n / 10; 
        }
        
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        One o = new One();
        String reversedNumber = o.reverse(n);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
