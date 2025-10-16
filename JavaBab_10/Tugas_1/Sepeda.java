public class Sepeda extends Kendaraan
{
	protected int jmlSadel;
	protected int jmlGir;

	public void setJmlSadel(String jmlSadel)
	{
		this.jmlSadel = Integer.parseInt(jmlSadel);
	}

	public String getJmlSadel()
	{
		return Integer.toString(this.jmlSadel);
	}

	public void setJmlGir(int jmlGir)
	{
		this.jmlGir = jmlGir;
	}

	public int getJmlGir()
	{
		return this.jmlGir;
	}
}