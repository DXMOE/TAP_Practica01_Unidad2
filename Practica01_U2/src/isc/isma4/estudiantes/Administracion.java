/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.estudiantes;

/**
 *
 * @author DXMOE1
 */
public class Administracion extends Estudiantes {
    double Rojo;
    public Administracion (double Rojo){
        this.Rojo = Rojo;
                
    }
    @Override
    public double getColor(){
    return Rojo;
}
}
