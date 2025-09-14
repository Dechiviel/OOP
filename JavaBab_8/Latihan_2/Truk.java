public class Truk
{
	private double muatan;
	private double muatanMaks;

	public Truk(double beratMaks)
	{
		this.muatan = 0;
		this.muatanMaks = beratMaks;
	}

	public double getMuatan()
	{
		return this.muatan;
	}

	public double getMuatanMaks()
	{
		return this.muatanMaks;
	}

	public boolean tambahMuatan(double berat)
	{
		if(this.muatanMaks >= this.muatan + berat)
		{
			this.muatan += berat;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double newtsToKilo(double berat)
	{
		return (berat * 9.8);
	}
	public double kiloToNewts(double berat)
	{
		return (berat / 9.8);
	}
}