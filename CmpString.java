package Pack;

import java.util.Scanner;

public class CmpString
{
	String n1,n2;
	Scanner s;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the First string:");
		n1=s.nextLine();
		System.out.println("Enter the Second string:");
		n2=s.nextLine();
	}
	
	void compare()
	{
		System.out.println(n1.compareTo(n2));
	}

	public static void main(String[] args)
	{
		CmpString c=new CmpString();
		c.input();
		c.compare();
	}

}
