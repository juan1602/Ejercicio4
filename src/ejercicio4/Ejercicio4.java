/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Ejercicio4 {

    /**
     * Calcular la suma y el promedio de los números pares menores o iguales que un número K leído al comienzo.
     */
    public static void main(String[] args) 
    {
       //definicion de variables
    
       int a, suma=0,b=0,promedio;
    
    //input
        
        a= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
     //procesing
     
     while(0<a)
     {
         if(b==0)
         {
            if(a%2 != 0)
            {
             suma+= a;
             a-= 1;
             suma+= a;
             b+=2;
            }
            else
            {
              suma+=a;
              a-=2;
              b++;
            }
         }
         else
         {
         suma+= a;
         a= a-2;
         b++;
         }
     }
     promedio= suma/b;  
     //salida
     
     JOptionPane.showMessageDialog(null, "La suma de los numeros pares menores que su numero y su numero \nes de:  " + suma + "\ny su promedio es de:  " + promedio);
        
     //fin
     
     System.exit(0);
    }
    
}
