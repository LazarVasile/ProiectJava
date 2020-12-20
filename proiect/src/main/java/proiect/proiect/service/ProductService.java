package proiect.proiect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.proiect.model.Product;
import proiect.proiect.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public List<Product> addProduct(Product p) {
        return productRepository.addProduct(p);
    }

    public List<Product> deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }
}
