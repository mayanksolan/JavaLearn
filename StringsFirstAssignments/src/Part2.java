
public class Part2 {
	public static String findSimpleGene(String dna, String startCodon, String stopCodon) {
		int indatg = dna.toUpperCase().indexOf(startCodon);
		if(indatg == -1) {
			return "";
		}
		int indtaa = dna.toUpperCase().indexOf(stopCodon,indatg);
		if (indtaa == -1) {
			return "";
		}
		String sub = dna.substring(indatg, indtaa+3);
		int len = sub.length()%3;
		if(len == 0) {
			return sub;
		}
		return "";
	}
	public static void testSimpleGene()
	{
		String startCodon = "ATG";
		String stopCodon = "TAA";
		String a1 = "PTACCCTAA";
		String a2 = "ATGCCCPTA";
		String a3 = "PTACCCPTA";
		String a4 = "TPACPDATGCCCNNNRRRTTTTAATPACPD";
		String a5 = "ATGCCCNNNRTTTTAA";
		String a6 = "ATGGGTTAA";
		String a7 = "gatgctataat";
		System.out.println("a1 = " + findSimpleGene(a1,startCodon,stopCodon));
		System.out.println("a2 = " + findSimpleGene(a2,startCodon,stopCodon));
		System.out.println("a3 = " + findSimpleGene(a3,startCodon,stopCodon));
		System.out.println("a4 = " + findSimpleGene(a4,startCodon,stopCodon));
		System.out.println("a5 = " + findSimpleGene(a5,startCodon,stopCodon));
		System.out.println("a6 = " + findSimpleGene(a6,startCodon,stopCodon));
		System.out.println("a7 = " + findSimpleGene(a7,startCodon,stopCodon));
	}
	public static void main(String[] args)
	{
		testSimpleGene();
	}
}
