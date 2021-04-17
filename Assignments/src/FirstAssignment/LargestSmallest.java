package FirstAssignment;

public class LargestSmallest {
	public static void main(String[] args) {
		int num[] = new int[] {459,125,486,1452,785,421,569,236};
		int smallnum = num[0];
		int bignum = num[0];
		
		for(int i =1; i<num.length; i++) {
			if(num[i] < smallnum) {
				smallnum = num[i];
			}
			else if(num[i] > bignum) {
				bignum = num[i];
				
			}
		}
		System.out.println("Smallest no. is " +smallnum);
		System.out.println("Biggest  no. is " +bignum);
	
	}

}
