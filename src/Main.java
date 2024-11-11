import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
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
        FileWriter escritor = new FileWriter("EstadisticaTienda2daMano.txt");
        PrintWriter pw = new PrintWriter(escritor);
        TSM.imprimirEstadisticas(pw);
        pw.close();
    }
}