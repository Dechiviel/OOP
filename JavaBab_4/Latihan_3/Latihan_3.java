import javax.swing.JOptionPane;

class Latihan_3
{
	public static void main(String args[])
	{
		String input = JOptionPane.showInputDialog("Masukkan bilangan prima");
		int bil = Integer.parseInt(input);
		
		if(Operasi.cekPrima(bil))
			System.out.println("Bilangan " + bil + " adalah prima");
		else
			System.out.println("Bilangan " + bil + " bukan prima");
	}
}