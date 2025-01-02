import java.util.*;
import java.lang.*;
import java.io.*;

class puzzlehunt
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);

        // Input: Number of people in Chef's team
        int N = scanner.nextInt();

        // Check if the team size is between 6 and 8
        if (N >= 6 && N <= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
