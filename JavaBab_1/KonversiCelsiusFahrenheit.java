import javax.swing.JOptionPane;

public class KonversiCelsiusFahrenheit
{
	public static void main (String args[])
	{
		System.out.println("Konversi suhu dari Celsius ke Fahrenheit");
		String str = JOptionPane.showInputDialog("Masukkan nilai Celsius : ");

		int celsius = Integer.parseInt(str);
		float fahrenheit = ((float)celsius * 9 / 5) + 32;
		System.out.println("Nilai Fahrenheit : " + fahrenheit);
	}
}