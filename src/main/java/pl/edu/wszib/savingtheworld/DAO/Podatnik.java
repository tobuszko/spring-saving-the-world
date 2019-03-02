package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Podatnik {

    @Id
    @GeneratedValue
    public Long pesel;

    @Column(nullable = false)
    public  String imie;

    @Column(nullable = false)
    public  String nazwisko;

    @OneToMany
    List<Faktury> faktury;


    public Podatnik () {

    }


    public List<Faktury> getFaktury() {
        return faktury;
    }

    public void setFaktury(List<Faktury> faktury) {
        this.faktury = faktury;
    }

    public Podatnik(String imie, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
