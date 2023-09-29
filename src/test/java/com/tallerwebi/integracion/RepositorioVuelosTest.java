package com.tallerwebi.integracion;

import com.tallerwebi.dominio.vuelos.RepositorioVuelo;
import com.tallerwebi.dominio.vuelos.Vuelo;
import com.tallerwebi.infraestructura.RepositorioVueloImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RepositorioVuelosTest {

    @Test
    public void queMeDevuelvaCincoVuelos(){
        RepositorioVuelo repositorioVuelo = new RepositorioVueloImpl();

        List<Vuelo> vuelosObtenidos = repositorioVuelo.obtenerVuelos();

        assertThat(vuelosObtenidos.size(), is(5));
    }
}
