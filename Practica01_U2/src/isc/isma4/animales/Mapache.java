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
public class Mapache extends Animales {
    double Ekk;
    public Mapache (double Ekk){
        this.Ekk = Ekk;
                
    }
    @Override
    public double getSonido(){
    return Ekk;
}
}
