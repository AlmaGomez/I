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
public class Rectangulo implements IFiguras{
    private double base;
    private double altura;
    @Override
    public void valores(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Base:");
        base=teclado.nextDouble();
        System.out.println("Altura:");
        altura=teclado.nextDouble();    
    }
    @Override
    public double area(){
        return(base*altura);
    }
}

