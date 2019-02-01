/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

/**
 *
 * @author tiffa
 */
public class Administrador extends Persona{
    private String n_usuario;
    private String contra;

    public Administrador() {
        super();
    }

    public Administrador(String n_usuario, String contra) {
        this.n_usuario = n_usuario;
        this.contra = contra;
    }

    public Administrador(String n_usuario, String contra, String id, String correo) {
        super(id, correo);
        this.n_usuario = n_usuario;
        this.contra = contra;
    }


    public String getN_usuario() {
        return n_usuario;
    }

    public void setN_usuario(String n_usuario) {
        this.n_usuario = n_usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAdministrador{" + "n_usuario=" + n_usuario + ", contra=" + contra + '}';
    }
    
    
}
