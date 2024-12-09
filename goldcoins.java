import java.lang.*;
import java.util.*;
class goldcoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int coins;
	    if(x>y)
	    {
	        coins=a;
	    }
	        else{
	       coins=b;	
	        }
	        System.out.println(coins);
	    }
}
