package com.tallerwebi.dominio.vuelos;

public class Vuelo {

    private long id;
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
