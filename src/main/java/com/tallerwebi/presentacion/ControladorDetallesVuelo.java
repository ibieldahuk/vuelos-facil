package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.vuelos.ServicioVuelo;
import com.tallerwebi.dominio.vuelos.Vuelo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorDetallesVuelo {

    private ServicioVuelo servicioVuelo;
    @RequestMapping(path = "/ingreso-detalles-vuelo", method = RequestMethod.GET)
    public ModelAndView ingresarDetallesVuelo() {
        return new ModelAndView("ingreso-detalles-vuelo");
    }

    @RequestMapping(path = "/listar-vuelos", method = RequestMethod.GET)
    public ModelAndView listarVuelos(){
        ModelMap modelo = new ModelMap();
        List<Vuelo> vuelos = servicioVuelo.obtenerVuelos();
        modelo.put("vuelos", vuelos);
        return new ModelAndView("listar-vuelos", modelo);
    }
}