package models;

public class Comic extends Merchandise
{
	private int 	volumeNumber;
	private boolean colored;


	public void setVolumeNumber(int volumeNumber)
	{
		if(volumeNumber < 1 )
			throw new RuntimeException("Volume number cannot be less than 1.");
		this.volumeNumber = volumeNumber;
	}

	public void setColored(boolean colored)
	{
		this.colored = colored;
	}


	public int getVolumeNumber()
	{
		return volumeNumber;
	}

	public boolean isColored()
	{
		return colored;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				"volumeNumber:" + volumeNumber + "\n" +
						"colored:" + colored + "\n" +
						"";
	}
}
