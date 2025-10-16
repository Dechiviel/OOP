public class Tes
{
	public static void main(String args[])
	{
		Truk truk1 = new Truk();
		truk1.setJmlRoda(4);
		truk1.setWarna("kuning");
		truk1.setBahanBakar("solar");
		truk1.setKapasitasMesin(1500);
		truk1.setMuatanMaks("1000");

		Truk truk2 = new Truk();
		truk2.setJmlRoda(6);
		truk2.setWarna("merah");
		truk2.setBahanBakar("solar");
		truk2.setKapasitasMesin(2000);
		truk2.setMuatanMaks("5000");

		Taksi taksi1 = new Taksi();
		taksi1.setJmlRoda(4);
		taksi1.setWarna("oranye");
		taksi1.setBahanBakar("bensin");
		taksi1.setKapasitasMesin(1500);
		taksi1.setTarifAwal(10000);
		taksi1.setTarifPerKm(5000);

		Taksi taksi2 = new Taksi();
		taksi2.setJmlRoda(4);
		taksi2.setWarna("biru");
		taksi2.setBahanBakar("bensin");
		taksi2.setKapasitasMesin(1300);
		taksi2.setTarifAwal(7000);
		taksi2.setTarifPerKm(3500);

		Sepeda sepeda1 = new Sepeda();
		sepeda1.setJmlRoda(3);
		sepeda1.setWarna("hitam");
		sepeda1.setJmlSadel("1");
		sepeda1.setJmlGir(2);

		Sepeda sepeda2 = new Sepeda();
		sepeda2.setJmlRoda(2);
		sepeda2.setWarna("putih");
		sepeda2.setJmlSadel("2");
		sepeda2.setJmlGir(5);

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|Objek\t\t|jmlRoda\t|warna\t\t|bahanBakar\t|kapasitasMesin\t|muatanMaks\t|\t\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("truk1")+"|" + validasiInteger(truk1.getJmlRoda()) + "|" + validasiString(truk1.getWarna()) + "|" + validasiString(truk1.getBahanBakar()) + "|" + validasiInteger(truk1.getKapasitasMesin()) + "|" + validasiString(truk1.getMuatanMaks()) + "|" + validasiString("") + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("truk2")+"|" + validasiInteger(truk2.getJmlRoda()) + "|" + validasiString(truk2.getWarna()) + "|" + validasiString(truk2.getBahanBakar()) + "|" + validasiInteger(truk2.getKapasitasMesin()) + "|" + validasiString(truk2.getMuatanMaks()) + "|" + validasiString("") + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|\t\t|\t\t|\t\t|\t\t|\t\t|tarifAwal\t|tarifPerKm\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("taksi1") + "|" + validasiInteger(taksi1.getJmlRoda()) + "|" + validasiString(taksi1.getWarna()) + "|" + validasiString(taksi1.getBahanBakar()) + "|" + validasiInteger(taksi1.getKapasitasMesin()) + "|" + validasiInteger(taksi1.getTarifAwal()) + "|" + validasiInteger(taksi1.getTarifPerKm()) + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("taksi2") + "|" + validasiInteger(taksi2.getJmlRoda()) + "|" + validasiString(taksi2.getWarna()) + "|" + validasiString(taksi2.getBahanBakar()) + "|" + validasiInteger(taksi2.getKapasitasMesin()) + "|" + validasiInteger(taksi2.getTarifAwal()) + "|" + validasiInteger(taksi2.getTarifPerKm()) + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|\t\t|\t\t|\t\t|jmlSadel\t|jmlGir\t\t|\t\t|\t\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("sepeda1") + "|" + validasiInteger(sepeda1.getJmlRoda()) + "|" + validasiString(sepeda1.getWarna()) + "|" + validasiString(sepeda1.getJmlSadel()) + "|" + validasiInteger(sepeda1.getJmlGir()) + "|\t\t|\t\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("|" + validasiString("sepeda2") + "|" + validasiInteger(sepeda2.getJmlRoda()) + "|" + validasiString(sepeda2.getWarna()) + "|" + validasiString(sepeda2.getJmlSadel()) + "|" + validasiInteger(sepeda2.getJmlGir()) + "|\t\t|\t\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
	}



	public static String validasiString(String str)
	{
		int length =  str.length();

		if(length <= 6)
		{
			return str.concat("\t\t");
		}
		else if(length <= 14)
		{
			return str.concat("\t");
		}
		else
		{
			return str;
		}
	}

	public static String validasiInteger(int integer)
	{
		String str = Integer.toString(integer);
		int length =  str.length();

		if(length <= 6)
		{
			return str.concat("\t\t");
		}
		else if(length <= 14)
		{
			return str.concat("\t");
		}
		else
		{
			return str;
		}
	}
}