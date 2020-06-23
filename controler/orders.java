import java.io.FileWriter;
import java.io.IOException;

//ini adalah class untuk membuat 
//sebuah order
public class CreateOrder {

    public static void main(String[] args) {

        String fileName = "src/puisi.txt";
        String fileContent = "menulis Order!";
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
        //program akan memprinout order yang telah dibuat
            System.out.println("Order sudah ditulis !");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}
//tambahan class cart
class Cart {

    List<Product> cartItems = new ArrayList<Product>();
    
    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
    }

    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }
