package homework3;
import java.io.FileWriter;

public class HW_3 {
	public static void main(String[] args) {
		String text = " hello everyone";
		
		try {
				FileWriter writer =new FileWriter("demo.txt");
				Writer.write(text);
				writer.flush();
				write.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}


