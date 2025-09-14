public class Alarm
{
	public String id;
	public String description;
	public String date;
	public String time;

	public Alarm(String id, String description, String date, String time)
	{
		this.id = id;
		this.description = description;
		this.date = date;
		this.time = time;
	}

	public void run()
	{
		System.out.println("Run!");
	}

	public void terminate()
	{
		System.out.println("Terminate!");
	}

	public void snooze()
	{
		System.out.println("Snooze!");
	}
}