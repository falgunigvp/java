import java.util.*;
abstract class shape2d
{
	abstract public void draw();
	abstract public double area();
}

class circle extends shape2d
{
	double r;
	public void draw()
	{
		System.out.println("Hello i a circle");
	}
	public double area()
	{
		return Math.PI*r*r;
	}
}
class shape2ddemo
{
		public static void main (String [] args)
		{
			circle c=new circle();
			c.draw();
		}
	
}