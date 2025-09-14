import java.text.NumberFormat;

class Latihan_1
{
	public static void main(String args[])
	{
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);		

		double nilai[][] = 	{{81, 90, 62}, 
					{50, 83, 87}, 
					{89, 55, 65}, 
					{77, 70, 92}};

		int nrp[] = {1, 2, 3, 4};

		System.out.println("NRP\tRata-rata");
		System.out.println("-------------------");
		for(int i = 0; i < nrp.length; i++)
			System.out.println(nrp[i] + "\t" + nf.format(Operasi.hitungRataRata(nilai[i])));
		System.out.println("-------------------");
	}
}