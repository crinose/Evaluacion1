/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alonso Soto Loyola
 */
public class YoutubeMain {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("cris@duoc.cl", "genericpassword1");
        Canal canal1 = new Canal(cuenta1, 200, 100, "crisvids", "tutoriales", 2012);
        
        
        //mostrar informacion cuenta
        System.out.println(canal1.mostrarInfo());
        System.out.println(cuenta1.toString());
        
        
        //aumentar subscriptores
        canal1.aumentarSubs(9800);
        
        
        //validar una cuenta para saber si es o no accesible al pago de 500 euros
        canal1.validarPago();
        
        
        //la validacion de cantidad de subscriptores negativa esta implementada directamente en el constructor con parametros, tambien hay un metodo que lo valida
        //ademas hay un validador implementado en el metodo aumentarSubs de la clase Canal.java
        canal1.validarSubs();
        
        
        //validaciones adicionales (probando funcionalidad del codigo)
        System.out.println("**Pruebas**");
        canal1.aumentarSubs(-100);
        canal1.disminuirSubs(200);
        canal1.validarPago();
        canal1.aumentarSubs(300);
        canal1.validarPago();
    }
    
}
