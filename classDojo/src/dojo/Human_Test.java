package dojo;

import java.util.ArrayList;
import java.util.List;

import dojo.Human.Gender;

public class Human_Test
{
	public static void main(String[] args)
	{
		Human human = new Human(180, "Mate", Gender.MALE, 20);
		Human pony = new Human(150, "Istvan", Gender.MALE, 40);
		Human janos = new Human(210, "Janos", Gender.MALE, 70);
		List<Human> farm = new ArrayList<Human>();
		farm.add(pony);
		farm.add(janos);
		farm.add(0, human);
		for (Human huma : farm)
		{
			System.out.println(huma);
		}
		System.out.println();
		for (int i = 0; i < farm.size(); i++)
		{

			Human ember = farm.get(i);
			System.out.println(ember);
		}

	}
}
