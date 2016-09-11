/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Password {
    private int longitud;
    private String contrasenia;
    public Password(int longitud,String contrasenia ){
        this.longitud=longitud;
        this.contrasenia=contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public boolean fuerte(){
        boolean b1 = true;
        
        if (this.longitud < 6) {
            b1 = false;
        }
        
        return b1;
    }
}
