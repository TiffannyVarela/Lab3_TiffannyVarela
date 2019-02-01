/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class Desarrollador_web extends Freelance{
    private String l_programacion;
    private String universidad;
    private String idioma;
    private ArrayList <Proyecto> web = new ArrayList();

    public Desarrollador_web() {
        super();
    }

    public Desarrollador_web(String l_programacion, String universidad, String idioma, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.l_programacion = l_programacion;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public String getL_programacion() {
        return l_programacion;
    }

    public void setL_programacion(String l_programacion) {
        this.l_programacion = l_programacion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Proyecto> getWeb() {
        return web;
    }

    public void setWeb(ArrayList<Proyecto> web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDesarrollador_web{" + "l_programacion=" + l_programacion + ", universidad=" + universidad + ", idioma=" + idioma + ", web=" + web + '}';
    }
    
    
    
    
}
