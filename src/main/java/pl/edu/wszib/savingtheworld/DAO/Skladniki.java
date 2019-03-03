package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.Id;


import javax.persistence.*;

@Entity
@Table
public class Skladniki {

   @Id
   @GeneratedValue
   public Long Id;

   //@Column(nullable = false)
   public  int ilosc;

   @OneToOne(fetch = FetchType.EAGER)
   //@JoinColumn(name="typskladnika_id",nullable = false)
   TypSkladnika typSkladnika;

   @ManyToOne
   @JoinColumn(name="przepis_id",nullable = false)
   Przepis przepis;


   public Skladniki (){
   }


    public Skladniki(int ilosc) {
        this.ilosc = ilosc;
    }


    public Skladniki(int ilosc, TypSkladnika typSkladnika, Przepis przepis) {
        this.ilosc = ilosc;
        this.typSkladnika = typSkladnika;
        this.przepis = przepis;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}
