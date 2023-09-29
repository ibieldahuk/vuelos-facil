package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioLogin;
import com.tallerwebi.dominio.vuelos.ServicioVuelo;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

public class ControlaorDetallesVueloTest {

    @Test
    public void alIngresarALaPaginaDebeDevolverLaVistaCorrecta() {
        //preparación
        ServicioVuelo servicioVuelo = mock(ServicioVuelo.class);
        ControladorDetallesVuelo controladorDetallesVuelo = new ControladorDetallesVuelo(servicioVuelo);
        //ejecución
        ModelAndView modelAndView = controladorDetallesVuelo.ingresarDetallesVuelo();
        //validación
        assertThat(modelAndView.getViewName(), is("ingreso-detalles-vuelo"));
    }

    @Test
    public void alIngresarALaPaginaDebeDevolverLaVistaCorrectaV2() {
        //preparación
        ServicioVuelo servicioVuelo = mock(ServicioVuelo.class);
        ControladorDetallesVuelo controladorDetallesVuelo = new ControladorDetallesVuelo(servicioVuelo);
        //ejecución
        ModelAndView modelAndView = controladorDetallesVuelo.listarVuelos();
        //validación
        assertThat(modelAndView.getViewName(), is("listar-vuelos"));
    }
}
