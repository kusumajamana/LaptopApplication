package com.laptops.LaptopGuide.repo;

import com.laptops.LaptopGuide.model.LaptopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LaptopRepo extends JpaRepository<LaptopModel,Long> {

}

