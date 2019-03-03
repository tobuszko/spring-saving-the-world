package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkladnikiDAO extends CrudRepository <Skladniki, Long> {

    List<Skladniki> findAll();

}
