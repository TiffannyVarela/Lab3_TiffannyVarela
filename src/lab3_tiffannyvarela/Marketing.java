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
public class Marketing extends Freelance{
    private ArrayList <Proyecto> comerciales = new ArrayList();
    private String red_social;

    public Marketing() {
        super();
    }

    public Marketing(String red_social, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.red_social = red_social;
    }

    public ArrayList<Proyecto> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<Proyecto> comerciales) {
        this.comerciales = comerciales;
    }

    public String getRed_social() {
        return red_social;
    }

    public void setRed_social(String red_social) {
        this.red_social = red_social;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMarketing{" + "comerciales=" + comerciales + ", red_social=" + red_social + '}';
    }
    
    
    
}
