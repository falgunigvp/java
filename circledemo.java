import java.util.*;

class circle
{
	int x,y;
	double r;
	circle(){}
	
	circle(double r)
	{
		this.r=r;
	}
	circle(int x, int y,int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public void draw()
	{
		System.out.println("Hi I Am Circle");
	}
	public double area()
	{
		return Math.PI*r*r;
	}
	public void SETR(double r)
	{
		this.r=r;
	}
	
}
class circledemo
{
	public static void main(String[] args)
	{
		circle c= new circle();
		
		c.SETR(10);
		System.out.println(""+c.area());
		circle c1=new circle(5,4,10);
		System.out.println(""+c1.area());
	}
}