package movies;

import java.util.List;
public class Movie
{
	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast;

	public Movie(String title, Genre genre, long duration, double rate, List<Person> cast)
	{

		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
	}

	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Genre getGenre()
	{
		return this.genre;
	}

	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public long getDuration()
	{
		return this.duration;
	}

	public void setDuration(long duration)
	{
		this.duration = duration;
	}

	public double getRate()
	{
		return this.rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	public List<Person> getCast()
	{
		return this.cast;
	}

	public void setCast(List<Person> cast)
	{
		this.cast = cast;
	}

	public String toXMLString()
	{
		String resulttitle = Tools.toXMLTag("title", this.title);
		String resultgenre = Tools.toXMLTag("genre", this.genre.toString());
		String resultduration = Tools.toXMLTag("duration", String.valueOf(this.duration));
		String resultrate = Tools.toXMLTag("rate", String.valueOf(this.rate));
		//String resultcast = Tools.toXMLTag("cast", String.valueOf(this.cast));
		String result = resulttitle + resultgenre + resultduration + resultrate;
		return Tools.toXMLTag("movie", result);

	}

}
