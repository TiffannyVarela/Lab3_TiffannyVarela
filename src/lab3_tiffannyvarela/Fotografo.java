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
public class Fotografo extends Freelance{
    private ArrayList <Proyecto> publicado = new ArrayList();
    private String n_marca;
    private String modelo_camara;

    public Fotografo() {
        super();
    }

    public Fotografo(String n_marca, String modelo_camara, String n_completo, String contra, String genero, int edad, double dinero, String ciudad, String telefono, String id, String correo) {
        super(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.n_marca = n_marca;
        this.modelo_camara = modelo_camara;
    }

    public ArrayList<Proyecto> getPublicado() {
        return publicado;
    }

    public void setPublicado(ArrayList<Proyecto> publicado) {
        this.publicado = publicado;
    }

    public String getN_marca() {
        return n_marca;
    }

    public void setN_marca(String n_marca) {
        this.n_marca = n_marca;
    }

    public String getModelo_camara() {
        return modelo_camara;
    }

    public void setModelo_camara(String modelo_camara) {
        this.modelo_camara = modelo_camara;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFotografo{" + "publicado=" + publicado + ", n_marca=" + n_marca + ", modelo_camara=" + modelo_camara + '}';
    }
    
    
    
}
