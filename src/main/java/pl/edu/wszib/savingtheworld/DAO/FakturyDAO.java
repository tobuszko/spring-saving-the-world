package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FakturyDAO extends CrudRepository<Faktury, Long> {
    Optional<Faktury> findById (Long id);
    List<Faktury> findAll();
}
