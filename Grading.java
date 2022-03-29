package Pack;

import java.util.Scanner;

public class Grading
{
	int marks;
	Scanner s;

	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the marks:");
		marks=s.nextInt();
		
	}
	
	void display()
	{
		if(marks<25)
			System.out.println("Grade is F:");
		else if(marks>=25 && marks<45)
			System.out.println("Grade is E:");
		else if(marks>=45 && marks<50)
			System.out.println("Grade is D:");
		else if(marks>=50 && marks<60)
			System.out.println("Grade is C:");
		else if(marks>=60 && marks<80)
			System.out.println("Grade is B:");
		else
			System.out.println("Grade is A:");
				
		
	}
	public static void main(String[] args)
	{
		Grading g=new Grading();
		g.input();
		g.display();

	}

}
