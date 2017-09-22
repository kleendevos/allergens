package be.vdab.allergens.service;

import be.vdab.allergens.repo.AllergensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllergensService {

    @Autowired
    AllergensRepository allergensRepository;

}
