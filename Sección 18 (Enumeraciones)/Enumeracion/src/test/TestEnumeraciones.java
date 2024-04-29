package test;

import enumeracion.Continentes;
//import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Continente #5: "+Continentes.AFRICA);
        System.out.println("No de paises por continente: "+Continentes.AFRICA.getPaises());
        System.out.println("No de habitantes por continente: "+Continentes.AFRICA.getHabitantes());
    } 
}
