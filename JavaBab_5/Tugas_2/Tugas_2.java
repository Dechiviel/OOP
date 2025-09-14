class Tugas_2
{
	public static void main(String args[])
	{
		String str = "Selamat Datang di PENS";
		System.out.println("String awal: " + str + "\n");

		Operasi.printHurufKapital(str);
		Operasi.printHurufKecil(str);
		Operasi.printPanjangString(str);
		Operasi.printIndekString(str, "PENS");
	}
}