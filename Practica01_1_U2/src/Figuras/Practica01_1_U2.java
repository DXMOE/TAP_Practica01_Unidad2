/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import isc.isma4.figuras.IFigura; 
import isc.isma4.animales.IAnimales;
import isc.isma4.estudiantes.IEstudiantes;
import isc.isma4.algoritmos.IAlgoritmos;


/**
 *
 * @author DXMOE1
 */
public class Practica01_1_U2 {

   
    public static void main(String[] args) {
    }
        public double getFiguraArea(IFigura figura){
            return figura.getArea();
        }
         public double getAnimalesSonido(IAnimales animales){
            return animales.getSonido();
        }
          public double getEstudiantesColor(IEstudiantes estudiantes){
            return estudiantes.getColor();
        }
          
    }
   
           

