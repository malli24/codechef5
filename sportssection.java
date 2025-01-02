import java.util.Scanner;

class sportssection
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        // Input: Page number
        int X = scanner.nextInt();

        // Check if the page is one of the last three pages
        if (X >= 8 && X <= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}