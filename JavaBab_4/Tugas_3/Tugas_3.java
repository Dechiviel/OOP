class Tugas_3
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < x.length; i++)
			System.out.println("Count is: " + x[i]);

		for(int i : x)
			System.out.println("Count is: " + i);
	}
}