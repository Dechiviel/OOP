import javax.swing.JOptionPane;

class Tugas_4
{
	public static void main(String args[])
	{
		StringBuffer nama_1 = new StringBuffer();
		StringBuffer nama_2 = new StringBuffer();

		nama_1.append(JOptionPane.showInputDialog("Masukkan nama lengkap pertama"));
		nama_2.append(JOptionPane.showInputDialog("Masukkan nama lengkap kedua"));

		Operasi.gantiNamaKeluarga(nama_1, nama_2);

		System.out.println("Nama 1\t: " + nama_1);
		System.out.println("Nama 2\t: " + nama_2);
	}
}