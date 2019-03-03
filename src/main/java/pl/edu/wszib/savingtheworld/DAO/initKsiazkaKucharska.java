package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Component
public class initKsiazkaKucharska {

    @Autowired
    KsiazkaKucharskaDAO ksiazkaKucharskaDAO;

    @Autowired
    PrzepisDAO przepisDAO;

    @Autowired
    SkladnikiDAO skladnikiDAO;

    @Autowired
    TypSkladnikaDAO typSkladnikaDAO;


    @PostConstruct
    public void init() {

        IntStream.range(0, 100).forEach(l ->  {
            TypSkladnika typSkladnika = new TypSkladnika("skladnik nr " + l);
            typSkladnikaDAO.save(typSkladnika);
        });


        KsiazkaKucharska ksiazkaKucharska = new KsiazkaKucharska("Przepisy Tom");
        ksiazkaKucharska = ksiazkaKucharskaDAO.save(ksiazkaKucharska);

        Przepis przepis = new Przepis("Zupa nr" );
        przepis.setKsiazkaKucharska(ksiazkaKucharska);
        przepis = przepisDAO.save(przepis);

        List<TypSkladnika> typSkladnika = typSkladnikaDAO.findAll();
        for (TypSkladnika t: typSkladnika){
            Skladniki skladniki = new Skladniki(new Random().nextInt(5)+ 1);
            skladniki.setTypSkladnika(t);
            skladniki.setPrzepis(przepis);
            skladnikiDAO.save(skladniki);
        }



/*                        IntStream.range(0, 100).forEach(j ->  {
*//*                            Przepis przepis = new Przepis("Zupa nr" + j);
                            przepis.setKsiazkaKucharska(ksiazkaKucharskaSAVED);
                            Przepis przepisSAVED = przepisDAO.save(przepis);*//*

                                    IntStream.range(0, 100).forEach(k ->  {
                                        Skladniki skladniki = new Skladniki(1+k);
                                        skladniki.setPrzepis(przepisSAVED);
                                        Skladniki skladnikiSAVED = skladnikiDAO.save(skladniki);

                            });
        });*/

        System.out.println();

    }



    @PreDestroy
    public void teardown() {

    }



}
