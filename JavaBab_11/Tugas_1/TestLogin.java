public class TestLogin{
	public static void main(String arguments[]){
		Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", 6283853501388L);
		boolean result = fadilah.login(6283853501388L, "123456");
		System.out.println(result ? "Login berhasil" : "Login gagal");

		Dosen fahrul = new Dosen("fahrul","123456", 0L, "", "", "19990129");
		result = fahrul.login("fahrul", "123456", "19990129");
		System.out.println(result ? "Login berhasil" : "Login gagal");
	}
}