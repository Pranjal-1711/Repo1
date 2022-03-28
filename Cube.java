package Pack;

public class Cube 
{
	void display()
	{
		System.out.println("Cube of no. 1 to 5 are:");
		for(int i=1; i<=5; i++)
		{
			System.out.println(i*i*i);
		}
	}

	public static void main(String[] args)
	{
		Cube c=new Cube();
		c.display();
	}

}
