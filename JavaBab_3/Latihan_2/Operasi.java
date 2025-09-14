public class Operasi
{
	public static int Faktorial(int  n)
	{
		if (n < 0) return -1;

		int hasil = 1;
		for(int i = 1; i <= n; i++)
		{
			hasil *= i;
		}
		return hasil;
	}
}