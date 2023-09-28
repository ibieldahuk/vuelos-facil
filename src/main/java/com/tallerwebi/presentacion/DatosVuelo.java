package com.tallerwebi.presentacion;

import java.util.Date;

public class DatosVuelo {


    private String origen;
    private String destino;
    private Boolean ida;
    private Boolean idaYVuelta;
    private Date fecha;

    public DatosVuelo () {}

    public DatosVuelo (String origen, String destino, Boolean ida, Boolean idaYVuelta, Date fecha) {
        this.origen = origen;
        this.destino = destino;
        this.ida = ida;
        this.idaYVuelta = idaYVuelta;
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Boolean getIda() {
        return ida;
    }

    public void setIda(Boolean ida) {
        this.ida = ida;
    }

    public Boolean getIdaYVuelta() {
        return idaYVuelta;
    }

    public void setIdaYVuelta(Boolean idaYVuelta) {
        this.idaYVuelta = idaYVuelta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
