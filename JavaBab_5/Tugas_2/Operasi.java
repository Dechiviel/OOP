public class Operasi
{
	public static void printHurufKapital(String str)
	{
		System.out.println("Huruf kapital\t\t: " + str.toUpperCase());
	}

	public static void printHurufKecil(String str)
	{
		System.out.println("Huruf kecil\t\t: " + str.toLowerCase());
	}

	public static void printPanjangString(String str)
	{
		System.out.println("Panjang string adalah\t: " + str.length());
	}
	
	public static void printIndekString(String str, String target)
	{
		System.out.println("Indek " + target + " dalam string adalah: " + str.indexOf(target));
	}
}