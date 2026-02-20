package Core_Java;
import java.util.*;

public class SetImplement_demo1 {

	public static void main(String[] args) {
		
		Set<Demo1> s = new HashSet<>();
		
		s.add(new Demo1(1,"heart", "kumar","1123", new Date()));
		s.add(new Demo1(2,"brain", "sisu","1123", new Date()));
		s.add(new Demo1(3,"lungs", "kido","1123", new Date()));
		s.add(new Demo1(4,"kidney", "dokja","1123", new Date()));
		
		s.forEach( x ->{
			Demo1 d = (Demo1)x;
			System.out.println(d.did +"  "+d.specilization + "	  "+d.dname + "  "+d.phno + "  "+d.doj);
		});
		
	}
}
