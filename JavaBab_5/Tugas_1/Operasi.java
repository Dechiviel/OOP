public class Operasi
{
	public static void cariKarakter (String kalimat, char karakter)
	{
		int j = 0;

		System.out.print("Ditemukan di indeks: ");
		for(int i = 0; i < kalimat.length(); i++)
		{
			if(Character.toLowerCase(kalimat.charAt(i)) == Character.toLowerCase(karakter))
			{
				if(j != 0)
				{
					System.out.print(", ");
				}

				System.out.print(i);
				j++;

			}
		}

		if(j == 0)
		{
			System.out.print("-");
		}
	}
}