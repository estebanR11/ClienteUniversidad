/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionClienteUniversidad;

import java.rmi.Naming;;
import model.IServicioUniversidad;
import view.GUIPrincipal;

/**
 *
 * @author Estudiantes
 */
public class AplicacionClienteUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            IServicioUniversidad model = (IServicioUniversidad)Naming.lookup("//127.0.0.1/ServidorUniversidad");
            GUIPrincipal gui = new GUIPrincipal(model);
            gui.setVisible(true);
        }
        catch(Exception e){
            System.out.println("Error! : " + e);
        }
            
        
       
    }
    
}
