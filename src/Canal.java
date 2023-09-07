/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alonso Soto Loyola
 */
public class Canal {
    private Cuenta cuenta;
    private int cantSub;
    private int cantVideos;
    private String nombre;
    private String desc;
    private int annoCreacion;

    public Canal(Cuenta cuenta, int cantSub, int cantVideos, String nombre, String desc, int annoCreacion) {
        if(cantSub >= 0){
             this.cuenta = cuenta;
             this.cantSub = cantSub;
             this.cantVideos = cantVideos;
             this.nombre = nombre;
             this.desc = desc;
             this.annoCreacion = annoCreacion;    
        }else{
            System.out.println("cantidad de subscriptores invalida");
        }

    }

    public Canal() {
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getCantSub() {
        return cantSub;
    }

    public void setCantSub(int cantSub) {
        this.cantSub = cantSub;
    }

    public int getCantVideos() {
        return cantVideos;
    }

    public void setCantVideos(int cantVideos) {
        this.cantVideos = cantVideos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAnnoCreacion() {
        return annoCreacion;
    }

    public void setAnnoCreacion(int annoCreacion) {
        this.annoCreacion = annoCreacion;
    }

    @Override
    public String toString() {
        return "Canal{" + "cuenta=" + cuenta + ", cantSub=" + cantSub + ", cantVideos=" + cantVideos + ", nombre=" + nombre + ", desc=" + desc + ", annoCreacion=" + annoCreacion + '}';
    }
    
    public String mostrarInfo() {
        return "Nombre canal: " + nombre + ", descripcion: " + desc + ", cantidad subscriptores: " + cantSub + ", videos subidos: " + cantVideos + ", anno creacion: " + annoCreacion + ", cuenta vinculada: " + cuenta;
    }
    
    public void aumentarSubs(int subs){
        if(subs < 0){
            System.out.println("cantidad invalida, ingrese nuevamente");    
        }else{
            this.cantSub = this.cantSub + subs;
            System.out.println("aumento realizado... nueva cantidad de subscriptores: " + this.cantSub);
        }
    }
    
    public void validarPago(){
        //modificar esta variable local para cambiar valor del euro actual
        int valorEuro = 940;
        if (this.cantSub < 10000){
            System.out.println("cantidad insuficiente, para ser acreditado necesita 10000 subscriptores, actualmente tiene: " + this.cantSub);
        }else{
            System.out.println("cantidad suficiente, sera acreditado con: $" + (500 * valorEuro) + " pesos chilenos");
        }
    }
    
    public void validarSubs(){
        if(this.cantSub >= 0){
            System.out.println("cantidad de subscriptores valida, usted tiene: " + this.cantSub + " subscriptores");
        }else{
            System.out.println("cantidad de subscriptores invalida, usted tiene " + this.cantSub + " subscriptores");
        }
    }
    
    public void disminuirSubs(int subsNeg){
        if(subsNeg < 0){
            System.out.println("cantidad invalida, ingrese nuevamente");    
        }else{
            this.cantSub = this.cantSub - subsNeg;
            System.out.println("resta realizada... nueva cantidad de subscriptores: " + this.cantSub);
        }
    }
    
}
