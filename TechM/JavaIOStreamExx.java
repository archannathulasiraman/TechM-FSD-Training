package TechM;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
public class JavaIOStreamExx {
	public static void main(String[] args) {
		try {
			BufferedReader reader= new BufferedReader(new FileReader("Sachin.srt"));
					String contents;
					while((contents=reader.readLine())!=null) {
						System.out.println(contents);
						
					}
			BufferedWriter writer=new BufferedWriter(new FileWriter("Sachin.srt"));
			writer.write("\n0.40-0.50");
			writer.write("\nUnga smile cute ah irruku");
			writer.write("\n1.40-1.50");
			writer.write("\ndaily vandhu bit bit ah podren");
			writer.write("\n2.40-2.50");
			writer.write("\nvarata da Aiyachaami");
			writer.write("\n3.40-3.50");
			writer.write("\npeter akka ku nammala pathi thrla");
			writer.write("\n4.40-4.50");
			writer.write("\nabi dheko choopisthaanuuuu");
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
