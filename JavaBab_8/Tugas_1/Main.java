class Main
{
	public static void main(String args[])
	{
		boolean status;

		System.out.println("Init saldo dengan jumlah Rp50.000 IDR");
		MultiTabungan tabungan = new MultiTabungan(50000);
		System.out.println("Saldo dalam IDR: " + tabungan.getSaldoIdr() + "\n");

		System.out.println("Simpan uang sebanyak 4$ AUD");
		tabungan.simpanUangAud(4);
		System.out.println("Saldo dalam AUD: " + tabungan.getSaldoAud() + "\n");

		System.out.println("Ambil uang sebanyak 11$ USD");
		status = tabungan.ambilUangUsd(11);
		if(status)
			System.out.println("Berhasil.");
		else 
			System.out.println("Gagal.");
		System.out.println("Saldo dalam USD: " + tabungan.getSaldoUsd() + "\n");

		System.out.println("Simpan uang sebanyak Rp100.000 IDR");
		tabungan.simpanUangIdr(100000);
		System.out.println("Saldo dalam IDR: " + tabungan.getSaldoIdr() + "\n");

		System.out.println("Ambil uang sebanyak 4$ USD");
		status = tabungan.ambilUangUsd(4);
		if(status)
			System.out.println("Berhasil.");
		else 
			System.out.println("Gagal.");
		System.out.println("Saldo dalam USD: " + tabungan.getSaldoUsd() + "\n");

		System.out.println("Ambil uang sebanyak 5$ AUD");
		status = tabungan.ambilUangAud(5);
		if(status)
			System.out.println("Berhasil.");
		else 
			System.out.println("Gagal.");
		System.out.println("Saldo dalam AUD: " + tabungan.getSaldoAud() + "\n");
	}
}