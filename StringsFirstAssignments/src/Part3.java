
public class Part3 {
	public static Boolean twoOccurrences(String stringa, String stringb)
	{
		int cnt = 0;
		int place = -1;
		for(int a = 1; a <=2; a++)
		{
			int location = stringb.indexOf(stringa, place+1);
			if (location != -1)
			{
				cnt++;
			}
			place = location;
		}
		if (cnt == 2)
			return true;
		else
			return false;
	}
	public static String lastPart(String stringa, String stringb)
	{
		int location = stringb.indexOf(stringa);
		int lena = stringa.length();
		int lenb = stringb.length();
		if (location != -1)
			return stringb.substring(location+lena, lenb);
		else
			return "";
	}
	public static void testing()
	{
		String b1 = "PTACCCPTATA"; String a1 = "PTA";
		String b2 = "PTACCCTAA"; String a2 = "PTA";
		String b3 = "ATGCCCPTA"; String a3 = "PTA";
		String b4 = "BANANAR"; String a4 = "AN";
		String b5 = "CATARACTO"; String a5 = "ACT";
		String b6 = "FOREST"; String a6 = "ZOO";
		//String b7 = "gatgctataat";
		System.out.println("b1 = " + twoOccurrences(a1,b1));
		System.out.println("b2 = " + twoOccurrences(a2,b2));
		System.out.println("b3 = " + twoOccurrences(a3,b3));
		System.out.println("b4 = " + lastPart(a4,b4));
		System.out.println("b5 = " + lastPart(a5,b5));
		System.out.println("b6 = " + lastPart(a6,b6));
		//System.out.println("a7 = " + twoOccurrences(a7,startCodon,stopCodon));
	}
	public static void main(String[] args)
	{
		testing();
	}
}
