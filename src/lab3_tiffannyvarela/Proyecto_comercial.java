/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class Proyecto_comercial extends Proyecto{
    
        private ArrayList <Proyecto> comercial = new ArrayList();
        private String free;

    public Proyecto_comercial() {
        super();
    }
    
     public Proyecto_comercial(String nombre, String empresa, double precio, String estado, String descripcion, Date f_inicio, Date f_entrega,String free) {
        super(nombre,empresa,precio,estado,descripcion,f_inicio,f_entrega);
        this.free=free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

     
     
    public ArrayList<Proyecto> getcomercial() {
        return comercial;
    }

    public void setcomercial(ArrayList<Proyecto> comercial) {
        this.comercial = comercial;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProyecto_comercial{" + "comercial=" + comercial + ", free=" + free + '}';
    }

    
}
