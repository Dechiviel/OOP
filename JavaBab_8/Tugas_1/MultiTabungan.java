public class MultiTabungan
{
	private double saldo;

	public MultiTabungan(double initsaldo)
	{
		this.saldo = initsaldo;
	}

	public double getSaldoIdr()
	{
		return this.saldo;
	}

	public double getSaldoAud()
	{
		return (this.saldo / 10000);
	}

	public double getSaldoUsd()
	{
		return (this.saldo / 9000);
	}

	public void simpanUangIdr(double jumlah)
	{
		this.saldo += jumlah;
	}

	public void simpanUangAud(double jumlah)
	{
		this.saldo += (jumlah * 10000);
	}

	public void simpanUangUsd(double jumlah)
	{
		this.saldo += (jumlah * 9000);
	}
	
	public boolean ambilUangIdr(double jumlah)
	{
		if(this.saldo >= jumlah)
		{
			this.saldo -= jumlah;
			return true;
		}
		else
			return false;
	}

	public boolean ambilUangAud(double jumlah)
	{
		if(this.saldo >= jumlah * 10000)
		{
			this.saldo -= jumlah * 10000;
			return true;
		}
		else
			return false;
	}

	public boolean ambilUangUsd(double jumlah)
	{
		if(this.saldo >= jumlah * 9000)
		{
			this.saldo -= jumlah * 9000;
			return true;
		}
		else
			return false;
	}
}