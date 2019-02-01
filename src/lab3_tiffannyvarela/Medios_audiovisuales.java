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
public class Medios_audiovisuales extends Freelance{
    private ArrayList <Proyecto> publicitarios = new ArrayList();
    private String n_marca;
    private String m__c_video;

    public Medios_audiovisuales() {
        super();
    }

    public Medios_audiovisuales(String n_marca, String m__c_video, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.n_marca = n_marca;
        this.m__c_video = m__c_video;
    }

    public ArrayList<Proyecto> getPublicitarios() {
        return publicitarios;
    }

    public void setPublicitarios(ArrayList<Proyecto> publicitarios) {
        this.publicitarios = publicitarios;
    }

    public String getN_marca() {
        return n_marca;
    }

    public void setN_marca(String n_marca) {
        this.n_marca = n_marca;
    }

    public String getM__c_video() {
        return m__c_video;
    }

    public void setM__c_video(String m__c_video) {
        this.m__c_video = m__c_video;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMedios_audiovisuales{" + "publicitarios=" + publicitarios + ", n_marca=" + n_marca + ", m__c_video=" + m__c_video + '}';
    }
    
    
}
