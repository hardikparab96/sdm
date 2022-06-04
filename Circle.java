
public class Circle {

	Point center;
	int radius;
	
	public Circle()
	{
		center= new Point(0,0);
		radius=5;
	}
	
	public Circle(int a, int b)
	{
		center= new Point(a,b);
		radius=1;
	
	}
	
	public Circle(int a, int b, int c)
	{
		center= new Point(a,b);
		radius=c;
	}
	
	

	

	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}






	//void print()
	{
		//System.out.print("center("+centerX+","+centerY+") radius:"+radius);
	}
	
	
	public String toString() {
		String str="center"+center+"radius:"+radius+
				"\n"+"area:"+(float)(3.14*radius*radius);
		
		return str;

	}
	
	
	
	
	
	
	
	
	
	
}
