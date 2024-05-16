import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        Producto Tuerca = new Producto("Tuerca", "Cilindro con una rosca interna para unir piezas con un perno o tornillo", 500, 1000, "Acero inoxidable", "Se usa para arreglos en grifos, puertas, ventanas, etc.", "Llave inglesa");
        Producto Clavo = new Producto("Clavo", "Objeto de metal puntiagudo", 250, 1000, "Acero inoxidable", "Fijar cosas", "Martillo");
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
        listaDeProductos.add(Tuerca);
        listaDeProductos.add(Clavo);
        Interfaz interfaz = new Interfaz(listaDeProductos);
        interfaz.setVisible(true);
    }
}
