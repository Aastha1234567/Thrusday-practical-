package fiboRevThread;

public class Main{
	public static void main(String[] args) {
		
		Fibonacci fibo = new Fibonacci();
		Reverse rev = new Reverse();
		
		 fibo.start();
		
		rev.start();

	}

}
