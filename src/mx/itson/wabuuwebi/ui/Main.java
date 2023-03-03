/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wabuuwebi.ui;

import java.util.Scanner;
import mx.itson.wabuuwebi.exception.DigitosException;
import mx.itson.wabuuwebi.operacion.Operacion;

/**
 * Clase Main relacionada con la interfaz de usuario
 * @author Jesus Quintero, Carlos Rebollo, Arian Gastelum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);
        System.out.println("¡Bienvenido al convertidor de grados!");
        System.out.println("1.- Convertir de Centigrados a Fahrenheit");
        System.out.println("1.- Convertir de Fahrenheit a Centigrados");
        int respuesta = lector.nextInt();
        Operacion operacion = new Operacion();
        try{
            switch (respuesta) {
                case 1:
                    {
                        System.out.println("Ingrese los grados centigrados ");
                        double dato = lector.nextDouble();
                        operacion.ConvertirCentigradosFahrenheit(dato);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Ingrese los grados fahrenheit ");
                        double dato = lector.nextDouble();
                        operacion.ConvertirCentigradosFahrenheit(dato);
                        break;
                    }
                default:
                        System.out.println("¡¡Esa una es una opcion!!");
                        break;
            }
        }catch(DigitosException ex){
            System.out.println("No es poosible ingresar mas de 4 digitos!!" + ex.getMessage());
        }
    }
    
    
}
