public class Operasi
{
	public static void Fibonacci(int arr[], int deret)
	{
		int length = arr.length;

		if(deret <= 0 && length <= 0) 
			return;

		if(deret > 0 && length > 0)
			arr[0] = 0;

		if(deret > 1 && length > 1)
			arr[1] = 1;

		if(deret > 2&& length > 2 )
			arr[2] = 1;

		for(int i = 3; i < deret && i < length; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
	}
}