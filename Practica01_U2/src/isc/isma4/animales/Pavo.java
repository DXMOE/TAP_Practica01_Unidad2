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
public class Pavo extends Animales {
   double Gluglu;
    public Pavo (double Gluglu){
        this.Gluglu = Gluglu;
                
    }
    @Override
    public double getSonido(){
    return Gluglu;
} 
}
