package com.tallerwebi.presentacion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorDetallesVuelo {
    @RequestMapping(path = "/ingreso-detalles-vuelo", method = RequestMethod.GET)
    public ModelAndView ingresarDetallesVuelo() {
        return new ModelAndView("ingreso-detalles-vuelo");
    }
}