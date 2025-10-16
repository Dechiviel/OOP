public class TesTugas2
{
	public static void main(String args[])
	{
		Katak o1 = new Katak(5, "Froggy");
		Kecebong o2 = new Kecebong(2, "Junior Frog", 10);

		System.out.println("+---------------+---------------+---------------+---------------+---------------+");

		System.out.println("| Obyek\t\t| umur\t\t| nama\t\t| panjangEkor\t| caraBergerak\t|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+");

                System.out.println("|" + validasiString("O1") + "|" + validasiInteger(o1.umur) + "|" + validasiString(o1.nama) + "|" + validasiString("") + "|" + validasiString(o1.caraBergerak()) + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+");

                System.out.println("|" + validasiString("O2") + "|" + validasiInteger(o2.umur) + "|" + validasiString(o2.nama) + "|" + validasiDouble(o2.panjangEkor) + "|" + validasiString(o2.caraBergerak()) + "|");

		System.out.println("+---------------+---------------+---------------+---------------+---------------+");

	}

	public static String validasiString(String str)
        {
                int length =  str.length();

                if(length <= 6)
                {
                        return str.concat("\t\t");
                }
                else if(length <= 14)
                {
                        return str.concat("\t");
                }
                else
                {
                        return str;
                }
        }

        public static String validasiInteger(int integer)
        {
                String str = Integer.toString(integer);
                int length =  str.length();

                if(length <= 6)
                {
                        return str.concat("\t\t");
                }
                else if(length <= 14)
                {
                        return str.concat("\t");
                }
                else
                {
                        return str;
                }
        }

	public static String validasiDouble(double d)
        {
                String str = Double.toString(d);
                int length =  str.length();

                if(length <= 6)
                {
                        return str.concat("\t\t");
                }
                else if(length <= 14)
                {
                        return str.concat("\t");
                }
                else
                {
                        return str;
                }
        }
}