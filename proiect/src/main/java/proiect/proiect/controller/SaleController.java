package proiect.proiect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proiect.proiect.model.Sale;
import proiect.proiect.service.CommonService;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private CommonService commonService;

    @GetMapping("/get")
    public List<Sale> getSales() {
        return commonService.getSales();
    }

    @PostMapping("/add")
    public List<Sale> addSale(@RequestBody Sale s) {
        return commonService.addSale(s);
    }
}
