package collections.shoppingcart;

import java.util.Objects;

/**
 *
 * @author Varun Shrivastava (vslala)
 */
class Product {
    private Integer pid;
    private String name;
    private Double price;
    private Integer stock;
    
    public Product () {       
    }
    
    public Product (Integer pid, String name, Double price, Integer stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }
