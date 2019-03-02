package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {

    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    FakturyDAO fakturyDAO;

    @PostConstruct
    public void init() {

        IntStream.range(0, 10).forEach(i ->  {
                        Faktury f = new Faktury(3.50, "cos");
                        f = fakturyDAO.save(f);
                });

        List<Faktury> wszystkie = fakturyDAO.findAll();

        IntStream.range(0, 50).forEach(i -> {
                        Podatnik p = new Podatnik("ADam" + i, "Adam" + i);
                        p.setFaktury(Arrays.asList(wszystkie.get(i % 10), wszystkie.get((i+5) % 10)));
                        p = podatnikDAO.save(p);
                        p.getImie();
        });
    }
    @PreDestroy
    public void teardown() {

    }


}
