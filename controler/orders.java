import java.io.FileWriter;
import java.io.IOException;

public class CreateOrder {

    public static void main(String[] args) {

        String fileName = "src/puisi.txt";
        String fileContent = "menulis Order!";
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            
            System.out.println("Order sudah ditulis !");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}
