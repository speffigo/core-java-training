package ArrayAndString;

public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,20},{30,40},{50,60}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//for each loop
		for(int[] i:a){
			for(int i1:i) {
				System.out.print(i1+" ");
			}
			System.out.println();
		}
			
		

	

}}
