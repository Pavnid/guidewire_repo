package Com.HosDomain;
import java.io.*;
public class Hospital {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = 
				new FileInputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\HosDomain\\appointment.properties");
		
		FileInputStream fi2 = new FileInputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\HosDomain\\doctors.properties");
		FileInputStream fi3 = new FileInputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\HosDomain\\patient.properties");
		
		SequenceInputStream sq1 = new SequenceInputStream(fi,fi2);
		SequenceInputStream sq2 = new SequenceInputStream(fi,fi3);
		
		int ch;
		while((ch = sq2.read()) != -1) {
			System.out.print((char)ch);
		}
		sq2.close();
	}

}
