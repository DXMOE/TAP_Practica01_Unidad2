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
public class Cerdo extends Animales {
   double Oink;
    public Cerdo (double Oink){
        this.Oink = Oink;
                
    }
    @Override
    public double getSonido(){
    return Oink;
}
}
