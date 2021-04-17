package FirstAssignment;

public class FirstNonReapeated {
	public static void main(String[] args) {
		String s1 = "Karnataka";
		
		s1 = s1.toLowerCase();
		
		for(int i = 0; i < s1.length(); i++) {
			boolean unique = true;
		for(int j = 0; j < s1.length(); j++) {
			if(i!=j && s1.charAt(i) == s1.charAt(j)) {
				unique = false;
				break;
			}
		}
		
		if(unique) {
			System.out.println("The frist non repeated character is " +s1.charAt(i));
			break;
		}
		
			
		}
	}

}
