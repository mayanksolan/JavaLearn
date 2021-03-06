import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GenePocess {

    /**
     *
     * One of the coursera task
     * developed strictly with java without external libs
     * Just run it and you will get all rez
     * Do not copy code! Use it for better understanding the taks
     *
     */

    private ArrayList<String> geneList = new ArrayList<>();

    private GenePocess(String strand) {
        parseGeneFromStrand(strand);
    }

    public static void main(String[] args) throws IOException {
        //a - strand of DNA (from your file)
    	File file = new File("C:\\Users\\mayank.solan\\Desktop\\gene.txt");
    	FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
			System.out.println(line);
		}
		fileReader.close();
		System.out.println("Contents of file:");
		System.out.println(stringBuffer.toString());
        String strand = stringBuffer.toString();


        GenePocess m = new GenePocess(strand);
        System.out.println("How many genes are in this file? " + m.geneList.size());
        System.out.println("How many genes in this file are longer than 60? " + m.longerThen60());
        System.out.println("How many genes in this file have cgRatio greater than 0.35? " + m.howManyCGRation(0.35));
        System.out.println("How many times does the codon CTG appear in this strand of DNA? " + m.howManyCTG(strand));
        System.out.println("What is the length of the longest gene in the collection of genes found in this file? " + m.getLongestGene());
    }


    void parseGeneFromStrand(String data) {
        while (data.contains("ATG")) {
            int start = data.indexOf("ATG");
            int end = findEnd(data, start + 3);
            if (start == -1 || end == -1) {
                break;
            }
            while ((end - start) % 3 != 0 ) {
                end = findEnd(data, end + 1);
            }
            this.geneList.add(data.substring(start, end + 3));
            data = data.substring(end + 3, data.length());
        }
    }

    int longerThen60() {
        int count = 0;
        for (String gene : geneList) {
            if (gene.length() > 60) {
                count++;
            }
        }
        return count;
    }

    static int findEnd(String data, int startSearchIndex) {
        ArrayList<Integer> indxAr = new ArrayList<>();
        if (data.indexOf("TAA", startSearchIndex) != -1) {
            indxAr.add(data.indexOf("TAA", startSearchIndex));
        }
        if (data.indexOf("TGA", startSearchIndex) != -1) {
            indxAr.add(data.indexOf("TGA", startSearchIndex));
        }
        if (data.indexOf("TAG", startSearchIndex) != -1) {
            indxAr.add(data.indexOf("TAG", startSearchIndex));
        }
        Collections.sort(indxAr);
        return indxAr.get(0);
    }

    static double getCG(String gen) {
        double c = 0;
        double g = 0;
        for (char ch : gen.toCharArray()) {
            if (ch == 'C') {
                c++;
            } else if (ch == 'G') {
                g++;
            }
        }
        return (c + g) / gen.length();
    }

    int howManyCTG(String gen) {
        int count = 0;
        while (gen.contains("CTG")){
            count++;
            gen = gen.substring(gen.indexOf("CTG") + 3, gen.length());
        }
        return count;
    }

    int howManyCGRation(double ration) {
        int count = 0;
        for (String gene : geneList) {
            if (getCG(gene) > ration) {
                count++;
            }
        }
        return count;
    }

    int getLongestGene() {
        int max = 0;
        for (String gene : geneList) {
            if (gene.length() > max) {
                max = gene.length();
            }
        }
        return max;
    }
}