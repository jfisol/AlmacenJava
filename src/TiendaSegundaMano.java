import java.io.PrintWriter;

public class TiendaSegundaMano extends Producto {

    private String nombre;

    private Producto[] stock;

    public TiendaSegundaMano() {
    }

    public TiendaSegundaMano(String nombre, Producto[] stock) {
        this.nombre = nombre;
        this.stock = stock;
        this.DescuentoSegundaMano();

    }

    public TiendaSegundaMano(double peso, int valor, String ID, boolean asignado, String clase, String nombre, Producto[] stock) {
        super(peso, valor, ID, asignado, clase);
        this.nombre = nombre;
        this.stock = stock;
        this.DescuentoSegundaMano();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getStock() {
        return stock;
    }

    public void setStock(Producto[] stock) {
        this.stock = stock;
    }

    public void imprimirEstadisticas(){
        System.out.println(" Lista de Productos Tienda del Centro");
        // super.imprimir();
        double beneficio =0.0;
        System.out.println(" Nombre Tienda: " + getNombre());
        for(int i = 0; i<stock.length ; i++){
            stock[i].imprimir();
            beneficio += stock[i].getValor();
        }
        System.out.println("El beneficio de la tienda SegundaMano" + beneficio);

    }
    public void imprimirEstadisticas(PrintWriter salida){
        salida.println(" Lista de Productos Tienda del Centro");
        // super.imprimir();
        double beneficio =0.0;
        salida.println(" Nombre Tienda: " + getNombre());
        for(int i = 0; i<stock.length ; i++){
            stock[i].imprimir(salida);
            beneficio += stock[i].getValor();
        }
        salida.println("El beneficio de la tienda SegundaMano" + beneficio);

    }

    public void DescuentoSegundaMano(){
        //recorre la estructura/ stock con el metodo for
        for (int i =0; i< stock.length -1; i++){
            if (stock[i].getClase().compareTo("B") == 0){
                stock[i].setValor((int) (stock[i].getValor()*0.75));
            }
            if (stock[i].getClase().compareTo("C") == 0){
                stock[i].setValor((int) (stock[i].getValor()*0.5));
            }
        }
    }
}
