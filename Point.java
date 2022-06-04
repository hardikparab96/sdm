
public class Point {

	  int x;
      int y;
	
	public Point()
	{
		x=0;
		y=0;
		
	}
	
	public Point(int a, int b)
	{
		x=a;
		y=b;
		
	}
	
	public Point(int a)
	{
		x=a;
		y=0;
		
	}
	
	public String toString()
	{
		String str="("+x+" , "+y+")";
		return str;
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
}
