package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class filehandling {
	public static void createFileUsingNIO() throws IOException
	{
	Path direction=Paths.get("C:\\file\\File.txt");
	//write data using file class
	String input="Welcome to Learning world";
	byte array[]=input.getBytes();
	Files.write(direction, array, 
	StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	System.out.println("Written Successfully");
	//if you want to write data of list to files directly
	Path direction1=Paths.get("C:\\file\\File.txt");
	//write data using Files class
	List<String> list=Arrays.asList("\n I am Mahi","Learning JAVA FSD");
	Files.write(direction1, list, 
	StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	System.out.println("Appended Successfully");
	}
	public static void main(String[] args) {
	try {
	createFileUsingNIO();
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

}
}
