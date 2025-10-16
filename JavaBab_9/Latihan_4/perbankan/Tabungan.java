package perbankan;

public class Tabungan
{
	protected int saldo = 0;

	public Tabungan(int saldo)
	{
		this.saldo = saldo;
	}

	public int getSaldo()
	{
		return this.saldo;
	}
	
	public void simpanUang(int jumlah)
	{
		saldo += jumlah;
	}

	public boolean ambilUang(int jumlah)
	{
		if (saldo >= jumlah) 
		{
			saldo -= jumlah;
			return true;
		}
		else
			return false;
	}
}
