package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.Id;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table
public class TypSkladnika {

    @Id
    @GeneratedValue
    public Long Id;

    @Column(nullable = false, unique = true)
    String nazwa; //unikalne


    public TypSkladnika (){
    }


    public TypSkladnika(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
