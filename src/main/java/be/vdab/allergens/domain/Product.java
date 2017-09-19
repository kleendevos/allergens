package be.vdab.allergens.domain;

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
    @NotNull
    private String name;

    @Column
    private String EanNumber;

    @Column
    @NotNull
    private String brand;

    @ManyToMany
    private List<Allergen> allergens = new ArrayList<>();

    public Product() {
    }

    public Product(String name, String eanNumber, String brand) {
        this.name = name;
        EanNumber = eanNumber;
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
        return EanNumber;
    }

    public void setEanNumber(String eanNumber) {
        EanNumber = eanNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", EanNumber=" + EanNumber +
                ", brand='" + brand + '\'' +
                '}';
    }
}
