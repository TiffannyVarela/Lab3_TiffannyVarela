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
public class Freelance extends Persona{
    private String n_completo;
    private String contra;
    private String genero;
    private int edad;
    private ArrayList <Empresa> empresas = new ArrayList();
    private double dinero;
    private String ciudad;
    private String telefono;

    public Freelance() {
        super();
    }


    public Freelance(String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(id, correo);
        this.n_completo = n_completo;
        this.contra = contra;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getN_completo() {
        return n_completo;
    }

    public void setN_completo(String n_completo) {
        this.n_completo = n_completo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFreelance{" + "n_completo=" + n_completo + ", contra=" + contra + ", genero=" + genero + ", edad=" + edad + ", empresas=" + empresas + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + '}';
    }
    
    
    
}
