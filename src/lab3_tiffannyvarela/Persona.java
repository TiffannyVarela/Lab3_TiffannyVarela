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
public class Persona {
    private String id;
    private String correo;

    public Persona() {
    }

    public Persona(String id, String correo) {
        this.id = id;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", correo=" + correo + '}';
    }
    
}
