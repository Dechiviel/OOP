public class EnkapsulasiMahasiswa
{
	private int nrp;
	private String nama;

	public EnkapsulasiMahasiswa(int nrp, String nama)
	{
		this.nrp = nrp;
		this.nama = nama;
	}

	public int getNrp()
	{
		return this.nrp;
	}

	public String getNama()
	{
		return this.nama;
	}

	public void setNrp(int nrp)
	{
		this.nrp = nrp;
	}

	public void setNama(String nama)
	{
		this.nama = nama;
	}
}