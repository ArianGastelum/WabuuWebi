/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wabuuwebi.operacion;

import mx.itson.wabuuwebi.exception.DigitosException;

/**
 * Clase para la creacion de metodos de operacion
 * @author Jesus Quintero, Carlos Rebollo, Arian Gastelum
 */
public class Operacion {
   public double ConvertirCentigradosFahrenheit(double fahrenheit)throws DigitosException{
   if(fahrenheit>=9999){
   throw new DigitosException("No puedes tener mas de 9999 grados Fahrenheit");
       }
   return((fahrenheit/1.8)+32);
   }
   public double ConvertirFahrenheitCentigrados(double fahrenheit)throws DigitosException{
   if(fahrenheit>=9999){
   throw new DigitosException("No puedes tener mas de 9999 grados Fahrenheit");
       }
   return((fahrenheit*1.8)+32);
   }
}