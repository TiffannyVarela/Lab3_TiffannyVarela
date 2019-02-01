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
public class Disenador_grafico extends Freelance{
    private ArrayList <Proyecto> publicados = new ArrayList();
    private String universidad;
    private String hobbies;

    public Disenador_grafico() {
        super();
    }

    public Disenador_grafico(String universidad, String hobbies, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<Proyecto> getPublicados() {
        return publicados;
    }

    public void setPublicados(ArrayList<Proyecto> publicados) {
        this.publicados = publicados;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDisenador_grafico{" + "publicados=" + publicados + ", universidad=" + universidad + ", hobbies=" + hobbies + '}';
    }
    
    
    
    
}
