import javax.swing.JOptionPane;

class Tugas_2
{
	public static void main(String args[])
	{
		String inputString;
		int tahun;

		inputString = JOptionPane.showInputDialog("Masukkan tahun (1900 - 2005)");
		tahun = Integer.parseInt(inputString);

		if(!Operasi.apakahDalamRange(1900, 2005, tahun))
		{
			System.out.println("Maaf, input diluar range.");
			return;
		}

		if(Operasi.apakahKabisat(tahun))
		{
			System.out.println("Tahun " + tahun + " ADALAH kabisat.");
		}
		else
		{
			System.out.println("Tahun " + tahun + " BUKAN kabisat.");
		}
	}
}