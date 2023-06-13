package ArrayListExample;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hii");
		a.add(10);
		a.add(10.5);
		a.add(true);
		System.out.println(a);
		System.out.println(a.get(0));
		a.remove(3);
		System.out.println(a);
          for(Object o:a) {
	System.out.println(o+" ");
}
	}

}
