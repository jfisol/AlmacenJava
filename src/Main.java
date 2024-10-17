public class Main {
    public static void main(String[] args) {
//generar productos
        Producto [] prod = GeneradorProductos.generadorProductos(10);
        AlmacenGestion almacen = new AlmacenGestion(prod);
        Producto[] s1 = almacen.PrepararPedidosTC(4);
        Producto[] s2 = almacen.PrepararPedidosSM(4);
        TiendaPrimeraMano TPM = new TiendaPrimeraMano("Tienda Primera Mano",s1);
        TiendaSegundaMano TSM = new TiendaSegundaMano("Tienda Segunda Mano",s2);
        almacen.ImprimeListasProductos();
        TPM.imprimirEstadisticas();
        TSM.imprimirEstadisticas();

    }
}