import javax.swing.JOptionPane;

class Tugas_1
{
	public static int sekarang = 0, sebelum2 = 0, sebelum1 = 0;
	public static void main(String args[])
	{
		String inputString;
		int deret;

		inputString = JOptionPane.showInputDialog("Masukkan berapa deret Fibonacci: ");
		deret = Integer.parseInt(inputString);

		System.out.print(deret + " deret Fibonacci: ");
		Operasi.printFibonacci(deret);
	}
}