package com.example.autos;

public class Principal {
    public static void main(String[] args) {
        Auto vento = new Auto("Volkswagen", "Vento", 2015);
        Auto golf = new Auto("Volkswagen", "Golf", 2020);
        Auto cruze = new Auto("Chevrolet", "Cruze", 2018);
        Auto vocho = new Auto();
        // System.out.println(vento.toString());
        Auto[] lote = new Auto[4];
        lote[0] = vento;
        lote[1] = golf;
        lote[2] = cruze;
        lote[3] = vocho;
        System.out.println("Mi lote de autos tiene el siguiente inventario: ");
        for (Auto a:lote){
            System.out.println("------------------");
            System.out.println(a.toString());
        }

    }
}
