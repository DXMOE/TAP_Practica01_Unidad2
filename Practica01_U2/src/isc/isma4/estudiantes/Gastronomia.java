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
public class Gastronomia extends Estudiantes {
 double Blanco;
    public Gastronomia (double Blanco){
        this.Blanco = Blanco;
                
    }
    @Override
    public double getColor(){
    return Blanco;
}
}   

