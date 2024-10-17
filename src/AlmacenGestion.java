import java.util.ArrayList;

public class AlmacenGestion extends Producto{

    private Producto[] almacen;

    public AlmacenGestion(Producto[] almacen) {
        this.almacen = almacen;
    }

    public AlmacenGestion(double peso, int valor, String ID, boolean asignado, String clase, Producto[] almacen) {
        super(peso, valor, ID, asignado, clase);
        this.almacen = almacen;
    }

    public Producto[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Producto[] almacen) {
        this.almacen = almacen;
    }

    public Producto[] PrepararPedidosTc(){
        Producto[] productos={};

        return productos;
    }

    public void OrdenarAlmacenPorValor(){
        Producto aux;
        for (int i = 0; i< almacen.length -1; i++){
            for (int j = 0; j < almacen.length -1; j++){
                if(almacen[j].getValor() > almacen[j + 1].getValor()){
                    aux =almacen[j];
                    almacen[j] = almacen[j + 1];
                    almacen[j + 1] = aux;
                }
            }
        }

    }

    public void ImprimeListasProductos(){
        for (int i = 0; i <almacen.length; i++){
            almacen[i].imprimir();
        }
    }

    //Busqueda Binaria SECUENCIAL
    public Producto BuscarProducto(String id){
        Producto p = new Producto();
        for (int i = 0; i < almacen.length; i++){
            if (almacen[i].getID().compareTo(id)== 0){ //comtare to devuelve 0 es igual la cadena de texto, < 0 la cadena es menor que el otro string >0 si la cadena es mayor que cero

              p = almacen[i];
            }
        }
        return p;
    }

    public void OrdenarAlmacenPorPeso(){
        Producto aux;
        for (int i = 0; i< almacen.length -1; i++){
            for (int j = 0; j < almacen.length -1; j++){
                if(almacen[j].getPeso() > almacen[j + 1].getPeso()){
                    aux =almacen[j];
                    almacen[j] = almacen[j + 1];
                    almacen[j + 1] = aux;
                }
            }
        }

    }

    public Producto[] PrepararPedidosTC(int tamano){
        //Primero Ordenar el almacen
        this.OrdenarAlmacenPorValor();
        ArrayList<Producto> lStock = new ArrayList<Producto>();
        int i = almacen.length -1;
        int j =0; //stock vacio

        while((i >= 0) && (j < tamano)){
            if(almacen[i].getClase().compareTo("A") == 0){
                lStock.add(almacen[i]);
                almacen[i].setAsignado(true);
                j++; //variable del estock
            }
            i--;
        }

        //metodo para convertir en array los arrayList
        Producto [] resultado =  new Producto[lStock.size()];
        lStock.toArray(resultado);// El array resultado coge todos los productos que tiene lstock

        return resultado;
    }
    public Producto[] PrepararPedidosSM(int tamano){
        //Primero Ordenar el almacen
        this.OrdenarAlmacenPorValor();
        ArrayList<Producto> lStock = new ArrayList<Producto>();
        int i = almacen.length -1; //indice tamanio del almacen
        int j =0; //stock vacio

        while((i >= 0) && (j < tamano)){
            if(almacen[i].isAsignado() == false){
                lStock.add(almacen[i]);
                almacen[i].setAsignado(true);
                j++; //variable del estock
            }
            i--;
        }

        //metodo para convertir en array los arrayList
        Producto [] resultado =  new Producto[lStock.size()];
        lStock.toArray(resultado);// El array resultado coge todos los productos que tiene lstock

        return resultado;
    }

}
