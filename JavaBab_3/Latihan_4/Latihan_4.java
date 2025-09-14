class Latihan_4
{
	public static void main(String args[])
	{
		for(int i = 2; i <= 20; i++)
		{
			if(Operasi.adalahGenap(i) && !Operasi.adalahKelipatan6(i))
				System.out.print(i + " ");
		}
	}
}