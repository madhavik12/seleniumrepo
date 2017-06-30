import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class create_write_read_textfile {

	public static void main(String[] args) throws IOException {
File f=new File("C:\\testing\\temp.txt");
f.createNewFile();
//writing data into text file temp.txt
FileWriter w=new FileWriter("C:\\testing\\temp.txt");
BufferedWriter out=new BufferedWriter(w);
out.write("hello we are writing data");
out.newLine();
out.write("into a text file");
out.flush();

// reading data from text file 
FileReader r=new FileReader("C:\\testing\\temp.txt");
BufferedReader bfr=new BufferedReader(r);
String x="";
while((x=bfr.readLine())!=null)
	System.out.println(x);


	}

}
