import java.util.Random;

public class GeneradorProductos {
    public static Producto[] generadorProductos(int tamano){
        Random aleatorio = new Random();
        String[] listaClases ={"A","B","C"};
        Producto [] resultado = new Producto[tamano];

        for (int i = 0; i < tamano; i++){
           Producto p = new Producto();
           p.setID(Integer.toString((int) (Math.random()*1000000)));
           p.setValor(aleatorio.nextDouble()*1000);
           p.setPeso(aleatorio.nextDouble()*100);
           p.setAsignado(false);
           p.setClase(listaClases[aleatorio.nextInt(listaClases.length)]);

           resultado[i] = p;
        }
        return  resultado;
    }
}
