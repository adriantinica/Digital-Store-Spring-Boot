package student.example.digitalstore;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {

    @GetMapping("/")
    //@ResponseBody

    public String index(Model model) {
        Product  product1 =new Product();
        product1.setProductID(128);
        product1.setProductName("Aparat de cafea Krups EA894T10");
        product1.setProductPrice(150);
        model.addAttribute("product",product1);
        
        return "product-index";
    }
    
    
}