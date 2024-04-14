package student.example.digitalstore.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    String name;
    @Id
    @GeneratedValue
    Integer id;
    
    public Product() {
    }

    public Product(String name ) {

        this.name = name;
        
    }


    public String getName() {
        return name;
    }

    public void setProductName(String name) {
        this.name= name;
    }

    public Integer getProductID() {
        return id;
    }

    public void setProductID(Integer id) {
        this.id = id;
    }

    

    

    

}
