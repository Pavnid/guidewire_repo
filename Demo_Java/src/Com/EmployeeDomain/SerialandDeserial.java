package Com.EmployeeDomain;
import java.io.*;
public class SerialandDeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\EmployeeDomain\\emp.ser");
		
		ObjectOutputStream obs = new ObjectOutputStream(fos);
		obs.writeObject(new Employee(101, "kumar", 937420));
		
		//Deserialization
		FileInputStream fis = new FileInputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\EmployeeDomain\\emp.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = ((Employee)ois.readObject());
		System.out.println(e.eid+":::"+e.ename+":::"+e.esal);
	}
}
