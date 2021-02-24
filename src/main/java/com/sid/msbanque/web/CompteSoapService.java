package com.sid.msbanque.web;

import com.sid.msbanque.entities.Compte;
import com.sid.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Component //POUR QUE CA SOIT UN COMPOSANT SPRING
@WebService(serviceName = "BanqueWS")
// la methode de jaxWS
public class CompteSoapService {
    @Autowired
    private CompteRepository compteRepository;
    @WebMethod //pour consulter la liste des comptes
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }
    @WebMethod
    public Compte getOne(@WebParam(name="id") Long id){
        return compteRepository.findById(id).get();
    }


}
