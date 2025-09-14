public class Operasi
{
	public static boolean apakahKabisat(int tahun)
	{
		if((tahun % 400 == 0 || tahun % 100 != 0) && tahun % 4 == 0)
			return true;
		else 
			return false;
	}

	public static boolean apakahDalamRange(int rangeAwal, int rangeAkhir, int n)
	{
		if (rangeAwal <= n && rangeAkhir >= n)
			return true;
		else 
			return false;
	}
}