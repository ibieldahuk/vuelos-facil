package com.tallerwebi.dominio.vuelos;

import java.util.List;

public interface ServicioVuelo {
    List<Vuelo> obtenerVuelos();

    Vuelo obtenerVuelos(long id);

    List<Vuelo> buscarVuelos(String origen, String destino);
}
