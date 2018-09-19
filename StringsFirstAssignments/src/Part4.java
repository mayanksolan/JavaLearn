import java.net.*;
import java.io.*;
public class Part4 {
	public static void main(String[] args) throws Exception
	  {
	    String urlString = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
	    URL url = new URL(urlString);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	    String line;
	    while ((line = reader.readLine()) != null)
	    {
	    	//System.out.println(line);
	    	int ytind = line.toUpperCase().indexOf("YOUTUBE.COM");
	    	if (ytind != -1)
	    	{
	    		int dqfirst = line.lastIndexOf("\"",ytind);
	    		int dqsecond = line.indexOf("\"",ytind+1);
	    		if(dqfirst != -1 && dqsecond != -1)
	    			System.out.println("URL is " + line.substring(dqfirst+1, dqsecond));
	    	}
	    }
	    reader.close();
	  }
}
