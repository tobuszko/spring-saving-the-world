package pl.edu.wszib.savingtheworld.DAO;


import javax.persistence.Id;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class KsiazkaKucharska {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String tytul;

    @OneToMany(mappedBy = "ksiazkaKucharska", fetch = FetchType.EAGER)
    public List<Przepis>  przepisy;


    public KsiazkaKucharska () {}


    public KsiazkaKucharska(String tytul) {
        this.tytul = tytul;
    }


    public KsiazkaKucharska(String tytul, List<Przepis> przepisy) {
        this.tytul = tytul;
        this.przepisy = przepisy;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List<Przepis> getPrzepisy() {
        return przepisy;
    }

    public void setPrzepisy(List<Przepis> przepisy) {
        this.przepisy = przepisy;
    }
}
