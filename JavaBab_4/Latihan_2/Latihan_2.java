import javax.swing.JOptionPane;

class Latihan_2
{
	public static void main(String args[])
	{
		int fibonacci[] = new int[20];

		String input = JOptionPane.showInputDialog("Masukkan jumlah deret Fibonacci");
		int deret = Integer.parseInt(input);

		Operasi.Fibonacci(fibonacci, deret);
		for(int i = 0; i < deret && i < fibonacci.length; i++)
		{
			System.out.print(fibonacci[i] + " ");
		}
	}
}