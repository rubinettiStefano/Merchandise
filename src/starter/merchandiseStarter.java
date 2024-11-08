package starter;

import models.Book;
import models.Comic;
import models.Newspaper;
import models.Shelf;

public class merchandiseStarter
{
	public static void main(String[] args)
	{
		Shelf s = new Shelf();
		s.setId(1);
		s.setNumber(101);
		s.setMaterial("pvc");
		s.setMaxItems(4);

		Newspaper n1 = new Newspaper();
		n1.setId(2);
		n1.setTitle("Il Bug 24 Ore");
		n1.setWeight(2);
		n1.setPageNumber(1400);
		n1.setPublisher("JavissimaSpring");
		n1.setDay("07/11/2024");
		n1.setShelf(s);

		Comic c1 = new Comic();
		c1.setId(3);
		c1.setTitle("Capitan HashMap");
		c1.setWeight(0.4);
		c1.setPageNumber(80);
		c1.setVolumeNumber(2);
		c1.setColored(true);
		c1.setShelf(s);

		Comic c2 = new Comic();
		c2.setId(4);
		c2.setTitle("Iron Main");
		c2.setWeight(0.2);
		c2.setPageNumber(90);
		c2.setVolumeNumber(3);
		c2.setColored(true);
		c2.setShelf(s);

		Book b1 = new Book();
		b1.setId(5);
		b1.setTitle("Il Signore dei Modelli: return del Re");
		b1.setWeight(0.3);
		b1.setPageNumber(1500);
		b1.setAuthor("Stefano");
		b1.setGenre("Horror");
		b1.setShelf(s);

		System.out.println("IL livello di rischio deve essere 2");
		System.out.println("Il tuo è :"+s.riskLevel());


		Book b2 = new Book();
		b2.setId(6);
		b2.setTitle("OOP is OP");
		b2.setWeight(4);
		b2.setPageNumber(1500);
		b2.setAuthor("Stefano");
		b2.setGenre("Horror");

		System.out.println("Il numero di comic nel nostro shelf è "+s.getNumberOfComics());

		try
		{
			b2.setShelf(s);
			System.out.println("Sbagliato, vi ha inserito il libro nonostante lo spazio sia finito");
		}catch (Exception e)
		{
			System.out.println("Giusto, vi ha lanciato eccezione e non ha inserito il libro");
		}



	}

}
