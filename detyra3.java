
public class detyra4 {

	public static void main(String[] args) {
		
		String str = "Pershendetje ky eshte programi im i pare ne java!";
		
		count(str);
	}
       public static void count(String str) {
    	   char[] letter = {'a','e','ë','i','o','u','y'};
    	   
    	   for(int i = 0; i < letter.length; i++) {
    		   int count = 0;
    		   char c = letter[i];
    		   for(int j = 0; j< str.length(); j++) {
    			   if (c == str.charAt(j)) count++;
    		   }
    		   System.out.println(c + " -> " + count);
    		   
    	   }
       }
}
