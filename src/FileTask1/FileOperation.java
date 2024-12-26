package FileTask1;
import java.io.*;
public class FileOperation{
    public static void main(String[] args) {
        String filePath = "src/FileTask1/ad_soyad.txt";
        String dataToWrite = "Ismayil Nagiyev\nJava Developer";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(dataToWrite);
            System.out.println("Written to file");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Data:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
