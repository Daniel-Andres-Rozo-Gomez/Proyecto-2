import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
        Interfaz interfaz = new Interfaz(listaDeProductos);
        interfaz.setVisible(true);
    }
}
