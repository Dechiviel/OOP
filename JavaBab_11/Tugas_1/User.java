public class User
{
	private static String id = "0";
	private long phone;
	private String username;
	private String password;

	public User()
	{
		this(null, null, 0L);
	}

	public User(String username)
	{
		this(username, null, 0L);
	}

	public User(String username, String password)
	{
		this(username, password, 0L);
	}

	public User(String username, String password, long phone)
	{
		this.username = username;
		this.password = password;
		User.id = Integer.toString(Integer.parseInt(User.id) + 1);
		this.id = User.id;
		this.phone = phone;
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
}