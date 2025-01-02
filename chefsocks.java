import java.util.*;
import java.lang.*;
import java.io.*;

class chefsocks {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        // Input: Cost of the socks, amount saved by Chef, and amount given by parents
        int A = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the total amount of money Chef has
        int totalMoney = X + Y;

        // Determine if Chef can afford the socks
        if (totalMoney >= A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}