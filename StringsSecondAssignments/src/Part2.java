
public class Part2 {
	public static int howMany(String a, String b)   //GAA, ATGAACGAATTGAATC
	{
		int lenb = b.length();
		int currInd = 0, occ = 0;
		while(currInd < lenb)
		{
			int found = b.indexOf(a,currInd);
			if(found != -1)
			{
				occ++;
				currInd = found + a.length();
			}
			else
				return occ;
		}
		return occ;
	}
	public static void testHowMany()
	{
		String a1 = "GAA", b1 = "ATGAACGAATTGAATC";
		String a2 = "AA", b2 = "ATAAAA";
		System.out.println(b1+" with "+a1+" is "+howMany(a1,b1));
		System.out.println(b2+" with "+a2+" is "+howMany(a2,b2));
	}
	public static void main(String[] args)
	{
		testHowMany();
	}
}
