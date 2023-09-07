/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alonso Soto Loyola
 */

public class Cuenta {
    private String correo;
    private String contra;

    public Cuenta(String correo, String contra) {
        this.correo = correo;
        this.contra = contra;
    }

    public Cuenta() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    //tostring modificado para ser mas visible desde call en metodo mostrarInfo en Canal.java
    @Override
    public String toString() {
        return "Cuenta: " + "correo: " + correo + ", contra: " + contra;
    }
    
    public void validarContra(){
    }
    
    
}
