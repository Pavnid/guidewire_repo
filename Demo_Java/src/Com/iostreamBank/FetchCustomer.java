package Com.iostreamBank;
import java.io.*;

public class FetchCustomer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\2481647\\eclipse-workspace\\Demo_Java\\src\\Com\\iostreamBank\\properties");
		int ch;
		while((ch = fis.read() )!= -1) {
			System.out.println((char) ch);
			fis.close();
		}
	}
}
