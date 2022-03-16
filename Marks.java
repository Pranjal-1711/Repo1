package Pack;

import java.util.Scanner;

public class Marks

{
	int marks;
	String result;
	Scanner s;


void marks()
{
	s=new Scanner(System.in);
	System.out.println("Enter the marks:");
	marks=s.nextInt();
}
void checkmarks()
{
	result= (marks>40)? ("Pass"): ("Fail");
	System.out.println(result);
}
	

	public static void main(String[] args)
	{
		Marks r=new Marks();
		r.marks();
		r.checkmarks();
	}

}
