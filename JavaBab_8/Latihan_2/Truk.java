public class Truk
{
	private double muatan;
	private double muatanMaks;

	public Truk(double beratMaks)
	{
		this.muatan = 0;
		this.muatanMaks = this.kiloToNewts(beratMaks);
	}

	public double getMuatan()
	{
		return this.newtsToKilo(this.muatan);
	}

	public double getMuatanMaks()
	{
		return this.newtsToKilo(this.muatanMaks);
	}

	public boolean tambahMuatan(double berat)
	{
		berat = kiloToNewts(berat);
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
		return (berat / 9.8);
	}
	public double kiloToNewts(double berat)
	{
		return (berat * 9.8);
	}
}