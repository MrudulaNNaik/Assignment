package FirstAssignment;



public class RepeatingTwice {
	void printRepeat(int a[], int size) {
		int i,j;
		System.out.println("Repeated elements are: ");
		for(i=0; i <size; i++) {
			for(j=i+1; j<size; j++)
			{
				if(a[i] == a[j]) {
					System.out.println(a[i] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
			 
		RepeatingTwice repeat = new RepeatingTwice();	 
		 int a[] = {4,8,2,5,4,6,3,7};
		 int a_size = a.length;
		 repeat.printRepeat(a, a_size);
	
	}
}
