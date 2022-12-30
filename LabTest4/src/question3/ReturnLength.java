package question3;
import java.util.Scanner;

public class ReturnLength {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the line");
	        String s1 = sc.next();

	        char [] ch = s1.toCharArray();
	        for(int i=0;i< ch.length-4;i++)
	        {
	            ch[i]= 'X';
	        }
	        String s2 = new String(ch);
	        System.out.println(s2);
	    }
	}
