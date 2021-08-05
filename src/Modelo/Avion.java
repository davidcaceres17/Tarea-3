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
public class Avion extends Vehiculo_aereo{
    private String tipo_alerones,tipo_estabilizadores,tipo_tren_aterrizaje;

    public String getTipo_alerones() {
        return tipo_alerones;
    }

    public void setTipo_alerones(String tipo_alerones) {
        this.tipo_alerones = tipo_alerones;
    }

    public String getTipo_estabilizadores() {
        return tipo_estabilizadores;
    }

    public void setTipo_estabilizadores(String tipo_estabilizadores) {
        this.tipo_estabilizadores = tipo_estabilizadores;
    }

    public String getTipo_tren_aterrizaje() {
        return tipo_tren_aterrizaje;
    }

    public void setTipo_tren_aterrizaje(String tipo_tren_aterrizaje) {
        this.tipo_tren_aterrizaje = tipo_tren_aterrizaje;
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
        System.out.println("Tipo de alerones " + getTipo_alerones());
        System.out.println("Tipo de estabilizadores: " + getTipo_estabilizadores());
        System.out.println("Tipo del tren de aterrizaje: " + getTipo_tren_aterrizaje());
    }
}
