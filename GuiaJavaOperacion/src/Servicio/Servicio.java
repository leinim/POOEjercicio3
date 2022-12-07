/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import guiajavaoperacion.Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author pulaf
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    public Operacion crearOperacion(){
        System.out.println("Ingrese dos numeros");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        return new Operacion(numero1, numero2);
    }
    public int sumar(int numero1, int numero2){
        int suma= numero1+numero2;
        return suma;
    }
     public int resta(int numero1, int numero2){
        int resta= numero1-numero2;
        return resta;
     }
      public int multiplicar(int numero1, int numero2){
       if (numero1!=0 && numero2!=0){
        int multiplicar= numero1*numero2;
        return multiplicar;
      }else
              System.out.println("Error, no se permite la multiplicacion con cero");
       return 0;
      }
       public int dividir(int numero1, int numero2){
       if (numero1!=0 && numero2!=0){
        int dividir= numero1/numero2;
        return dividir;
      }else
              System.out.println("Error, no se permite la division con cero");
       return 0;
      }
}
