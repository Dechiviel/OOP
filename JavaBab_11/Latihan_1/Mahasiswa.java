public class Mahasiswa extends User
{
	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa()
	{
		this("", "");
	}

	public Mahasiswa(String username, String password)
	{
		super(username, password);
		this.kelas = "";
	}

	public Dosen getDosenWali()
	{ return this.dosenWali; }
	
	public void setDosenWali(Dosen dosenWali)
	{ this.dosenWali = dosenWali; }

	public String getKelas()
	{ return this.kelas; }

	public void setKelas(String kelas)
	{ this.kelas = kelas; }
}