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
public class vehiculo_terrestre extends Vehiculo{
    private int numero_placa;
    private String tipo_luces,tipo_frenos,tipo_escape;

    public int getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(int numero_placa) {
        this.numero_placa = numero_placa;
    }

    public String getTipo_luces() {
        return tipo_luces;
    }

    public void setTipo_luces(String tipo_luces) {
        this.tipo_luces = tipo_luces;
    }

    public String getTipo_frenos() {
        return tipo_frenos;
    }

    public void setTipo_frenos(String tipo_frenos) {
        this.tipo_frenos = tipo_frenos;
    }

    public String getTipo_escape() {
        return tipo_escape;
    }

    public void setTipo_escape(String tipo_escape) {
        this.tipo_escape = tipo_escape;
    }
    
    protected void agregar(){}
    protected void modificar(){}
    protected void eliminar(){}
}
