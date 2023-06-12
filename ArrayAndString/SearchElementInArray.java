package ArrayAndString;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,50,70};
		int n=70;
		int i1=1;
		for(int i:a) {
			if(i==n) {
				System.out.print("found");
				i1=0;
				break;
			}
		}
		if(i1==1)
		System.out.print("Not found");
		

	}

}
