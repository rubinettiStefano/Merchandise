package models;

public class Newspaper extends Merchandise
{
	private String publisher;
	private String day;



	public void setPublisher(String publisher)
	{
		if(publisher.equals("") || publisher.equals("null"))
			throw new RuntimeException("Publisher cannot be empty");

		this.publisher = publisher;
	}

	public void setDay(String day)
	{
		if(day.equals("") || day.equals("null"))
			throw new RuntimeException("Day cannot be empty");

		this.day = day;
	}



	public String getPublisher()
	{
		return publisher;
	}

	public String getDay()
	{
		return day;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				"\nPublisher: " + publisher +
				"\nDay: " + day + "\n";
	}
}
