package be.vdab.allergens.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String eanNumber;

    @Column
    private String brand;

    @ManyToOne (targetEntity = Product.class)
    Categorie categorie;


    public Product() {
    }

    public Product(String name, String eanNumber, String brand, Categorie categorie) {
        this.name = name;
        this.eanNumber = eanNumber;
        this.brand = brand;
        this.categorie = categorie;
    }

    public Product(String name, String eanNumber, String brand) {
        this.name = name;
        this.eanNumber = eanNumber;
        this.brand = brand;
    }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEanNumber() {
        return eanNumber;
    }

    public void setEanNumber(String eanNumber) {
        eanNumber = eanNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
        if (categorie != null) {
            categorie.addProduct(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", EanNumber=" + eanNumber +
                ", brand='" + brand + '\'' +
                '}';
    }
}
