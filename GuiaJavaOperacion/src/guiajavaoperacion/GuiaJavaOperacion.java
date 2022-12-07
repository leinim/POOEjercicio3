/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaoperacion;

import Servicio.Servicio;
import guiajavaoperacion.Operacion.Operacion;

/**
 *
 * @author pulaf
 */
public class GuiaJavaOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio so = new Servicio();
        Operacion conNumeros = so.crearOperacion();
        System.out.println(conNumeros);
    }
    
}
