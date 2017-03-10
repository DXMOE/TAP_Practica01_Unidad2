/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author DXMOE1
 */
public class Gato extends Animales {
    double Meuw;
    public Gato (double Meuw){
        this.Meuw = Meuw;
                
    }
    @Override
    public double getSonido(){
    return Meuw;
}
}
