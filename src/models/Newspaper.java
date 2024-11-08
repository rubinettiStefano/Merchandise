package models;

public class Newspaper extends Merchandise
{
	private String publisher;
	private String day;

	Shelf shelf;

	public void setShelf(Shelf shelf)
	{
		if (shelf == null || shelf.comics.size()+shelf.books.size()+shelf.newspapers.size() +1 > shelf.getMaxItems())
			throw new RuntimeException("Invalid shelf");

		this.shelf = shelf;			// Assegnamo il padre al figlio
		shelf.addNewspaper(this); 	// Assegnamo il figli al padre
		// assegnare id_esterno
	}

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
