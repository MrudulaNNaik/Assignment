package FirstAssignment;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s1 = "He walked along the beach";
		char arr[] = s1.toCharArray();
		
		String res = "";
		for(char i:arr) {
			if(res.indexOf(i) == -1) {
				res +=i;
			}
		}
		System.out.println("The string after removig duplicates " +res);
	} 

}
