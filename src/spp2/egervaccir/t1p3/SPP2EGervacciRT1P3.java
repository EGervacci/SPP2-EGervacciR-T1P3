/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.t1p3;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SPP2EGervacciRT1P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Erick Eduardo Gervacci Romero A01410809 (IIS)
        //Presentación
System.out.println("Distancia entre dos puntos");

//Variables
Scanner k = new Scanner (System.in);
double x1,x2,y1,y2,d;

//Ejecución
System.out.println("Coordenadas del primer punto.");
System.out.println("Valor de X1");
x1 = k.nextDouble();
System.out.println("Valor de Y1");
y1 = k.nextDouble();

System.out.println("Coordenadas del segundo punto.");
System.out.println("Valor de X2");
x2 = k.nextDouble();
System.out.println ("Valor de Y2"); 
y2 = k.nextDouble();

//Operaciones
d = Math.sqrt (((Math.pow(x1-x2,2)) + ((Math.pow(y1-y2,2)))));

//Resultados 
System.out.println("La distancia calculada es de: " + d);
    }
    
}

