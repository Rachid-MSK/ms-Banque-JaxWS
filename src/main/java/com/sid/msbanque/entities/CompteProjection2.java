package com.sid.msbanque.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="mobile", types=Compte.class)
public interface CompteProjection2{
        public double getsolde();
        public TypeCompte getType();
}
