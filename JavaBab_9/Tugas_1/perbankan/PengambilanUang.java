package perbankan;

public class PengambilanUang extends Tabungan
{
	private double proteksi;

	public PengambilanUang(int saldo)
	{
		this(saldo, 0);
	}
	
	public PengambilanUang(int saldo, double proteksi)
	{
		super(saldo);
		this.proteksi = proteksi;
	}

	public double cekUang()
	{
		return (this.saldo * (1 + this.proteksi));
	}

	public boolean ambilUang(int jumlah)
	{
		if(this.saldo >= jumlah + this.proteksi)
		{
			this.saldo -= jumlah;
			return true;
		}
		else
		{
			return false;
		}
	}
}