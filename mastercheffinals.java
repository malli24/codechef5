import java.util.*;
import java.lang.*;
import java.io.*;

class mastercheffinals
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: Number of test cases
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            // Input: Current rank of Chef
            int X = scanner.nextInt();

            // Check if Chef made it to the top 10
            if (X <= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}