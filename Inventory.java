package Pack;

import java.util.Scanner;

public class Inventory
{
	String pname;
	Float price;
	int quantity;
	Scanner s;
	static String banner ="welcome to IMS";
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("enter name");
		pname= s.next();
		System.out.println("Price ");
		price= s.nextFloat();
		System.out.println("quantity ");
		quantity= s.nextInt();
		
	}
	void show()
	{
		System.out.println(pname +" "+ price+" "+quantity);
	}
	
	void  discount()
	{
		if(price>3000)
		 System.out.println("Discount is 10%");
		 else
			 System.out.println("Discount is 9%");
	}
	static void dbanner()
	{
		System.out.println(banner);
	}
	
	
	public static void main(String[] args)
	{
		Inventory r= new Inventory();
		   r.input();
		   r.show();
		   r.discount();
		   banner();
		   
		}
		

	}


