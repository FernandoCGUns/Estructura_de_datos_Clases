/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_03;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author hp
 */
public class Semana_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int a[]=new int[17];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*17);                    
        }
        System.out.print("a = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");       */        
        int nCantidadDatos=0;
        JOptionPane.showConfirmDialog(null, "Desea iniciar el programa");
        if (JOptionPane.YES_OPTION==0) {
            do {
                try{
                    nCantidadDatos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Datos"));
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Ingrese nuevamente");
                }
            } while (nCantidadDatos<=0);    

            int nValorMinimo=0;
            int nValorMaximo=10000;
            int a[]=new int [nCantidadDatos];
            Ordenamiento o=new Ordenamiento ();
            int[] oArreglo = o.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
            //"Metodo Quickshort"
            long nIniciotiempo= System.currentTimeMillis();
            Ordenamiento.Quickshort(oArreglo, 0, oArreglo.length - 1);            
            long nRetardoTiempo = System.currentTimeMillis() - nIniciotiempo;
            //"Metodo burbuja"
            long nIniciotiempo1= System.currentTimeMillis();
            Ordenamiento.Burbuja(oArreglo);
            long nRetardoTiempo1 = System.currentTimeMillis() - nIniciotiempo1;
            //"Metodo Shell"
            long nIniciotiempo2= System.currentTimeMillis();
            Ordenamiento.Shell(oArreglo);
            long nRetardoTiempo2 = System.currentTimeMillis() - nIniciotiempo2;
            //"Metodo Insercion"
            long nIniciotiempo3= System.currentTimeMillis();
            Ordenamiento.Insercion(oArreglo);
            long nRetardoTiempo3 = System.currentTimeMillis() - nIniciotiempo3;
            JOptionPane.showMessageDialog(null, "Cantidad de Registro:  " + nCantidadDatos  + " \n"
                + " \n"
                + "Metodo                  |"+"     Tiempo de ordenamiento \n" 
                + "------------------------------------------------------------------- \n"
                + "Burbuja                  |                         "+ nRetardoTiempo1+" \n"
                + "Shell                       |                         "+nRetardoTiempo2 + " \n"
                + "Quickshort           |                         "+nRetardoTiempo+ " \n"
                + "Inserccion            |                         "+nRetardoTiempo3 );
            System.out.println("");   
            System.out.println("Metodo Burbuja");
            long nIniciotiempo5= System.currentTimeMillis();
            Ordenamiento.Burbuja(oArreglo);
            long nRetardoTiempo5 = System.currentTimeMillis() - nIniciotiempo5;
            System.out.println("Arreglo Ordenado");
            for (int n: oArreglo) {

                System.out.print(" "+n);
            }
            System.out.println("");
            System.out.println("Tiempo Ejecucion "+nRetardoTiempo5);
        }else{
            JOptionPane.showMessageDialog(null, " Gracias ");
        }
            

        
        
          
    }
    
}
