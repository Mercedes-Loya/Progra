/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mloya.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "P ("+getX()+","+getY()+")";
    }
    
    public static double calcularDistancia(Punto p1, Punto p2){
        return Math.sqrt(Math.pow(((double)p2.getX()-(double)p1.getX()),2)
                        + Math.pow(((double)p2.getY()-(double)p1.getY()),2));
                            
    }
    
//    static ArrayList<Punto>puntos= new ArrayList<Punto>();
//   public static void almacenarPuntos(){
//     int op1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el punto 1 ")) ;
//     int op2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el punto 2 ")) ;
//     puntos.add(new Punto(op1, op2));
//     puntos.add(calcularDistancia(op1, op2));
//   }
//   public static void imprimirPuntos(){
//       String datos="";
//       for (Punto punto : puntos) {
//           datos+="\n"+punto.toString();
//       }
//       JOptionPane.showMessageDialog(null, datos);
//   }
    
    
    
}
