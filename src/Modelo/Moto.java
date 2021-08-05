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
public class Moto extends vehiculo_terrestre{
    private int licencia_conducir,numero_rin;
    private String marca,tipo_manigueta,tipo_pedales;

    public int getLicencia_conducir() {
        return licencia_conducir;
    }

    public void setLicencia_conducir(int licencia_conducir) {
        this.licencia_conducir = licencia_conducir;
    }

    public int getNumero_rin() {
        return numero_rin;
    }

    public void setNumero_rin(int numero_rin) {
        this.numero_rin = numero_rin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_manigueta() {
        return tipo_manigueta;
    }

    public void setTipo_manigueta(String tipo_manigueta) {
        this.tipo_manigueta = tipo_manigueta;
    }

    public String getTipo_pedales() {
        return tipo_pedales;
    }

    public void setTipo_pedales(String tipo_pedales) {
        this.tipo_pedales = tipo_pedales;
    }
    
    @Override
    
    protected void agregar(){
        System.out.println("Numero de llantas: " + this.getNumero_llantas());
        System.out.println("Numero de chasis: " + this.getNumero_chasis());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tipo de Motor: " + this.getTipo_motor());
        System.out.println("Color: " + this.getColor());
        System.out.println("Numero de placa: " + this.getNumero_placa());
        System.out.println("Tipo de luces: " + this.getTipo_luces());
        System.out.println("Tipo de frenos: " + this.getTipo_frenos());
        System.out.println("Tipo de escape: " + this.getTipo_escape());
        System.out.println("Numero de rin: " + getNumero_rin());
        System.out.println("Numero de llantas: " + getNumero_llantas());
        System.out.println("Licencia de conducir: " + getLicencia_conducir());
        System.out.println("Tipo de manigueta: " + getTipo_manigueta());
        System.out.println("Tipo de pedales: " + getTipo_pedales());
        System.out.println("Marca: " + getMarca());
    }
}
