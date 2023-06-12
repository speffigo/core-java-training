package ArrayAndString;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		System.out.println(a.length);
		//classic for loop
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//for each loop
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

}
