public class Mahasiswa extends User
{
	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa()
	{
		this(null, null, 0L, null, null);
	}

	public Mahasiswa(String username)
	{
		this(username, null, 0L, null, null);
	}

	public Mahasiswa(String username, String password)
	{
		this(username, password, 0L, null, null);
	}

	public Mahasiswa(String username, String password, long phone)
	{
		this(username, password, phone, null, null);
	}

	public Mahasiswa(String username, String password, long phone, Dosen dosenWali)
	{
		this(username, password, phone, dosenWali, null);
	}

	public Mahasiswa(String username, String password, long phone, Dosen dosenWali, String kelas)
	{
		super(username, password, phone);
		this.dosenWali = dosenWali;
		this.kelas = kelas;
	}	
}