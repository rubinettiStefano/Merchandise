package models;

public class Book extends Merchandise
{
	 String author;
	private String genre;


	public void setAuthor(String author)
	{
		if(author.equalsIgnoreCase("") || author.equalsIgnoreCase("null"))
			throw new RuntimeException("Author cannot be empty");

		this.author = author;
	}

	public void setGenre(String genre)
	{
		if(genre.equalsIgnoreCase("") || genre.equalsIgnoreCase("null"))
			throw new RuntimeException("Genre cannot be empty");

		this.genre = genre;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getGenre()
	{
		return genre;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				"\nAuthor: " + author +
				"\nGenre: " + genre;

	}
}
