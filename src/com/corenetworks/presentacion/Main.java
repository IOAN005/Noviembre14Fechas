package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.getClass());


        Producto p1=new Producto(1,5);
        Producto p2 =new Producto(1,5);
        Producto p3=p1;
        System.out.println(p1.toString());
        System.out.println("Equals de producto "+ p1.equals(p2));
        System.out.println("Equals de producto " +p1.equals(p3));
        System.out.println("Hash code " +p1.hashCode());
        System.out.println("Hash code "+ p2.hashCode());
        System.out.println(p1.getClass());
        //Probar metodo iva
        System.out.println("iva ->" + p1.iva());





    }
}