package be.vdab.allergens.repo;

import be.vdab.allergens.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



public interface Productrepository extends JpaRepository <Product, Integer>{

    //Product readByEanNumber (String EanNumber);
    Product readById (Integer Id);

}
