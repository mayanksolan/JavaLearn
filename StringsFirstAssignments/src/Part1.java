
public class Part1 {
	public static String findSimpleGene(String dna) {
		int indatg = dna.indexOf("ATG");
		if(indatg == -1) {
			return "";
		}
		int indtaa = dna.indexOf("TAA",indatg);
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
		String a1 = "PTACCCTAA";
		String a2 = "ATGCCCPTA";
		String a3 = "PTACCCPTA";
		String a4 = "ATGCCCNNNRRRTTTTAA";
		String a5 = "ATGCCCNNNRTTTTAA";
		System.out.println("a1 = " + findSimpleGene(a1));
		System.out.println("a2 = " + findSimpleGene(a2));
		System.out.println("a3 = " + findSimpleGene(a3));
		System.out.println("a4 = " + findSimpleGene(a4));
		System.out.println("a5 = " + findSimpleGene(a5));
	}
	public static void main(String[] args)
	{
		testSimpleGene();
	}
}
