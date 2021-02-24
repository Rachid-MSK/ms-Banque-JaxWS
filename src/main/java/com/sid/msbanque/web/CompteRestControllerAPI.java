package com.sid.msbanque.web;

import com.sid.msbanque.entities.Compte;
import com.sid.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
@RequestMapping("/banque")
 //on créer rest api on utilisant spring
public class CompteRestControllerAPI {
    @Autowired
    private CompteRepository compteRepository;
    @GetMapping(path="/comptes", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }
    @GetMapping(path="/comptes/{id}", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Compte getOne(@PathVariable Long id){
        return compteRepository.findById(id).get();
    }
    @PostMapping(path="comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }
    @PutMapping(path="/compte/{id}")
    public Compte update(@PathVariable Long id, @RequestBody Compte compte){
        compte.setId(id);
        return compteRepository.save(compte);
    }
    @DeleteMapping(path="/comptes/{id}")
    public void delete(@PathVariable Long id){
        compteRepository.deleteById(id);
    }
}
