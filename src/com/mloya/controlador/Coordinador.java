/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mloya.controlador;

import com.mloya.modelo.Punto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class Coordinador {
    ArrayList<Punto> puntos=new ArrayList<Punto>();
    
    public void almacenarPuntos(Punto p){
       
        p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingresa x")));
        p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingresa y")));
        puntos.add(p);
        
        
    }
    public String imprimirPuntos(){
       String datos="";
       for (Punto punto : puntos) {  //Es un for mas eficiente del que suele utilizarse
           datos+=(1+puntos.indexOf(punto))+".-"+punto.toString()+"\n";
       }
//       JOptionPane.showMessageDialog(null, datos);
       return datos;
   }
    
  
    public void menu(){
        int op=0;
        do{
            try {
                op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n"
                                   + "1.- Ingresar Punto\n"
                                    +"2.- Calcular Distancia entre dos puntos \n"
                                    +"3.- Redefinir Ubicación \n"
                                    +"4.- Calcular distancia a la torre de control \n"
                                    +"5.-Imprimir Puntos \n"
                                    +"6.- Salir"));
                switch(op){
                case 1:
                    ingresarPuntos();
                    break;
                case 2:
                    calcularDistancia();
                    break;
                case 3:
                    
                    break;
                
                case 4:
                    
                    break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,imprimirPuntos());
                    
                    break;
                    
                case 6:
                    break;
            }
                
            } catch (Exception e) {
                System.out.println("Error");
            }
            
             
        }while(op!=6);
   
   
    }
    public void ingresarPuntos(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa x"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingresa y"));
        puntos.add(new Punto (x,y));
    }
    public void calcularDistancia(){
        
       int sel1=0;
       int sel2=0;
        try {
            sel1= Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()+"\n Ingresa un puntos:"))-1;
            sel1= Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()+"\n Ingresa un puntos:"))-1;
            double v1=Math.pow(puntos.get(sel2).getX()-puntos.get(sel1).getX(),2);
            double v2=Math.pow(puntos.get(sel2).getY()-puntos.get(sel1).getY(),2);;
            double dis=Math.sqrt(v1+v2);
            JOptionPane.showMessageDialog(null, "La distancia es: "+dis);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
    
}
