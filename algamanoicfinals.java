import java.util.*;
import java.lang.*;
import java.io.*;

class algamanoicfinals
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: The day of March Shreyan can go to Jadavpur University
        int X = scanner.nextInt();

        // Check if Shreyan can attend the finals on March 17th
        if (X == 17) {
            System.out.println("YAY");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}