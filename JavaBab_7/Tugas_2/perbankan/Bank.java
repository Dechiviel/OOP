package perbankan;

public class Bank
{
	private Nasabah[] nasabah;
	private int jumlahNasabah;
	
	public Bank()
	{
		this.nasabah = new Nasabah[100];
		this.jumlahNasabah = 0;
	}

	public void tambahNasabah(String namaAwal, String namaAkhir)
	{
		this.nasabah[this.jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
		this.jumlahNasabah++;
	}

	public int getJumlahNasabah()
	{
		return this.jumlahNasabah;
	}

	public Nasabah getNasabah(int index)
	{
		return this.nasabah[index];
	}
}