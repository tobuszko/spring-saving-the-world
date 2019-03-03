package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypSkladnikaDAO extends CrudRepository<TypSkladnika, Long> {
    List<TypSkladnika> findAll();




}
