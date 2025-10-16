public class Dosen extends User
{
	private String pangkat;
	private String golongan;
	private String key;

	public Dosen()
	{
		this(null, null, 0L, null, null, null);
	}

	public Dosen(String username)
	{
		this(username, null, 0L, null, null, null);
	}

	public Dosen(String username, String password)
	{
		this(username, password, 0L, null, null, null);
	}

	public Dosen(String username, String password, long phone)
	{
		this(username, password, phone, null, null, null);
	}

	public Dosen(String username, String password, long phone, String pangkat)
	{
		this(username, password, phone, pangkat, null, null);
	}

	public Dosen(String username, String password, long phone, String pangkat, String golongan)
	{
		this(username, password, phone, pangkat, golongan, null);
	}

	public Dosen(String username, String password, long phone, String pangkat, String golongan, String key)
	{
		super(username, password, phone);
		this.pangkat = pangkat;
		this.golongan = golongan;
		this.key = key;
	}

	public boolean login(String username, String password)
	{
		if(this.login(username, password, this.key))
			return true;
		else
			return false;
	}

	public boolean login(String username, String password, String key)
	{
		if(super.login(username, password) && this.key.equals(key))
			return true;
		else
			return false;
	}

	public boolean login(long phone, String password)
	{
		if(this.login(phone, password, this.key))
			return true;
		else
			return false;
	}

	public boolean login(long phone, String password, String key)
	{
		if(super.login(phone, password) && this.key.equals(key))
			return true;
		else
			return false;
	}
}