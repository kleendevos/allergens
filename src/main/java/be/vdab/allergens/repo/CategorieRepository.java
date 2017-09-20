package be.vdab.allergens.repo;

import be.vdab.allergens.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;


public interface CategorieRepository extends JpaRepository <Categorie, Integer> {

    Categorie readById (Integer id);


}
