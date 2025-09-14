import javax.swing.JOptionPane;

class Tugas_1
{
	public static void main(String args[])
	{
		int[][] arrayOfInts = 	{{ 32, 87, 3, 589 }, 
					{ 12, 1076, 2000, 8 },
					{ 622, 127, 77, 955 }};

		String input = JOptionPane.showInputDialog("Masukkan angka yang ingin dicari dalam array");
		int target = Integer.parseInt(input);

		int[] pos = Operasi.cariPosisi(arrayOfInts, target);

		if(pos[0] < 0 || pos[1] < 0) 
			System.out.println(target + " tidak ditemukan dalam array");
		else 
			System.out.println(target + " ditemukan dalam array, posisi: " + pos[0] + ", " + pos[1]);
	}
}