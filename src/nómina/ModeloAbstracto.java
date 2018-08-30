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
public abstract class ModeloAbstracto implements IModelo{
    VistaAbstracta vista;
    
    public void llamar(){
        operacion();
        vista.visualizar();
    }
}
