import java.util.*;

class Nine {

    void arrange(String inputOne, String inputTwo) {
        char[] charArrayOne = inputOne.toCharArray();
        char[] charArrayTwo = inputTwo.toCharArray();
        
        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);
        
        if (Arrays.equals(charArrayOne, charArrayTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the string: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        System.out.println("Enter the input string 1: ");
        String inputOne = sc.nextLine();
        System.out.println("Enter the input string 2: ");
        String inputTwo = sc.nextLine();
        
        if (inputOne.length() != n || inputTwo.length() != n) {
            System.out.println("Invalid input");
        } else {
            Nine nine = new Nine();
            nine.arrange(inputOne, inputTwo);
        }
    }
}
