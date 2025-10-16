public class User
{
	private static String id = "0";
	private long phone;
	private String username;
	private String password;

	public User()
	{
		this("", "");
	}

	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
		User.id = Integer.toString(Integer.parseInt(User.id) + 1);
		this.id = User.id;
		this.phone = 0L;
	}

	public boolean login(String username, String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
			return true;
		else 
			return false;		
	}

	public boolean login(long phone, String password)
	{
		if((this.phone == phone) && this.password.equals(password))
			return true;
		else 
			return false;
	}

	public String getId()
	{ return this.id; }
	
	public void setId(String id)
	{ this.id = id; }

	public long getPhone()
	{ return this.phone; }
	
	public void setPhone(long phone)
	{ this.phone = phone; }
	
	public String getUsername()
	{ return this.username; }
	
	public void setUsername(String username)
	{ this.username = username; }

	public String getPassword()
	{ return this.password; }

	public void setPassword(String password)
	{ this.password = password; }
}