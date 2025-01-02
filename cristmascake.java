import java.util.*;
import java.lang.*;
import java.io.*;

class cristmascake
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        // Input: Today's date
        int X = scanner.nextInt();

        // Calculate the number of practice cakes Chef will bake
        if (X >= 1 && X <= 24) {
            int numberOfCakes = 25 - X;
            System.out.println(numberOfCakes);
        }

        // Close the scanner
        scanner.close();
    }
}