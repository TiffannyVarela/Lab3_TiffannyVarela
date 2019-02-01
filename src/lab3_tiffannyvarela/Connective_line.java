/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class Connective_line {
    
    private ArrayList <Empresa> empresas = new ArrayList();
    private ArrayList <Persona> personas = new ArrayList();
    private ArrayList <Ingresos> ingresos = new ArrayList();

    public Connective_line() {
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Connective_line{" + "\nempresas=" + empresas + ", \npersonas=" + personas + ", \ningresos=" + ingresos + '}';
    }
    
    
    
    
}


