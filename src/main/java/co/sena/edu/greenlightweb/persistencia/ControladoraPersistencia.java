/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sena.edu.greenlightweb.persistencia;

import co.sena.edu.greenlightweb.logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eslover
 */
public class ControladoraPersistencia {
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();
    
    public void registrarUsuario (Usuario u){
        try {
            usuarioJpaController.create(u);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Usuario> listarUsuario(){
        return usuarioJpaController.findUsuarioEntities();
    }
}
