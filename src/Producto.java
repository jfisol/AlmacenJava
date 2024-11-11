import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Producto {
    private double peso;
    private double valor;
    private String ID;
    private boolean asignado;
    private String clase;

    public Producto(){

    }
    public Producto(double peso, int valor, String ID, boolean asignado, String clase) {
        this.peso = peso;
        this.valor = valor;
        this.ID = ID;
        this.asignado = asignado;
        this.clase = clase;
    }
    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public String getID() {
        return ID;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public String getClase() {
        return clase;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void imprimir (){
        DecimalFormat decimales = new DecimalFormat("00.00");
        DecimalFormat decimalesP = new DecimalFormat("00.0");
        System.out.println(" ID: " +this.getID() + " Peso: " + decimalesP.format(this.getPeso()) + " valor: " +decimales.format(this.getValor()) + " Asignado: "+ this.isAsignado() + " Clase: " + this.getClase());
    }

    public void imprimir (PrintWriter salida){
        DecimalFormat decimales = new DecimalFormat("00.00");
        DecimalFormat decimalesP = new DecimalFormat("00.0");
        salida.println(" ID: " +this.getID() + " Peso: " + decimalesP.format(this.getPeso()) + " valor: " +decimales.format(this.getValor()) + " Asignado: "+ this.isAsignado() + " Clase: " + this.getClase());
    }
}
