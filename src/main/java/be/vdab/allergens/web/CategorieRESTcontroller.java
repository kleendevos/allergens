package be.vdab.allergens.web;

import be.vdab.allergens.domain.Categorie;
import be.vdab.allergens.domain.Product;
import be.vdab.allergens.repo.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vdabcursist on 20/09/2017.
 */

@RestController
@RequestMapping ("api/categorie")
public class CategorieRESTcontroller {

    @Autowired
    CategorieRepository categorieRepository;

    @RequestMapping (method = RequestMethod.GET, path = "{cid}", produces = "application/json")
    public Categorie getById (@PathVariable("cid") int id) {
        return categorieRepository.findOne(id);
    }

    @RequestMapping (method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Categorie> products(){
        return categorieRepository.findAll();
    }

}
