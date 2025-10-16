public class Dosen extends User
{
	private String pangkat;
	private String golongan;
	private String key;

	public Dosen()
	{
		this("", "");
	}

	public Dosen(String username, String password)
	{
		super(username, password);
		this.pangkat = "";
		this.golongan = "";
		this.key = "";
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
		if(super.getUsername().equals(username) && super.getPassword().equals(password) && this.key.equals(key))
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
		if((super.getPhone() == phone) && super.getPassword().equals(password) && this.key.equals(key))
			return true;
		else
			return false;
	}

	public String getPangkat()
	{ return this.pangkat; }

	public void setPangkat(String pangkat)
	{ this.pangkat = pangkat; }

	public String getGolongan()
	{ return this.golongan; }
	
	public void setGolongan(String golongan)
	{ this.golongan = golongan; }

	public String getKey()
	{ return this.key; }

	public void setKey(String key)
	{ this.key = key; }
}