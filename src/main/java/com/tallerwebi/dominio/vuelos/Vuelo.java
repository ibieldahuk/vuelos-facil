package com.tallerwebi.dominio.vuelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origen;
    private String destino;

    public Vuelo(long id) {
        this.id = id;
    }

    public Vuelo(long id, String origen, String destino) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo() {

    }

    public long getId() {
        return this.id;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }
}
