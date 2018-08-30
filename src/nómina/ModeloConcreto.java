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
public class ModeloConcreto extends ModeloAbstracto{
    public double salario = 3000;
    public double impuestos = 1000;
    public double desplazamiento = 200;
    public double resultado;

    @Override
    public void operacion() {                
        resultado = (salario-impuestos+desplazamiento);        
    }
    
    @Override
    public double getResultado() {
        return resultado;
    }

    
    
}
