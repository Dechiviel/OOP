public class Tabungan
{
	int saldo;
	
	public Tabungan(int initSaldo)
	{
		saldo = initSaldo;
	}

	public void ambilUang(int jumlah)
	{
		saldo -= jumlah;
	}
}