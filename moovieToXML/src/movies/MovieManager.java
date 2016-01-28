package movies;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManager
{
	public static final String FILE_PATH = "C:\\Users\\Ronai Mate\\Desktop\\eclipse_workspace\\Movies\\result.xml";
	public static void main(String[] args)
	{
		Person mate = new Person("Ronai", "Mate", Gender.MALE, true, true);
		List<Person> persons = new ArrayList<Person>();
		List<Movie> movies = new ArrayList<Movie>();
		persons.add(mate);
		Movie myfilm = new Movie("One-Punch Man", Genre.ACTION, 22, 9.5, persons);
		movies.add(myfilm);
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			StringBuffer sb = new StringBuffer();
			sb.append("<movies>");
			sb.append(myfilm.toXMLString());
			sb.append(mate.toXMLString());
			sb.append("</movies>");
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		} catch (IOException e)
		{
			System.out.println(e);
		}
	}

}