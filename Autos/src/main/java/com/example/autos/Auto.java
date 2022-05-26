package com.example.autos;
import java.time.LocalDate;

public class Auto {
    private String marca;
    private String modelo;
    private Integer ano;

    public Auto (String marcaA, String modeloA, Integer anoA)
        {
            marca = marcaA;
            modelo = modeloA;
            ano = anoA;
        }
        public Auto()
        {
            this.marca = "VW";
            this.modelo = "Porche";
            this.ano = 2000;
        }
        public String toString()
        {
            String cadena = "\nMarca: " + this.marca + "\nModelo: " + "\nAño: " + this.ano;
            return cadena;
        }
        public Boolean isPreowned()
        {
            LocalDate date = LocalDate.now();
            Integer ano = date.getYear();
            if (this.ano<ano)
            {
                return Boolean.TRUE;
            }
            else
            {
                return Boolean.FALSE;
            }
        }
}