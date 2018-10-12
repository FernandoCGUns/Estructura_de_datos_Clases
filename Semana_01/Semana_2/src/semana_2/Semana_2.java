/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Cecomp
 */
public class Semana_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       // Ejemplo Numero 01
       boolean f = true,t=true;
       // n: Numero de Elementos a Capturar por teclado.
       int n=0,i, p =0,res=0,r=0;
       String lista ="";
        
       
        do {
            try{
                do {
                    p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de estudiantes"));                        
                } while (p<=0);

             }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, " Dato Incorrecto ");
            }
            n=p;
                // Arreglos

            String nombres[] = new String[n];
            int edades[] = new int[n];

            int multiplos[] = new int[n];

            int posicionmultiplo = 0;

            // Variables ;
            int menor=9999;
            int mayor=0;
            int suma=0;
            double promedio = 0;

            for (i=0; i< p;i++){               
                do {
                    try{
                        
                        nombres[i]= JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+ (i+1)+": ");
                        
                        if(nombres[i].matches("[a-z]*")) {
                           f=true;
                        }else {
                           f=false; 
                        }
                       
                    }catch(NullPointerException a){
                        JOptionPane.showMessageDialog(null, "Ingrese nuevamente");
                    }                
                } while (f!=true);

                do {
                    try{
                        edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del estudiante Numero :  " + (i+1) + " "));
                        
                    }catch(NumberFormatException q){
                        JOptionPane.showMessageDialog(null, "Ingrese nuevamente la edad");
                    }                
                } while (edades[i]<=0);


                if (edades[i] <= menor) {   
                    menor = edades[i];
                }

                if (edades[i] >= mayor) {
                    mayor = edades[i];
                }
               // es Multiplo de Siete

                if (EsMultiplodeSiete(edades[i])) {

                    multiplos[posicionmultiplo] = edades[i];
                    posicionmultiplo++;

                }

            //
            suma = suma + edades[i]; 
            promedio = suma / n;

            // Impresion de Datos.

            }
             if (p==JOptionPane.CLOSED_OPTION) {

             }else{
                // Impresion de Nombres
                for (i=0; i < nombres.length;i++){
                    lista = lista + (i+1) + " " + nombres[i] + "\n";
                }

                //  Impresion de edades mayor y menor

                lista = lista + " La Edad Mayor es :  " + mayor + "\n";
                lista = lista + " La Edad Menor es :  " + menor + "\n";
                lista = lista + " El Promedio es :  " + promedio + "\n";
                lista = lista + " La Suma es :  " + suma + "\n";

                lista = lista + "************************\n";
                
                lista = lista +"Los multiplos de 7 son: \n"  ;
                // Impresion Multiplos de Siete   
                for (i=0; i < multiplos.length;i++) {
                    if (multiplos[i] > 0) {

                        lista = lista + (i+1) + ".- " + multiplos[i] + "\n";

                    }           
                }            
                JOptionPane.showMessageDialog(null,lista);
            }            
            res=JOptionPane.showConfirmDialog(null, "Desea Seguir");
        } while (res==JOptionPane.YES_OPTION);    
    }
       
    public static boolean EsMultiplodeSiete(int pnNumero)
    {
        boolean bresultado = false;
        
        if (pnNumero == 0) {
            bresultado= false;
        }
        
        if (pnNumero % 7 == 0) {
            bresultado= true;
        } else {
            bresultado= false;
        }
        
        return bresultado;
    }   
    }
    

