public class Mobil
{
	String merek;
	String warna;
	String jenis;
	int cc;
	int jumlah;

	public Mobil (String merekMobil, String warnaMobil, String jenisMobil, int jumlahCC, int jumlahMobil)
	{
		merek = merekMobil;
		warna = warnaMobil;
		jenis = jenisMobil;
		cc = jumlahCC;
		jumlah = jumlahMobil;
	}

	public void infoMobil()
	{
		System.out.println("Merek Mobil : " + merek);
		System.out.println("Warna Mobil : " + warna);
		System.out.println("Jenis Mobil : " + jenis);
		System.out.println("CC Mobil : " + cc);
		System.out.println("Jumlah Mobil : " + jumlah);
	}
}