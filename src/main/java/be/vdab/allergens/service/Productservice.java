package be.vdab.allergens.service;

import be.vdab.allergens.domain.Product;
import be.vdab.allergens.repo.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Productservice {

    @Autowired
   Productrepository productrepository;

    public Product findById (int id) {
        System.out.println ("Flight ID");
        return new Product();
    }
}
