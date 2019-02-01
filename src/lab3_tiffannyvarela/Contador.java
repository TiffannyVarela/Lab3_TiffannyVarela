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
public class Contador extends Freelance{
    private  ArrayList<Proyecto> comerciales = new ArrayList();
    private String universidad;
    private boolean inscripcion;
    private String hobbies;

    public Contador() {
        super();
    }

    public Contador(String universidad, boolean inscripcion, String hobbies, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.universidad = universidad;
        this.inscripcion = inscripcion;
        this.hobbies = hobbies;
    }

    public ArrayList<Proyecto> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<Proyecto> comerciales) {
        this.comerciales = comerciales;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean isInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(boolean inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return super.toString()+"\nContador{" + "comerciales=" + comerciales + ", universidad=" + universidad + ", inscripcion=" + inscripcion + ", hobbies=" + hobbies + '}';
    }
    
    
}
