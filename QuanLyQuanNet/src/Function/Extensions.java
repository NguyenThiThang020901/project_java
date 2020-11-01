package Function;
public class Extensions {
	 public static boolean checkChar(String s) {
	        int kt = 1;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) == ' ') {
	                kt++;
	            }
	        }
	        return kt != 0;
	    }

	    public static boolean checkNumber(String s) {
	        int kt = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
	                kt = 1;
	            }
	        }
	        return kt == 0;
	    }
	
}
