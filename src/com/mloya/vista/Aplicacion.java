/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mloya.vista;

import com.mloya.controlador.Coordinador;
import com.mloya.modelo.Punto;

/**
 *
 * @author MARIA LOYA
 */
public class Aplicacion {
    public static void main(String[] args) {
         Coordinador coordinador = new Coordinador();
         Punto p=new Punto();
         coordinador.almacenarPuntos(p);
         coordinador.imprimirPuntos();
         coordinador.menu();
//        Punto p1= new Punto(2, 3);
//        Punto p2= new Punto(5, 6);
//        int op;
//        do {  
//            op=Integer.parseInt(JOptionPane.showInputDialog( "Deseas ingresar un Punto...?\n"
//                    + "1.- si\n"
//                    + "2.- no"));
//            if(op==1)
//            Punto.almacenarPuntos();
//        
//        } while (op!=2);
//      Punto.imprimirPuntos();
//            
//        }
//        Punto.almacenarPuntos();
//        JOptionPane.showMessageDialog(null,p1.toString()+"\n"+
//                p2.toString()+"\n"+
//                "La distancia entre dos puntos son:"
//                +Punto.calcularDistancia(p1, p2));

  }
   
    
}
