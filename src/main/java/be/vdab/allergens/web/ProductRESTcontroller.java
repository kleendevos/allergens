package be.vdab.allergens.web;

import be.vdab.allergens.domain.Product;
import be.vdab.allergens.repo.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
@RequestMapping ("api/product")
public class ProductRESTcontroller {

    @Autowired
    Productrepository productrepository;

    @RequestMapping (method = RequestMethod.GET, path = "{pid}", produces = "application/json")
    public Product getById (@PathVariable ("pid") int id) {
        return productrepository.findOne(id);
    }

    @RequestMapping (method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Product> products(){
        return productrepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Product> create(@RequestBody Product input) {
        if(input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        productrepository.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }






}
