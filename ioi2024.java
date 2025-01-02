import java.util.*;
import java.lang.*;
import java.io.*;

class ioi2024
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: The date in September
        int X = scanner.nextInt();

        // Check if IOI is ongoing on the given date
        if (X >= 1 && X <= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}