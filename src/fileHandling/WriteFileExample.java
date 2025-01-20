package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	}

}
