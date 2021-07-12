package hw3;
import java.io.FileReader;
import java.io.FileWriter;

public class HW_3 {
	public static void main(String[] args) {
	//	String text = " hello everyone";
		
	//	try {
	//			FileWriter writer =new FileWriter("demo.txt");
	//			Writer.write(text);
	//			writer.flush();
	//			write.close();
	//		
	//	} catch(Exception e) {
	//		e.printStackTrace();
	//	}
		try {
			FileReader reader = new FileReader("demo.txt");
			FileWriter writer = new FileWriter("helo.txt");
			int c =0;
			while (( c = reader.read()) !=-1){
				writer.write(c);
				writer.flush();
				
			}
		writer.close();
		reader.close();
		System.out.println("Done");
	} catch(Exception e) {
		e.printStackTrace();
	}
	}

}


