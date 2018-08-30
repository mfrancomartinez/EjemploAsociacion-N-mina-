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
public class VistaConcreta extends VistaAbstracta{

    @Override
    public void visualizar() {                
        System.out.println("El salario neto es: "+modelo.getResultado());
    }
    
}
