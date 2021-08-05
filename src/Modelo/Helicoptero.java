/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author justo
 */
public class Helicoptero extends Vehiculo_aereo{
    private String tipo_patin_cola,tipo_mastil,tipo_patin_aterrizaje;
    private int numero_elices;

    public String getTipo_patin_cola() {
        return tipo_patin_cola;
    }

    public void setTipo_patin_cola(String tipo_patin_cola) {
        this.tipo_patin_cola = tipo_patin_cola;
    }

    public String getTipo_mastil() {
        return tipo_mastil;
    }

    public void setTipo_mastil(String tipo_mastil) {
        this.tipo_mastil = tipo_mastil;
    }

    public String getTipo_patin_aterrizaje() {
        return tipo_patin_aterrizaje;
    }

    public void setTipo_patin_aterrizaje(String tipo_patin_aterrizaje) {
        this.tipo_patin_aterrizaje = tipo_patin_aterrizaje;
    }

    public int getNumero_elices() {
        return numero_elices;
    }

    public void setNumero_elices(int numero_elices) {
        this.numero_elices = numero_elices;
    }
    
    @Override
    
    protected void agregar(){
        System.out.println("Numero de llantas: " + this.getNumero_llantas());
        System.out.println("Numero de chasis: " + this.getNumero_chasis());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tipo de Motor: " + this.getTipo_motor());
        System.out.println("Color: " + this.getColor());
        System.out.println("Tipo de cola: " + this.getTipo_cola());
        System.out.println("Tipo de fuselaje: " + this.getTipo_fuselaje());
        System.out.println("Tipo de patin cola " + getTipo_patin_cola());
        System.out.println("Tipo del mastil: " + getTipo_mastil());
        System.out.println("Tipo del patin de aterrizaje: " + getTipo_patin_aterrizaje());
        System.out.println("Numero de elices: " + getNumero_elices());
    }
}
