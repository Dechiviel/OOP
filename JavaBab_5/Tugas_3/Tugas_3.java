import javax.swing.JOptionPane;

class Tugas_3
{
	public static void main(String args[])
	{
		String input = JOptionPane.showInputDialog("Masukkan kalimat");
		
		System.out.println("Hasil convert adalah " + Operasi.convert(input));
	}
}