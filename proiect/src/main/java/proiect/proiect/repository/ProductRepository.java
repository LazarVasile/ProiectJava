package proiect.proiect.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import proiect.proiect.model.Product;
import proiect.proiect.querys.Querys;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Product> getProducts() {
        return jdbcTemplate.query(Querys.GET_PRODUCTS_SQL, new BeanPropertyRowMapper<>(Product.class));
    }

    public List<Product> addProduct(Product p) {
        jdbcTemplate.update(Querys.ADD_PRODUCT, p.getName(), p.getProvider(), p.getPrice(), p.getExpirationDate(), p.getBarcode());
        return jdbcTemplate.query(Querys.GET_PRODUCTS_SQL, new BeanPropertyRowMapper<>(Product.class));
    }

    public List<Product> deleteProduct(int id) {
        jdbcTemplate.update(Querys.DELETE_PRODUCT, id);
        return jdbcTemplate.query(Querys.GET_PRODUCTS_SQL, new BeanPropertyRowMapper<>(Product.class));
    }

}
