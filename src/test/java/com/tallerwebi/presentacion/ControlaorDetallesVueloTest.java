package com.tallerwebi.presentacion;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ControlaorDetallesVueloTest {

    @Test
    public void alIngresarALaPaginaDebeDevolverLaVistaCorrecta() {
        //preparación
        ControladorDetallesVuelo controladorDetallesVuelo = new ControladorDetallesVuelo();
        //ejecución
        ModelAndView modelAndView = controladorDetallesVuelo.ingresarDetallesVuelo();
        //validación
        assertThat(modelAndView.getViewName(), is("ingreso-detalles-vuelo"));
    }

    @Test
    public void alIngresarALaPaginaDebeDevolverLaVistaCorrectaV2() {
        //preparación
        ControladorDetallesVuelo controladorDetallesVuelo = new ControladorDetallesVuelo();
        //ejecución
        ModelAndView modelAndView = controladorDetallesVuelo.listarVuelos();
        //validación
        assertThat(modelAndView.getViewName(), is("listar-vuelos"));
    }
}
