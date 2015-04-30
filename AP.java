import java.io.*;
import java_cup.runtime.Symbol;

public class AP {

	private static boolean syntax_error = false;

	public static void error()
	{
		syntax_error = true;
	}

	public static void main(String[] args) {

		String inFile = "input3.hs";

		if (args.length > 1) {
			inFile = args[0];
		}

		try {
			FileInputStream fis = new FileInputStream(inFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);

			parser parser = new parser(new Lexer(dis));
			Symbol res = parser.parse();

			if (syntax_error) {
				System.out.println("\n-------- Wrong Input --------\n");
			}
			else {
				System.out.println("\n-------- Correct Input --------\n");
			}

			fis.close();
			bis.close();
			dis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
