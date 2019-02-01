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
public class Proyecto_web extends Proyecto {
        private ArrayList <Proyecto> web = new ArrayList();
        private String desa;

    public Proyecto_web() {
        super();
    }
    
     public Proyecto_web(String nombre, String empresa, double precio, String estado, String descripcion, Date f_inicio, Date f_entrega,String desa) {
        super(nombre,empresa,precio,estado,descripcion,f_inicio,f_entrega);
        this.desa=desa;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

     
     
    public ArrayList<Proyecto> getweb() {
        return web;
    }

    public void setweb(ArrayList<Proyecto> web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProyecto_web{" + "web=" + web + ", desa=" + desa + '}';
    }

    
    
}
