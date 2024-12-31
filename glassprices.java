import java.util.*;
import java.lang.*;
import java.io.*;

class glassprices
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: Prices of the plastic frame and the metal frame
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Check if the metal frame costs at most twice the price of the plastic frame
        if (Y <= 2 * X) {
            System.out.println("METAL");
        } else {
            System.out.println("PLASTIC");
        }

        scanner.close();
    }
}