
public class OddNumbers 
{

	public static void main(String[] args)
	{
		int number = 20;
		//method calling
		System.out.println("Odd Numbers Between 1 to 20:");
		for(int i=1; i<=20; i++)
		{
			//logic to check if number id odd or not
			//if i%2 is not equal to zero, then the number is odd
			if(i%2 !=0)
			{
				System.out.print(i + " ");
			}
		}

	}

}
