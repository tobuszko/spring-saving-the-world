package pl.edu.wszib.savingtheworld.DTO;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PodatnikDTO {

    public Long pesel;
    public String imie;
    public String nazwisko;

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
