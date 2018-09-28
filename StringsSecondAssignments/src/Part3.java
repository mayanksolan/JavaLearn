
public class Part3 {
	public static int findStopCodon(String dna, int startIndex,String stopCodon)
	{
		int indStopCodon = dna.indexOf(stopCodon, startIndex+3);
		//System.out.println(stopCodon+ " " + indStopCodon);
		if (indStopCodon == -1)
			return -1;
		else if (dna.substring(startIndex, indStopCodon+3).length() % 3 == 0)
		{
			return indStopCodon;
		}
		else return -1;
	}
	public static String findGene(String dna)
	{
		int startIndex = dna.toUpperCase().indexOf("ATG");
		int minIndex = 0;
		if (startIndex == -1)
			return "";
		else
		{
			int endIndexTAA = findStopCodon(dna,startIndex,"TAA");						
			int endIndexTAG = findStopCodon(dna,startIndex,"TAG");
			int endIndexTGA = findStopCodon(dna,startIndex,"TGA");
			//System.out.println("TAA "+endIndexTAA+" TAG "+endIndexTAG+" TGA "+endIndexTGA);
			if (endIndexTAA == -1 || (endIndexTGA != -1 && endIndexTGA < endIndexTAA))
				minIndex = endIndexTGA ; 
			else
				minIndex = endIndexTAA ;
			if (minIndex == -1 || (endIndexTAG != -1 && endIndexTAG < minIndex))
				minIndex = endIndexTAG;
		}
		if(minIndex != -1 && startIndex != -1)
			return dna.substring(startIndex, minIndex+3);
		else
			return "";
	}
	public static int countGenes(String dna)
	{
		int currInd = 0 ; int count = 0;
		System.out.println("DNA String - " + dna + " results into ");
		while (currInd != dna.length())
		{
			String set = findGene(dna.substring(currInd));
			if (set != "") {
				System.out.println(set);
				int setIndex = dna.indexOf(set);
				int setLen = set.length();
				currInd = setIndex + setLen;
				count++;
			}
		}
		return count;
	}
	public static void testFindStopCodon()
	{
		String a1 = "ATGjvbrtgTAA";
		String a2 = "ABATGhgdtvnTAA";
		String a3 = "ABATGhgdgbtvnTTA";
		String a4 = "ABATGfghtreTAGyhrTAA";
		String a5 = "ABATGfghtrTAGyhrTAA";
		String a6 = "ABATGfghtrTAGyhTAAaaTGA";
		String a7 = "ABATGfghtprTAGyhbATGbntmtpTAAaabATGnbtbevverTGA";
		String a8 = "ATGTAGATGTAAATGTGA";
		System.out.println("DNA String - " + a1 + " results into " + findStopCodon(a1,0,"TAA"));
		System.out.println("DNA String - " + a2 + " results into " + findStopCodon(a2,2,"TAA"));
		System.out.println("DNA String - " + a3 + " results into " + findStopCodon(a3,2,"TTA"));
		System.out.println("DNA String - " + a4 + " results into " + findGene(a4));
		System.out.println("DNA String - " + a5 + " results into " + findGene(a5));
		System.out.println("DNA String - " + a6 + " results into " + findGene(a6));
		printAllGenes(a7);
		System.out.println("DNA String - " + a7 + " has " + countGenes(a7));
		printAllGenes(a8);
		System.out.println("DNA String - " + a8 + " has " + countGenes(a8));
	}
	public static void printAllGenes(String dna)
	{
		int currInd = 0 ;
		System.out.println("DNA String - " + dna + " results into ");
		while (currInd != dna.length())
		{
			String set = findGene(dna.substring(currInd));
			if (set != "") {
				System.out.println(set);
				int setIndex = dna.indexOf(set);
				int setLen = set.length();
				currInd = setIndex + setLen;
			}
		}				
	}
	public static void main(String[] args)
	{
		testFindStopCodon();
	}
}
