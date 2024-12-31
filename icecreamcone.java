import java.util.*;
import java.lang.*;
import java.io.*;

class icecreamcone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: Number of cones and ice cream scoops
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the maximum number of ice cream cones Chef can make
        int maxCones = Math.min(X, Y);

        // Output the result
        System.out.println(maxCones);

        scanner.close();
    }
}
