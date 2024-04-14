package student.example.digitalstore.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import student.example.digitalstore.Entities.Product;


@Controller
public class ProductController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/")
    //@ResponseBody

    

    public String index(Model model) {
        
        // 1. get product from DB
        Product product = entityManager.find(Product.class,1);
        
        //2. render the page
        
        model.addAttribute("id", product.getProductID());
        model.addAttribute("name", product.getName());
        
        

        
        return "product-index";
    }
    
    
}