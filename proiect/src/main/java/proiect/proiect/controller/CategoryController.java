package proiect.proiect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proiect.proiect.model.Category;
import proiect.proiect.service.CommonService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CommonService commonService;

    @GetMapping("/get")
    private List<Category> getCategories() {
        return commonService.getCategories();
    }

    @PostMapping("/add")
    private List<Category> addCategory(@RequestBody Category c) {
        return commonService.addCategory(c);
    }

    @DeleteMapping("/delete")
    private List<Category> deleteCategory(@RequestParam int id) {
        return commonService.deleteCategory(id);
    }
}
