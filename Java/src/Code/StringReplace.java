package Code;

public class StringReplace {
	
	public static String stringReplace( String a, String b) {
		StringBuilder sb = new StringBuilder();
		for ( char c : a.toCharArray()) {
			sb.append(Character.isLetterOrDigit(c) ? c : b);
			
		}
		
		return sb.toString();
	}
	
	public static void main( String[] args) {
		
		System.out.println(stringReplace("This is a tes", "/"));
	}

}
