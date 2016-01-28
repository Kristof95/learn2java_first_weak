package assessment_java_01;

public class Rectangular
{

	int width, height;
	public Rectangular(int width, int height)
	{
		this.width = width;
		this.height = height;
		
	}
	
	public int area(int a, int b)
	{
		return a * b;	
	}
	
	public boolean if_less(Rectangular rectangular)
	{
		if (this.area(this.width, this.height) > rectangular.area(rectangular.width, rectangular.height))
		{
			return true;
		}
		return false;
	}
}
