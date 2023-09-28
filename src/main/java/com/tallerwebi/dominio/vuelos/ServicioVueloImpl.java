package com.tallerwebi.dominio.vuelos;

import com.tallerwebi.infraestructura.RepositorioVueloImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ServicioVueloImpl implements ServicioVuelo {

    private RepositorioVuelo repositorioVuelo;

    @Autowired
    public ServicioVueloImpl (RepositorioVuelo repositorioVuelo) {
        this.repositorioVuelo = repositorioVuelo;
    }

    @Override
    public List<Vuelo> obtenerVuelos() {
        return repositorioVuelo.obtenerVuelos();
    }

    @Override
    public Vuelo obtenerVuelos(long id) {
        return repositorioVuelo.obtenerVuelos(id);
    }

    @Override
    public List<Vuelo> buscarVuelos(String origen, String destino) {
        List<Vuelo> vuelosObtenidos = repositorioVuelo.obtenerVuelos();
        List<Vuelo> vuelosCoincidentes = new ArrayList<>();
        for (int i = 0; i < vuelosObtenidos.size(); i++) {
            Vuelo vuelo = vuelosObtenidos.get(0);
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                vuelosCoincidentes.add(vuelo);
            }
        }
        return vuelosCoincidentes;
    }
}
