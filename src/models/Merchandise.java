package models;

public class Merchandise
{
	int id;
	String title;
	double price;
	double weight;
	int pageNUmber;

	Shelf shelf;

	public Shelf getShelf()
	{
		return shelf;
	}

	public void setShelf(Shelf shelf)
	{
		if (shelf == null )
			throw new RuntimeException("Invalid shelf");

		this.shelf = shelf;			// Assegnamo il padre al figlio
		shelf.addMerchandise(this); 	// Assegnamo il figli al padre
		// assegnare id_esterno
	}


	public Merchandise() {}

	public Merchandise(int id, String title, double price, int weight, int pageNUmber)
	{
		this.id = id;
		this.title = title;
		this.price = price;
		this.weight = weight;
		this.pageNUmber = pageNUmber;
	}

	public void setId(int id)
	{
		if(id < 1)
			throw new RuntimeException("Merchandise id must be greater than 0");

		this.id = id;
	}

	public void setTitle(String title)
	{
		if(title == null || title.isEmpty())
			throw new RuntimeException("Merchandise title cannot be null or empty");

		this.title = title;
	}

	public void setPrice(double price)
	{
		if(price < 0.01)
			throw new RuntimeException("Merchandise price cannot be null or empty");

		this.price = price;
	}

	public void setWeight(double weight)
	{
		if(weight < 0)
			throw new RuntimeException("Merchandise weight cannot be negative");


		this.weight = weight;
	}

	public void setPageNumber(int pageNUmber)
	{
		if(pageNUmber < 1)
			throw new RuntimeException("Merchandise pageNUmber cannot be negative");

		this.pageNUmber = pageNUmber;
	}

	public int getId()
	{
		return id;
	}

	public String getTitle()
	{
		return title;
	}

	public double getPrice()
	{
		return price;
	}

	public double getWeight()
	{
		return weight;
	}

	public int getPageNUmber()
	{
		return pageNUmber;
	}


	@Override
	public String toString()
	{
		return
				"id:" + id + "\n" +
						"title:" + title + "\n" +
						"price:" + price + "\n" +
						"weight:" + weight + "\n" +
						"pageNUmber:" + pageNUmber + "\n" +
						"";
	}
}
