import javax.swing.JOptionPane;

public class Tugas_1
{
	public static void main(String args[])
	{
		int[] pos = new int[100];
		String kalimat = JOptionPane.showInputDialog("Masukkan kalimat");

		String inputKarakter = JOptionPane.showInputDialog("Masukkan karakter yang ingin dicari: ");
		char karakter = inputKarakter.charAt(0);

		Operasi.cariKarakter(kalimat, karakter);
	}
}