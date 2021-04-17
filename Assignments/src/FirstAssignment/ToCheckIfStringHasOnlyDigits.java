package FirstAssignment;

public class ToCheckIfStringHasOnlyDigits {
	public static boolean isAllDigits(String s1) {
		for(int i=0; i<s1.length() ;i++) {
			if(Character.isDigit(s1.charAt(i))) {
				i++;
			}
			else 
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(isAllDigits("Naik2504"));
		System.out.println(isAllDigits("2504"));
	}
	

}
