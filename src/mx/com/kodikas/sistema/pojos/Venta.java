/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.kodikas.sistema.pojos;

import java.sql.Date;


/**
 *
 * @author Nicolas
 */
public class Venta {
    private int idVenta;
    private double montoVenta;
    private Date fechaVenta;

    public Venta(int idVenta, double montoVenta, Date fechaVenta) {
        this.idVenta = idVenta;
        this.montoVenta = montoVenta;
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
}
