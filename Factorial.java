package Pack;

import java.util.Scanner;

public class Factorial
{
	int n;
	Scanner s;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the no.");
		n=s.nextInt();
	}
	
	void display()
	{
		int fact=1;
		for(int i=n; i>0; i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of the no. is:"+ fact);
	}
	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		f.input();
		f.display();
	}

}
