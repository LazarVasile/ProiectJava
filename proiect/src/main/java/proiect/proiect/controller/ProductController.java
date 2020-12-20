package proiect.proiect.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proiect.proiect.model.Product;
import proiect.proiect.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get")
    public List<Product> getPrudcts() {
        return productService.getProducts();
    }

    @PostMapping("/add")
    public List<Product> addProduct(@RequestBody Product p) {
        return productService.addProduct(p);
    }

    @DeleteMapping("/delete")
    public List<Product> deleteProduct(@RequestParam int id) {
        return productService.deleteProduct(id);
    }
}
