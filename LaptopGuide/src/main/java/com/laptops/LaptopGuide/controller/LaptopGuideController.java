package com.laptops.LaptopGuide.controller;

import com.laptops.LaptopGuide.model.LaptopModel;
import com.laptops.LaptopGuide.service.LaptopGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopGuideController {
    @Autowired
     private LaptopGuideService service;

    @PostMapping("/addLaptopDetails")
    public LaptopModel addLaptopModel(@RequestBody LaptopModel laptopModel){
            return service.addLaptopModel(laptopModel);
    }


    @GetMapping("/getLaptopsUnderBudget/{budget}")
    public List<LaptopModel> LaptopUnderBudget(@PathVariable long budget){
        return service.LaptopUnderBudget(budget);
    }
}
