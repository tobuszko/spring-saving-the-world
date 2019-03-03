package pl.edu.wszib.savingtheworld.DAO;


import javax.persistence.*;

@Entity
@Table
public class Faktury {

    @Id
    @GeneratedValue
    public Long id;

    public double kwota;
    public String tytul;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="podatnik_id", nullable = false)
    Podatnik podatnik;

    public Faktury () {

    }

    public Faktury(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public Podatnik getPodatnik() {
        return podatnik;
    }

    public void setPodatnik(Podatnik podatnik) {
        this.podatnik = podatnik;
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
