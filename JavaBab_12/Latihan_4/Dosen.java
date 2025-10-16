public class Dosen extends Orang
{
	private int nip;

	public Dosen(String nama)
	{
		this(nama, 0, 0);
	}
	
	public Dosen(String nama, int nip)
	{
		this(nama, nip, 0);
	}

	public Dosen(String nama, int nip, int umur)
	{
		super(nama, umur);
		this.nip = nip;
	}

	public void Info()
	{
		System.out.println("Nama\t: " + (this.nama != null ? this.nama : "-"));
		System.out.println("NIP\t: " + (this.nip != 0 ? this.nip : "-"));
		System.out.println("Umur\t: " + (this.umur != 0 ? this.umur : "-"));
	}
}