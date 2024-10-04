package com.laptops.LaptopGuide.service;

import com.laptops.LaptopGuide.model.LaptopModel;
import com.laptops.LaptopGuide.repo.LaptopRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class LaptopGuideService {
    @Autowired
    private  LaptopRepo repo;
    private final JPAStreamer jpaStreamer;

    public LaptopGuideService(final JPAStreamer jpaStreamer) {

        this.jpaStreamer = jpaStreamer;
    }

    public LaptopModel addLaptopModel(LaptopModel laptopModel) {

        return repo.save(laptopModel);
    }


    public List<LaptopModel> LaptopUnderBudget(long budget) {

        return jpaStreamer.stream(LaptopModel.class)
                .filter(laptop -> laptop.getPrice() <= budget)
                .collect(Collectors.toList());

    }




}
