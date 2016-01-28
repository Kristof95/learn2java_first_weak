package movies;

public class Person
{

	String firstName;
	String lastName;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;

	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe)
	{

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;

	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Gender getGender()
	{
		return this.gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public boolean isHasOscar()
	{
		return this.hasOscar;
	}

	public void setHasOscar(boolean hasOscar)
	{
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe()
	{
		return this.hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe)
	{
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString()
	{
		String resultfirstname = Tools.toXMLTag("firstname", this.firstName);
		String resultlastname = Tools.toXMLTag("lastname", this.lastName);
		String resultgender = Tools.toXMLTag("gender", this.gender.toString());
		String resulthasoscar = Tools.toXMLTag("hasoscar", String.valueOf(this.hasOscar));
		String resultgoldenglobe = Tools.toXMLTag("hasgoldenglobe", String.valueOf(this.hasGoldenGlobe));
		String result = Tools.toXMLTag("person", resultfirstname + resultlastname + resultgender + resulthasoscar + resultgoldenglobe);
		return result;
	}

}
