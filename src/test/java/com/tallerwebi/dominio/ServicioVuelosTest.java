package com.tallerwebi.dominio;

import com.tallerwebi.dominio.vuelos.RepositorioVuelo;
import com.tallerwebi.dominio.vuelos.ServicioVueloImpl;
import com.tallerwebi.dominio.vuelos.Vuelo;
import com.tallerwebi.dominio.vuelos.ServicioVuelo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServicioVuelosTest {

    RepositorioVuelo repositorioVuelo;
    ServicioVuelo servicioVuelo;
    List<Vuelo> vuelos;

    @BeforeEach
    public void init() {
        this.repositorioVuelo = mock(RepositorioVuelo.class);
        this.servicioVuelo = new ServicioVueloImpl(this.repositorioVuelo);
        this.vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1L, "aep", "eze"));
        vuelos.add(new Vuelo(2L, "aep", "brc"));
        vuelos.add(new Vuelo(3L, "aep", "eze"));
        vuelos.add(new Vuelo(4L, "aep", "eze"));
        vuelos.add(new Vuelo(5L, "brc", "eze"));
    }

    @Test
    public void cuandoListoVuelosObtengoCincoVuelos() {
        //preparación
        when(this.repositorioVuelo.obtenerVuelos()).thenReturn(vuelos);
        //ejecución
        List<Vuelo> vuelosObtenidos = this.servicioVuelo.obtenerVuelos();
        //verificación
        assertThat(vuelosObtenidos, not(empty()));
        assertThat(vuelosObtenidos.size(), is(5));
    }

    @Test
    public void cuandoObtengoUnaMascotaPorSuIdObtengoLaMascota() {
        //preparación
        when(this.repositorioVuelo.obtenerVuelos(1L)).thenReturn(new Vuelo(1L));
        //ejecución
        Vuelo vueloObtenido = this.servicioVuelo.obtenerVuelos(1);
        //verificación
        assertThat(vueloObtenido.getId(), is(1L));
    }

    @Test
    public void queAlBuscarUnVueloTraigaVuelosConElMismoOrigenYDestino() {
        //preparación
        when(this.repositorioVuelo.obtenerVuelos()).thenReturn(vuelos);
        final String ORIGEN = "aep";
        final String DESTINO = "eze";
        //ejecución
        List<Vuelo> vuelosObtenidos = this.servicioVuelo.buscarVuelos(ORIGEN, DESTINO);
        //verificación
        assertThat(vuelosObtenidos.get(0).getOrigen(), is(ORIGEN));
        assertThat(vuelosObtenidos.get(0).getDestino(), is(DESTINO));
        assertThat(vuelosObtenidos.get(1).getOrigen(), is(ORIGEN));
        assertThat(vuelosObtenidos.get(1).getDestino(), is(DESTINO));
        assertThat(vuelosObtenidos.get(2).getOrigen(), is(ORIGEN));
        assertThat(vuelosObtenidos.get(2).getDestino(), is(DESTINO));
    }
}
