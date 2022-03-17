package Pack;

import java.util.Scanner;

public class Even
{
	int num;
	Scanner s;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the no:");
		num=s.nextInt();
	}
	
	void display()
	{
		if(num%2==0)
			System.out.println("No. is even:");
		else
			System.out.println("No. is odd:");
	}

	public static void main(String[] args)
	{
		Even e=new Even();
		e.input();
		e.display();

	}

}
