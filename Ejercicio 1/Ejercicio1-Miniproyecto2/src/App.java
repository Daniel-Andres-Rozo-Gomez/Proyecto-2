import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        Producto Tuerca = new Producto("Tuerca", "Pos nomas", 5000, 1000, "Acero inoxidable", "No se", "Llave inglesa");
        Producto Tuerca2 = new Producto("Tuerca2", "Pos nomas2", 5000, 1000, "Acero inoxidable", "No se", "Llave inglesa");
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
        listaDeProductos.add(Tuerca);
        listaDeProductos.add(Tuerca2);
        Interfaz interfaz = new Interfaz(listaDeProductos);
        interfaz.setVisible(true);
    }
}
