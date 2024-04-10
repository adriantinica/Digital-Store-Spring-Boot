package student.example.digitalstore;

public class Product {

    String productName;
    Integer productID;
    Integer productPrice;

    public Product(String productName, Integer productID, Integer productPrice) {
        
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    

    

}
