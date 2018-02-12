/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;
import area.solucion.*;
/**
 *
 * @author Estudiantes
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE TIPO DE FIGURA SE VA A ANALIZAR?");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo Rectangulo");
        System.out.println("4.Circulo");
        int opcion = sc.nextInt();
        int x1, x2, y1, y2, s, area, perimetro= 0;
        System.out.println("Ingres la posicion del punto 1 en el eje X");
        x1 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 1 en el eje y");
        y1 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 2 en el eje X");
        x2 = sc.nextInt();
        System.out.println("Ingres la posicion del punto 2 en el eje y");
        y2 = sc.nextInt();
        Datos d;
        switch (opcion) {
            case 1:
                d = new cuadrado ();
                break;
            case 2:
            case 3:
            case 4:
        }
        d.setX1(x1);
        
    }

}
