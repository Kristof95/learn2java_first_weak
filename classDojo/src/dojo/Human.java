package dojo;

public class Human
{
	enum Gender
	{
		MALE, FEMALE
	}

	int height;
	String name;
	Gender gender;
	int age;

	public Human(int height, String name, Gender gender, int age)
	{
		this.height = height;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		return "magasssag: " + height + " nev: " + name + " neme: " + gender + " kor: " + age;
	}
}
