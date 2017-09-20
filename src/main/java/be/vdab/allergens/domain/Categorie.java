package be.vdab.allergens.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kathleendevos on 19/09/17.
 */
@Entity
public class Categorie {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String categorie;

    public Categorie(String categorie) {
        this.categorie = categorie;
    }

    public Categorie(Integer id) {
        this.id = id;
    }

    public Categorie() {
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", categorie='" + categorie + '\'' +
                '}';
    }

}
