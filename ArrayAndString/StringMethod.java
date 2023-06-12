package ArrayAndString;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("welcome");
		System.out.println(s1.length());
		
		String s2=new String(" to Eclipse");
		System.out.println(s1.concat(s2));
		String s="    java    ";
		System.out.println(s.trim());
		
		System.out.println(s1.contains("wel"));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.replace('c','t'));
		System.out.println(s1.substring(1,5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	
	}

}
