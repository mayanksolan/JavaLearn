
public class Debugging {
	public static void findAbc(String input) {
	    int index = input.indexOf("abc");
	    while (true) {
	    	if (index == -1 || index >= input.length() - 3){
	               break;
	           }
	        //System.out.println(index+1);
	        //System.out.println(index);
	    	System.out.println("index " + index);
	        String found = input.substring(index+1, index+4);
	        System.out.println(found);
	        index = input.indexOf("abc", index+3);
	        System.out.println("index after updating " + index);
	    }
	}
	   public static void test() {
	    //findAbc("abcd");
		   findAbc("abcabcabcabca");
	}
	   public static void main (String[] args)
	   {
		   test();
	   }
}
