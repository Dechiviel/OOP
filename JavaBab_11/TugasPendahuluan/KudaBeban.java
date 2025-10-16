public class KudaBeban extends Kuda
{
	public void lari(int kecepatan, int beban)
	{
		System.out.println("Kuda berlari dengan kecepatan " + (kecepatan - beban/5) + "km/h!");
	}
}