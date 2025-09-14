import javax.swing.JOptionPane;

class Tugas_5
{
	public static void main(String args[])
	{
		String utama = JOptionPane.showInputDialog("Masukkan kalimat utama");
		String target = JOptionPane.showInputDialog("Masukkan kalimat yang ingin diganti");
		String pengganti = JOptionPane.showInputDialog("Masukkan kalimat pengganti diganti");

		Operasi.printGantiString(utama, target, pengganti);
	}
}