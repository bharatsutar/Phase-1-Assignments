import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {

	public static void writeAppendFile() {
		try {
			FileWriter fwrite = new FileWriter("file.txt");
			// writing the content into the FileOperationExample.txt file
			fwrite.write("A named location used to store related information is referred to as a File.");

			// Closing the stream
			fwrite.close();
			System.out.println("Content is successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try {
			// Create f1 object of the file to read data
			File f1 = new File("file.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
	}

	public static void main(String[] args) {
		writeAppendFile();
		readFile();
	}

}
