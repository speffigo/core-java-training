package exceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s=null;
		/*System.out.println(s.length());*/
		
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("cant find length");
		}

	}
	

}
