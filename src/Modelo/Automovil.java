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
public class Automovil extends vehiculo_terrestre {
    private int tarjeta_circulacion,licencia_conducir,numero_puertas,numero_aientos;
    private String carroceria,marca;

    public int getTarjeta_circulacion() {
        return tarjeta_circulacion;
    }

    public void setTarjeta_circulacion(int tarjeta_circulacion) {
        this.tarjeta_circulacion = tarjeta_circulacion;
    }

    public int getLicencia_conducir() {
        return licencia_conducir;
    }

    public void setLicencia_conducir(int licencia_conducir) {
        this.licencia_conducir = licencia_conducir;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public int getNumero_aientos() {
        return numero_aientos;
    }

    public void setNumero_aientos(int numero_aientos) {
        this.numero_aientos = numero_aientos;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        System.out.println("Trjeta de circulacion: " + getTarjeta_circulacion());
        System.out.println("Numero de llantas: " + getNumero_llantas());
        System.out.println("Licencia de conducir: " + getLicencia_conducir());
        System.out.println("Numero de puertas: " + getNumero_puertas());
        System.out.println("Numero de asientos: " + getNumero_aientos());
        System.out.println("Carroceria: " + getCarroceria());
        System.out.println("Marca: " + getMarca());
    }
}
