package com.tallerwebi.dominio;

import com.tallerwebi.dominio.excepcion.UsuarioExistente;
import jakarta.mail.MessagingException;

public interface ServicioLogin {

    Usuario consultarUsuario(String email, String password);
    void registrar(Usuario usuario) throws UsuarioExistente;

    void enviarCorreoConfirmacion(String mail) throws MessagingException, javax.mail.MessagingException;

}
