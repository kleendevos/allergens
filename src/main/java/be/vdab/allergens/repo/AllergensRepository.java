package be.vdab.allergens.repo;

import be.vdab.allergens.domain.Allergens;
import be.vdab.allergens.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergensRepository extends JpaRepository<Allergens, Integer> {

}
