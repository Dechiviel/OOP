public class Operasi
{
	public static void gantiNamaKeluarga(StringBuffer nama_1, StringBuffer nama_2)
	{
		String[] partikelNama_1 = nama_1.toString().split(" ");
		String[] partikelNama_2 = nama_2.toString().split(" ");

		StringBuffer namaBaru_1 = new StringBuffer();
		StringBuffer namaBaru_2 = new StringBuffer();
		
		int panjangNama_1 = nama_1.length();
		int panjangNama_2 = nama_2.length();

		if(partikelNama_1.length < 2 || partikelNama_2.length < 2) 
			return;

		for(int i = 0; i < partikelNama_1.length - 1; i++)
		{
			namaBaru_1.append(partikelNama_1[i]);
			namaBaru_1.append(" ");
		}
		namaBaru_1.append(partikelNama_2[partikelNama_2.length - 1]);

		for(int i = 0; i < partikelNama_2.length - 1; i++)
		{
			namaBaru_2.append(partikelNama_2[i]);
			namaBaru_2.append(" ");
		}
		namaBaru_2.append(partikelNama_1[partikelNama_1.length - 1]);

		nama_1.replace(0, panjangNama_1, namaBaru_1.toString());
		nama_2.replace(0, panjangNama_2, namaBaru_2.toString());
	}
}