public class TesMobil
{
	public static void main (String args[])
	{
		Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
		Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pickup", 1500, 2);
		Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
		Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);
	
	
		System.out.println("\nMobil 1");
		mobil1.infoMobil();

		System.out.println("\nMobil 2");
		mobil2.infoMobil();

		System.out.println("\nMobil 3");
		mobil3.infoMobil();

		System.out.println("\nMobil 4");
		mobil4.infoMobil();
	}
}