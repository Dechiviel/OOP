public class Operasi
{
	public static void printFibonacci(int jumlah)
	{
		for(int i = 0; i < jumlah; i++)
		{
			if (i == 0)
			{
				Tugas_1.sebelum2 = 0;
				System.out.print(Tugas_1.sebelum2 + " ");
			}
			else if(i == 1)
			{
				Tugas_1.sebelum1 = 1;
				System.out.print(Tugas_1.sebelum1 + " ");
			}
			else if(i == 2)
			{
				Tugas_1.sekarang = 1;
				System.out.print(Tugas_1.sekarang + " ");
			}
			else if(i < 0)
			{
				System.out.print("Deret Fibonacci tidak valid!");
			}
			else 
			{
				Tugas_1.sebelum1 = Tugas_1.sekarang;
				Tugas_1.sebelum2 = Tugas_1.sebelum1;
				Tugas_1.sekarang = Tugas_1.sebelum1 + Tugas_1.sebelum2;
				System.out.print(Tugas_1.sekarang + " ");
			}
		}
	}
}