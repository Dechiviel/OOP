public class Operasi
{
	public static void printGantiString(String utama, String target, String pengganti)
	{
		if(utama.contains(target))
		{
			String hasil = utama.replace(target, pengganti);
			System.out.println("Kalimat utama menjadi: " + hasil);
		}
		else
		{
			System.out.println("Tidak menemukan \"" + target + "\" dalam string \"" + utama + "\"");
		}
	}
}