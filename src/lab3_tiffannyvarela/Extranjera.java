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
public class Extranjera extends Empresa{
    private String pais;
    private String ciudad;
    private String url;

    public Extranjera() {
        super();
    }

    public Extranjera(String pais, String ciudad, String url) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.url = url;
    }

    public Extranjera(String pais, String ciudad, String url, String nombre, String telefono, String correo, String contra, String descripcion) {
        super(nombre, telefono, correo, contra, descripcion);
        this.pais = pais;
        this.ciudad = ciudad;
        this.url = url;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString()+"\nExtranjera{" + "pais=" + pais + ", ciudad=" + ciudad + ", url=" + url + '}';
    }
    
    
    
}
