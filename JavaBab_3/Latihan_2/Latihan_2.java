import javax.swing.JOptionPane;

class Latihan_2
{
	public static void main(String args[])
	{
		String inputString;
		int inputInt;

		inputString = JOptionPane.showInputDialog("Masukkan bilangan faktorial: ");
		inputInt = Integer.parseInt(inputString);

		if(inputInt < 0) 
		{
			System.out.println("Faktorial tidak valid(faktorial negatif)!");
			return;
		}
	
		System.out.println("n\t\tn!");
		System.out.println("--------------------------------");

		for(int i = 1; i <= inputInt; i++)
			System.out.println(i + "\t\t" + Operasi.Faktorial(i));
	}
}