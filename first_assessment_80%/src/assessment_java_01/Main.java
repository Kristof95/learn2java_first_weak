package assessment_java_01;

public class Main
{

	public static void main(String[] args)
	{
		CheckerBoard.printBoard(3);
		CheckPassFail.PrintResult(49);
		CheckPassFail.PrintResult(50);
		CheckPassFail.PrintResult(51);
		Rectangular rect1 = new Rectangular(30, 40);
		Rectangular rect2 = new Rectangular(20, 40);
		rect1.if_less(rect2);		
	}

}
