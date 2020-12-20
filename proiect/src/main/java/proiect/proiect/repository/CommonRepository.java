package proiect.proiect.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import proiect.proiect.model.Product;
import proiect.proiect.model.Sale;
import proiect.proiect.model.Provider;
import proiect.proiect.model.Category;
import proiect.proiect.querys.Querys;

import java.util.List;

@Repository
public class CommonRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> getCategoriess() {
        return jdbcTemplate.query(Querys.GET_CATEGORIES_SQL, new BeanPropertyRowMapper<>(Category.class));
    }

    public List<Category> addCategory(Category c) {
        jdbcTemplate.update(Querys.ADD_CATEGORY, c.getName());
        return jdbcTemplate.query(Querys.GET_CATEGORIES_SQL, new BeanPropertyRowMapper<>(Category.class));
    }

    public List<Category> deleteCategory(int id) {
        jdbcTemplate.update(Querys.DELETE_CATEGORY, id);
        return jdbcTemplate.query(Querys.GET_CATEGORIES_SQL, new BeanPropertyRowMapper<>(Category.class));
    }

    public List<Provider> getProviders() {
        return jdbcTemplate.query(Querys.GET_PROVIDERS_SQL, new BeanPropertyRowMapper<>(Provider.class));
    }

    public List<Provider> addProvider(Provider p) {
        jdbcTemplate.update(Querys.ADD_PROVIDER, p.getName(), p.getAdress(), p.getPhoneNumber());
        return jdbcTemplate.query(Querys.GET_PROVIDERS_SQL, new BeanPropertyRowMapper<>(Provider.class));
    }

    public List<Provider> deleteProvider(int id) {
        jdbcTemplate.update(Querys.DELETE_CATEGORY, id);
        return jdbcTemplate.query(Querys.GET_PROVIDERS_SQL, new BeanPropertyRowMapper<>(Provider.class));
    }

    public List<Sale> getSales() {
        return jdbcTemplate.query(Querys.GET_SALES_SQL, new BeanPropertyRowMapper<>(Sale.class));
    }

    public List<Sale> addSale(Sale s) {
        jdbcTemplate.update(Querys.ADD_CATEGORY, s.getNumber(), s.getDate(), s.getProduct());
        return jdbcTemplate.query(Querys.GET_SALES_SQL, new BeanPropertyRowMapper<>(Sale.class));
    }


}
