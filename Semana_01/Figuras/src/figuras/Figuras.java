
package figuras;

import javax.swing.*;
import java.io.*;


public class Figuras implements FigurasInterface{

    public static void main(String[] args) {
        
        double area=0;
        //tipo de dato nombre_variable= palabra reservada(new) tipo de dato (alcance) 
        Figuras ofiguras= new Figuras();
        int l=0,a=0,al=0,b=0,r=0,op=0,res=0;
         //-----------------------------------------------------------------------------
                  
        do {
            rectangulo orectangulo=new rectangulo();
            try{
                do {
                    op=Integer.parseInt(JOptionPane.showInputDialog("Seleccion Opcion: \n"
                        + "1.- Rectangulo \n"
                        + "2.- Triangulo \n"
                        + "3.- Circulo \n"));                             
                } while (op<1 || op>3);
            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, " Dato Incorrecto ");
            }
            
            if (op!=JOptionPane.CLOSED_OPTION) {
                switch(op){
                    case 1:
                            JOptionPane.showMessageDialog(null, " Area del Rectangulo ");
                        do {
                            try{
                            l = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Lado:"));
                            orectangulo.set_lado(l);

                            }catch(NumberFormatException q){
                                JOptionPane.showMessageDialog(null, "Ingrese el valor nuevamente");
                            }
                        } while ( l <=0 );

                        do {
                            try{
                            a = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Ancho:"));
                            orectangulo.set_ancho(a);     
                            }catch (NumberFormatException q){
                                JOptionPane.showMessageDialog(null, "Ingrese el valor nuevamente");
                            }
                        } while (a<=0);             
                        area=ofiguras.CalculoArea(orectangulo);
                        break;
                    case 2:
                        triangulo otriangulo=new triangulo();
                        JOptionPane.showMessageDialog(null, "Area del Triangulo");
                        do {
                            try{
                            b = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Base:"));
                             otriangulo.set_base(b);      
                            }catch (NumberFormatException q){
                                JOptionPane.showMessageDialog(null, "Ingrese el valor nuevamente");
                            }
                        } while (b<=0);

                        do {
                            try{
                            al = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Altura:"));
                            otriangulo.set_altura(al);     
                            }catch (NumberFormatException q){
                                JOptionPane.showMessageDialog(null, "Ingrese el valor nuevamente");
                            }
                        } while (al<=0);
                        area=ofiguras.CalculoArea(otriangulo);
                        break;
                    case 3:
                        circulo ocirculo= new circulo();
                        JOptionPane.showMessageDialog(null,"Area del Circulo");
                        do {
                            try{
                            r = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Radio:"));
                            ocirculo.set_radio(r);     
                            }catch (NumberFormatException q){
                                JOptionPane.showMessageDialog(null, "Ingrese el valor nuevamente");
                            }
                        } while (r<=0);               
                        area=ofiguras.CalculoArea(ocirculo);
                        break;                        
                }
                res=JOptionPane.showConfirmDialog(null, "Desea Seguir");
            }
        } while (res==JOptionPane.YES_OPTION);
    }

    @Override
    public double CalculoArea(Object obj) {
        
        double area=0;
        //System.out.println(obj.getClass().getSimpleName());
        switch (obj.getClass().getSimpleName()){
            case "circulo":
                circulo ocirculo=(circulo)obj;
                area= circulo.pi * Math.pow(ocirculo.get_radio(), 2)  ;
                JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
                break;                
            case "triangulo":
                triangulo otriangulo=(triangulo)obj;
                area= (otriangulo.get_base()*otriangulo.get_altura())/2;
                JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
                break;
            case "rectangulo":
                rectangulo orectangulo=(rectangulo)obj;
                area= orectangulo.get_lado()*orectangulo.get_ancho();
                JOptionPane.showMessageDialog(null, "El area del Rectangulo es: " + area);
                break;
       }
       return area;
    }
    
}
