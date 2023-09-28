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
        vuelos.add(new Vuelo(1L));
        vuelos.add(new Vuelo(2L));
        vuelos.add(new Vuelo(3L));
        vuelos.add(new Vuelo(4L));
        vuelos.add(new Vuelo(5L));
        return vuelos;
    }

    @Override
    public Vuelo obtenerVuelos(long id) {
        return new Vuelo(id);
    }
}
