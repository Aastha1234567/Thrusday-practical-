import java.util.Scanner;
public class Operations
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a = sc.nextInt();
		System.out.println("Enter the number b:");
		int b = sc.nextInt();
		System.out.println("Enter the operators : + , - , * , / , %");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		case '%' : System.out.println(a%b);
		break;
		default : System.out.println("This is not operator");
		}
		
	}

}
