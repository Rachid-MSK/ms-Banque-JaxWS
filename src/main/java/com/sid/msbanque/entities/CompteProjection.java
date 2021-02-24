package com.sid.msbanque.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="solde", types=Compte.class)
interface CompteProjection1{
    public double getSolde();
}
