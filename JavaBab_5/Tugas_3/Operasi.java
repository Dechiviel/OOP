public class Operasi
{
	public static String convert(String input)
	{
		StringBuffer hasil = new StringBuffer();
		int panjang = input.length();
		char charAwal = Character.toLowerCase(input.charAt(0));
		char charAkhir = Character.toLowerCase(input.charAt(panjang-1));

		for(int i = 0; i < panjang; i++)
		{
			if(Character.toLowerCase(input.charAt(i)) == charAwal)
			{
				if(Character.isUpperCase(input.charAt(i)))										hasil.append(Character.toString(Character.toUpperCase(charAkhir)));
				else
					hasil.append(Character.toString(charAkhir));
			}

			else if (Character.toLowerCase(input.charAt(i)) == charAkhir)
			{
				if(Character.isUpperCase(input.charAt(i)))										hasil.append(Character.toString(Character.toUpperCase(charAwal)));
				else
					hasil.append(Character.toString(charAwal));
			}

			else 
				hasil.append(input.charAt(i));
		}

		return hasil.toString();
	}
}