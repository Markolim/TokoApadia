//impoert
//librarry



public class customer {
    public static void main(String[] args) {
        Boolean bukan_dosen = true;

        if (bukan_dosen){
            System.out.println("Tidak boleh mengakses halaman dosen...");
        }
        else {
            System.out.println("Boleh mengakses halaman dosen...");
        }
        
    }
    
}
 private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);      
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}
