
public class Part1 {
	public static int findStopCodon(String dna, int startIndex,String stopCodon)
	{
		int indStopCodon = dna.indexOf(stopCodon, startIndex+3);
		int dist = dna.substring(startIndex, indStopCodon+3).length();
		if (indStopCodon == -1)
			return dna.length();
		else if (dist % 3 == 0)
				return indStopCodon;
		else return -1;
	}
	public static void testFindStopCodon()
	{
		String a1 = "ATGjvbrtgTAA";
		String a2 = "ABATGhgdtvnTAA";
		String a3 = "ABATGhgdgbtvnTTA";
		System.out.println("DNA String - " + a1 + " results into " + findStopCodon(a1,0,"TAA"));
		System.out.println("DNA String - " + a2 + " results into " + findStopCodon(a2,2,"TAA"));
		System.out.println("DNA String - " + a3 + " results into " + findStopCodon(a3,2,"TTA"));
	}
	public static void main(String[] args)
	{
		testFindStopCodon();
	}
}
