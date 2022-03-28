package Pack;

import java.util.Scanner;

public class Vowel 
{
	char ch;
	Scanner s;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=s.next().charAt(0);
	}
	
	void display()
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			System.out.println("Character is vowel");
		else
			System.out.println("Character is consonant");
	}
	
	public static void main(String[] args)
	{
		Vowel v=new Vowel();
		v.input();
		v.display();
	}

}
