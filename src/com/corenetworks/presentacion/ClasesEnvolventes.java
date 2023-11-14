package com.corenetworks.presentacion;

public class ClasesEnvolventes {
    public static void main(String[] args) {
        //Tipos primitivos -> convertirlos en objectos
        int i=5;
        Integer iEnvolvente=i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String numero ="5";
        System.out.println(Integer.parseInt(numero));
        System.out.println("Maximo valor de long" +Long.MAX_VALUE);
        System.out.println("minimo valor de long" +Long.MIN_VALUE);

        float sueldo =1_500.50F;
        Float sEnvolvente=sueldo;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.parseFloat( "1500.5"));
        System.out.println("Valor maximo de Character " + Character.MAX_VALUE);
        System.out.println("Valor minimo de Character " + Character.MIN_VALUE);

        char letra ='b';
        Character lEnvolvente=letra;
        System.out.println("Character envolvente " +lEnvolvente);

        //UNBOXING
        int i2=iEnvolvente;
        System.out.println("clase envolvente convertido a numero primitivo" +i2);
        char letra2= lEnvolvente;
        System.out.println("Character envolvente convertido a char " + letra2);
    }
}
