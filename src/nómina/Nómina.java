/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nómina;

/**
 *
 * @author admin
 */
public class Nómina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaAbstracta v = new VistaConcreta();
        ModeloAbstracto m = new ModeloConcreto();        
        m.vista = v;
        v.modelo = m;
        
        m.llamar();
        
    }
       
    
}
