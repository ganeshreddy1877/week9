import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Week9Q2 {
    public static void main(String[] args) {
        BufferedReader br = null; // Declare BufferedReader outside the try block
        try {
            br = new BufferedReader(new FileReader("E:/Amrita/example.txt"));
            String line; // Corrected 'string' to 'String'
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print the actual line instead of the string "line"
            }
        } catch (IOException e) { // Catch IOException directly
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // Ensure the BufferedReader is closed to prevent resource leaks
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error closing the BufferedReader: " + e.getMessage());
                }
            }
        }
    }
}