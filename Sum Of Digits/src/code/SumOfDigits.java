package code;

public class SumOfDigits {
	
	public static int add(int n)
	{
		if (n < 0)
			n *= -1;
		
		int sum = 0;
		
		do 
		{
			sum += (n % 10);
			n /= 10;
		}while(n > 0);
		
		return sum;
	}

	public static void main(String[] args)
	{
		
		System.out.println( add(12345678) );
		
	}

}
