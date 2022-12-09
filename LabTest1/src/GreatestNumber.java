import java.util.Scanner;
public class GreatestNumber
{
   public static void main(String[] args)
  {
	   //taking input from the user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number a:");
	int a = sc.nextInt();
	System.out.println("Enter number b:");
	int b = sc.nextInt();
	System.out.println("Enter number c:");
	int c = sc.nextInt();
	//comparing a with b and then again comparing a with c
	// if a is greater than b and c then a is greatest
	if(a>b && a>c)
	{
		System.out.println(a + " is greatest:");
	}
	//comparing b with a and then again comparing b with c
	//if b is greater than a and c then b is greatest
	else if (b>a && b>c)
	{
		System.out.println(b + " is greatest:");
	}
	//comparing c with a and then again comparing c with b
		//if c is greater than a and b then c is greatest
	else if(c>a && c>b)
	{
		System.out.println(c + " is greatest:");
		
	}
	//if all a,b,c are same
	else
		System.out.println("the numbers are equal:");
  }
}
