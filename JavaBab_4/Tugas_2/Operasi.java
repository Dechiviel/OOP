public class Operasi
{
	public static int hitungBanyakA(char[] arr)
	{
		int jumlah = 0;

		for(int i = 0; i < arr.length; i++)
			if(arr[i] == 'a') 
				jumlah++;

		return jumlah;
	}
}