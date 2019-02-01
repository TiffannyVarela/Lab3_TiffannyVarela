/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

import java.util.Date;

/**
 *
 * @author tiffa
 */
public class Proyecto {
    private String nombre;
    private String empresa;
    private double precio;
    private String estado;
    private String descripcion;
    private Date f_inicio;
    private Date f_entrega;

    public Proyecto() {
    }

    public Proyecto(String nombre, String empresa, double precio, String estado, String descripcion, Date f_inicio, Date f_entrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.f_inicio = f_inicio;
        this.f_entrega = f_entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }

    public Date getF_entrega() {
        return f_entrega;
    }

    public void setF_entrega(Date f_entrega) {
        this.f_entrega = f_entrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", f_inicio=" + f_inicio + ", f_entrega=" + f_entrega + '}';
    }
    
    
}
