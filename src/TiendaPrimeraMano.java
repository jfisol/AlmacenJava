public class TiendaPrimeraMano extends Producto {
    private String nombre;

    private Producto[] stock;

    public TiendaPrimeraMano(){}
    public TiendaPrimeraMano(String nombre, Producto[] stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public TiendaPrimeraMano(double peso, int valor, String ID, boolean asignado, String clase, String nombre, Producto[] stock) {
        super(peso, valor, ID, asignado, clase);
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto[] getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(Producto[] stock) {
        this.stock = stock;
    }

    public void imprimirEstadisticas(){
        System.out.println(" Lista de Productos Tienda del Centro");
       // super.imprimir();
        double beneficio =0.0;
        System.out.println(" Nombre Tienda: " + getNombre());
        for(int i = 0; i<stock.length; i++){
            stock[i].imprimir();
            beneficio += stock[i].getValor();
        }
        System.out.println("El beneficio de la tienda PrimeraMano" + beneficio);

    }


}
