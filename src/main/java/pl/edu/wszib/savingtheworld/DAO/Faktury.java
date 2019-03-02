package pl.edu.wszib.savingtheworld.DAO;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faktury {

    @Id
    @GeneratedValue
    public Long id;

    public double kwota;
    public String tytul;

    public Faktury () {

    }

    public Faktury(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
