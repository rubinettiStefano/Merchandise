package models;

import java.util.ArrayList;

public class Shelf
{
	int id, number, items;
	String material;

	int maxItems;

	ArrayList<Merchandise> merchandise = new ArrayList<Merchandise>();


	public void addMerchandise(Merchandise m)
	{
		if (m == null || merchandise.size()>=maxItems)
			throw new RuntimeException("Newspaper not added");

		merchandise.add(m);
	}


	public int riskLevel()
	{
		double riskLevel = (this.merchWeight() / this.maxWeight()) * 100;

		if (riskLevel < 50)
			return 0;
		if (riskLevel <= 75)
			return 1;
		if (riskLevel <= 100)
			return 2;

		return 3;
	}

	public double merchWeight()
	{
		double merchWeight = 0.0;

		for (Merchandise m : merchandise)
			merchWeight += m.getWeight();


		return merchWeight;
	}

	public int getNumberOfComics()
	{
		int res = 0;

		for(Merchandise m : merchandise)
			if(m instanceof Comic)
				res++;

		return res;
	}

	public ArrayList<Comic> getComics()
	{
		ArrayList<Comic> res =  new ArrayList<>();

		for(Merchandise m : merchandise)
			if(m instanceof Comic)
				res.add((Comic)m);

		return res;
	}

	public double maxWeight()
	{
		switch (this.material)
		{
			case "wood":
				return this.maxItems * 0.25;
			case "pvc":
				return this.maxItems * 0.75;
			case "steel":
				return this.maxItems * 1.5;
			case "adamantium":
				return this.maxItems * 50;
			default:
				throw new RuntimeException("Invalid material");
		}
	}

	public void setId(int id)
	{
		if (id < 1)
			throw new RuntimeException("ID below 1 is not valid");

		this.id = id;
	}

	public void setNumber(int number)
	{
		if (number < 1)
			throw new RuntimeException("Number below 1 is not valid");

		this.number = number;
	}

	public void setMaterial(String material)
	{
		if (material == null || "".equals(material))
			throw new RuntimeException("Material below 1 is not valid");

		this.material = material;
	}

	public void setMaxItems(int maxItems)
	{
		if (maxItems < 1)
			throw new RuntimeException("Max items below 1 is not valid");

		this.maxItems = maxItems;
	}

	public int getId()
	{
		return id;
	}

	public int getNumber()
	{
		return number;
	}

	public String getMaterial()
	{
		return material;
	}

	public int getMaxItems()
	{
		return maxItems;
	}
}
