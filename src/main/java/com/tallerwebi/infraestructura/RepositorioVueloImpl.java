package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.vuelos.RepositorioVuelo;
import com.tallerwebi.dominio.vuelos.Vuelo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioVueloImpl implements RepositorioVuelo {

    @Override
    public List<Vuelo> obtenerVuelos() {
        List<Vuelo> vuelos = new ArrayList<>();
        for(int i=0; i<5;i++){
            vuelos.add(new Vuelo(i+1));
        }
        return vuelos;
    }

    @Override
    public Vuelo obtenerVuelos(long id) {
        return new Vuelo(id);
    }
}
