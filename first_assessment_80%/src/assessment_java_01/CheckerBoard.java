package assessment_java_01;

public class CheckerBoard
{
	public static void printBoard(int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
