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
public class Proyecto_publicitario extends Proyecto{
    private ArrayList <Proyecto> publicitario = new ArrayList();
    private String free;
    
    public Proyecto_publicitario() {
        super();
    }
    
     public Proyecto_publicitario(String nombre, String empresa, double precio, String estado, String descripcion, Date f_inicio, Date f_entrega, String free) {
        super(nombre,empresa,precio,estado,descripcion,f_inicio,f_entrega);
        this.free=free;
    }

    public ArrayList<Proyecto> getPublicitario() {
        return publicitario;
    }

    public void setPublicitario(ArrayList<Proyecto> publicitario) {
        this.publicitario = publicitario;
    }

     public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }
    @Override
    public String toString() {
        return super.toString()+"\nProyecto_publicitario{" + "publicitario=" + publicitario + ", free=" + free + '}';
    }
    
}
