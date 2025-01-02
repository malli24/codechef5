import java.util.*;
import java.lang.*;
import java.io.*;

class justiceday
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: Convincing powers of prosecution and defense
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Determine if the accused is convicted
        if (X >= Y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}