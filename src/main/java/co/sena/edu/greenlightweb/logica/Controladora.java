/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sena.edu.greenlightweb.logica;

import co.sena.edu.greenlightweb.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Eslover
 */
public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void registrarUsuarios(Usuario u){
        controladoraPersistencia.registrarUsuario(u);
    }
    
    public List<Usuario> listarUsuarios(){
        return controladoraPersistencia.listarUsuario();
    }
}
