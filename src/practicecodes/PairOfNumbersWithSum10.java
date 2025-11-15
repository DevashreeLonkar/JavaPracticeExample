package practicecodes;

public class PairOfNumbersWithSum10 {

	public static void main(String[] args) {

		int[] a= {5,5,4,6,7,3,2,8};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] + a[j]== 10) {
					System.out.println(a[i]+ "+" +a[j]+ "= 10" );
				}
			}
		}

	}

}
