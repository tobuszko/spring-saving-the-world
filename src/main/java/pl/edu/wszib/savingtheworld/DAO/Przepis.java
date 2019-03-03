package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.Id;


import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Przepis {

    @Id
    @GeneratedValue
    public Long Id;

    @Column(nullable = false)
    public  String tytul;

    @OneToMany(mappedBy = "przepis", fetch = FetchType.EAGER)
    public  List<Skladniki> skladniki;


    @ManyToOne
    @JoinColumn(name = "ksiazka_id")
    KsiazkaKucharska ksiazkaKucharska;

    public Przepis(){
    }

    public Przepis(String tytul) {
        this.tytul = tytul;
    }


    public Przepis(String tytul, List<Skladniki> skladniki, KsiazkaKucharska ksiazkaKucharska) {
        this.tytul = tytul;
        this.skladniki = skladniki;
        this.ksiazkaKucharska = ksiazkaKucharska;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List<Skladniki> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(List<Skladniki> skladniki) {
        this.skladniki = skladniki;
    }

    public KsiazkaKucharska getKsiazkaKucharska() {
        return ksiazkaKucharska;
    }

    public void setKsiazkaKucharska(KsiazkaKucharska ksiazkaKucharska) {
        this.ksiazkaKucharska = ksiazkaKucharska;
    }
}
