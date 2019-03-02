package pl.edu.wszib.savingtheworld.DAO;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.DTO.PodatnikDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/podartnik")
public class PodatnikController {


    @Autowired
    FakturyDAO fakDao;


    @Autowired
    PodatnikDAO dao;

    @Autowired
    Mapper mapper;


    @GetMapping
    public PodatnikDTO podatnik (@RequestParam Long pesel) {
        return dao.findById(pesel).map(podatnik -> mapper.map(podatnik, PodatnikDTO.class)).orElse(null);

    }


/*
    @GetMapping
    public FakturyDAO faktury (@RequestParam Long id) {
        return fakDao.findById(id).orElse(null);
    }
*/


    @GetMapping("/all")
    public List<PodatnikDTO> podatnicy() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(podatnik -> mapper.map(podatnik, PodatnikDTO.class))
                .collect(Collectors.toList());
    }


    @PostMapping
    public PodatnikDTO zapisz(PodatnikDTO podatnik){

        return mapper.map(dao.save(mapper.map(podatnik, Podatnik.class)), PodatnikDTO.class);
    }


    @DeleteMapping
    public PodatnikDTO usun (Long pesel){
        Podatnik p = dao.findById(pesel).orElse(null);
        dao.deleteById(pesel);
        return mapper.map(p, PodatnikDTO.class);
    }




}
