package be.vdab.allergens.web;

import be.vdab.allergens.domain.Allergens;
import be.vdab.allergens.domain.Categorie;
import be.vdab.allergens.repo.AllergensRepository;
import be.vdab.allergens.repo.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/allergens")
public class AllergensRESTcontroller {

    @Autowired
    AllergensRepository allergensRepository;

    @RequestMapping (method = RequestMethod.GET, path = "{cid}", produces = "application/json")
    public Allergens getById (@PathVariable("cid") int id) {
        return allergensRepository.findOne(id);
    }

    @RequestMapping (method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Allergens> products(){
        return allergensRepository.findAll();
    }

}
