package proiect.proiect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proiect.proiect.model.Provider;
import proiect.proiect.service.CommonService;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {
    @Autowired
    private CommonService commonService;

    @GetMapping("/get")
    public List<Provider> getProviders() {
        return commonService.getProviders();
    }

    @PostMapping("/add")
    public List<Provider> addProvider(@RequestBody Provider p) {
        return commonService.addProvider(p);
    }

    @DeleteMapping("/delete")
    public List<Provider> deleteProvider(@RequestParam int id) {
        return commonService.deleteProvider(id);
    }

}
