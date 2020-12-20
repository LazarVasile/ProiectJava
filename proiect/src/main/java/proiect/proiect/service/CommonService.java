package proiect.proiect.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.proiect.model.Sale;
import proiect.proiect.model.Provider;
import proiect.proiect.model.Category;
import proiect.proiect.repository.CommonRepository;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    private CommonRepository commonRepository;

    public List<Category> getCategories() {
        return commonRepository.getCategoriess();
    }

    public List<Category> addCategory(Category c) {
        return commonRepository.addCategory(c);
    }

    public List<Category> deleteCategory(int id) {
        return commonRepository.deleteCategory(id);
    }

    public List<Provider> getProviders() {
        return commonRepository.getProviders();
    }

    public List<Provider> addProvider(Provider p) {
        return commonRepository.addProvider(p);
    }

    public List<Provider> deleteProvider(int id) {
        return commonRepository.deleteProvider(id);
    }

    public List<Sale> getSales() {
        return commonRepository.getSales();
    }

    public List<Sale> addSale(Sale s) {
        return commonRepository.addSale(s);
    }

}
