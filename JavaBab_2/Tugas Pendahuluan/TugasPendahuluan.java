public class TugasPendahuluan
{
	public static void main (String args[])
	{
		Buku novelA = new Buku();
		
		novelA.judulBuku = "Raja Iblis vol. 2";
		novelA.pengarang = "Gege Akutami";
		novelA.tahunTerbit = 2025;

		novelA.GetInformasi();
	}
}