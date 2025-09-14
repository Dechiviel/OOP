public class Operasi
{
	public static double hitungRataRata(double arr[])
	{
		double hasil = 0;
		double length = arr.length;

		for(int i = 0; i < length; i++)
		{
			hasil += (double)arr[i];
		}

		return hasil/length;
	}
}