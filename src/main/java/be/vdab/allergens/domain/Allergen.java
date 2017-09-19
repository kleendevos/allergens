package be.vdab.allergens.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class Allergen {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String allergen;



    @ManyToMany
    private List<Product> productList = new ArrayList<>();

    public Allergen() {
    }

    public Allergen(String allergen) {
        this.allergen = allergen;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }



    @Override
    public String toString() {
        return "Allergen{" +
                "id=" + id +
                ", allergen='" + allergen + '\'' +
               '}';
    }
}
