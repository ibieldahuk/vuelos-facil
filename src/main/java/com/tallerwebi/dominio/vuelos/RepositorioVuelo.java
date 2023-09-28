package com.tallerwebi.dominio.vuelos;

import java.util.List;

public interface RepositorioVuelo {

    public List<Vuelo> obtenerVuelos();

    Vuelo obtenerVuelos(long id);
}
