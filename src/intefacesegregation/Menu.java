/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefacesegregation;

import java.util.Scanner;

/**
 *
 * @author almaangelica
 */
public class Menu {
    public void SeleccionarInterfaz(){
        int figura;
    String continuar="si";

    Scanner teclado=new Scanner(System.in);
    System.out.println("Bienvenido ");
    while(continuar.equalsIgnoreCase("si")){
        System.out.println("Escoga una figura");
        System.out.println("1 Triangulo");
        System.out.println("2 Rectangulo");
        System.out.println("3 Salir");
        figura=teclado.nextInt();
        if(figura==1){
            Triangulo objTria = new Triangulo();
            objTria.valores();
            System.out.println("El area es "+objTria.area());
        }
        if(figura==2){
            Rectangulo objRecta = new Rectangulo();
            objRecta.valores();
            System.out.println("El area es "+objRecta.area());
        }
        if(figura==3){
           System.out.println("¿Hacer otra operación?");
        continuar=teclado.next(); 
        }
    }
    
    }
}
