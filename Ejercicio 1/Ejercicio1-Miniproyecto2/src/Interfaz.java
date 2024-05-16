import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaz extends JFrame {

    private Container contenedor;
    private JPanel panel;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    private JLabel etiqueta6;
    private JLabel etiqueta7;
    private JTextField campoDeTexto1;
    private JTextField campoDeTexto2;
    private JTextField campoDeTexto3;
    private JTextField campoDeTexto4;
    private JTextField campoDeTexto5;
    private JTextField campoDeTexto6;
    private JTextField campoDeTexto7;
    private JTextField campoDeTexto8;
    private JTextField campoDeTexto9;
    private JTextField campodeTexto10;
    private JLabel etiquetaNombre1;
    private JLabel etiquetaPrecio1;
    private JLabel etiquetaCantidad1;
    private JLabel etiquetaMaterial1;
    private JLabel etiquetaEjemploDeUso1;
    private JLabel etiquetaDescripcion1;
    private JLabel etiquetaHerramienta1;
    private JLabel etiquetaNombre2;
    private JLabel etiquetaPrecio2;
    private JLabel etiquetaCantidad2;
    private JLabel etiquetaMaterial2;
    private JLabel etiquetaEjemploDeUso2;
    private JLabel etiquetaDescripcion2;
    private JLabel etiquetaHerramienta2;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton10;
    private JButton boton11;
    private JButton boton12;
    private JButton boton13;
    byte posicion = 0;

    public Interfaz(ArrayList<Producto> listadeProductos){
        contenedor = getContentPane();
        this.setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ferreteria Bob el constructor");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(700, 600));
        Ventana();
        eventos(listadeProductos);
    }

    public void Ventana(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.white);
        contenedor.add(panel);
        etiqueta1 = new JLabel("Ver inventario", SwingConstants.CENTER);
        panel.add(etiqueta1);
        boton1 = new JButton("Click");
        boton1.setForeground(Color.MAGENTA);
        boton1.setFont(new Font("cooper black",3,12));
        panel.add(boton1);
        etiqueta2 = new JLabel("Añadir producto", SwingConstants.CENTER);
        panel.add(etiqueta2);
        boton2 = new JButton("Click");
        boton2.setForeground(Color.MAGENTA);
        boton2.setFont(new Font("cooper black",3,12));
        panel.add(boton2);
        etiqueta3 = new JLabel("Eliminar producto", SwingConstants.CENTER);
        panel.add(etiqueta3);
        boton3 = new JButton("Click");
        boton3.setForeground(Color.MAGENTA);
        boton3.setFont(new Font("cooper black",3,12));
        panel.add(boton3);
        etiquetaNombre1 = new JLabel();
        etiquetaPrecio1 = new JLabel();
        etiquetaCantidad1 = new JLabel();
        etiquetaMaterial1 = new JLabel();
        etiquetaDescripcion1 = new JLabel();
        etiquetaEjemploDeUso1 = new JLabel();
        etiquetaHerramienta1 = new JLabel();
        etiquetaNombre1.setVisible(false);
        etiquetaPrecio1.setVisible(false);
        etiquetaCantidad1.setVisible(false);
        etiquetaMaterial1.setVisible(false);
        etiquetaDescripcion1.setVisible(false);
        etiquetaEjemploDeUso1.setVisible(false);
        etiquetaHerramienta1.setVisible(false);
        panel.add(etiquetaNombre1);
        panel.add(etiquetaPrecio1);
        panel.add(etiquetaCantidad1);
        panel.add(etiquetaMaterial1);
        panel.add(etiquetaDescripcion1);
        panel.add(etiquetaEjemploDeUso1);
        panel.add(etiquetaHerramienta1);
        boton4 = new JButton("Siguiente");
        boton4.setForeground(Color.MAGENTA);
        boton4.setFont(new Font("cooper black",3,12));
        boton4.setEnabled(false);
        boton4.setVisible(false);
        panel.add(boton4);
        boton5 = new JButton("Regresar al menú de funciones");
        boton5.setForeground(Color.MAGENTA);
        boton5.setFont(new Font("cooper black",3,12));
        boton5.setEnabled(false);
        boton5.setVisible(false);
        panel.add(boton5);
        etiquetaNombre2 = new JLabel();
        etiquetaPrecio2 = new JLabel();
        etiquetaCantidad2 = new JLabel();
        etiquetaMaterial2 = new JLabel();
        etiquetaDescripcion2 = new JLabel();
        etiquetaEjemploDeUso2 = new JLabel();
        etiquetaHerramienta2 = new JLabel();
        etiquetaNombre2.setVisible(false);
        etiquetaPrecio2.setVisible(false);
        etiquetaCantidad2.setVisible(false);
        etiquetaMaterial2.setVisible(false);
        etiquetaDescripcion2.setVisible(false);
        etiquetaEjemploDeUso2.setVisible(false);
        etiquetaHerramienta2.setVisible(false);
        panel.add(etiquetaNombre2);
        campoDeTexto1 = new JTextField();
        campoDeTexto1.setEnabled(false);
        campoDeTexto1.setVisible(false);
        panel.add(campoDeTexto1);
        panel.add(etiquetaPrecio2);
        campoDeTexto2 = new JTextField();
        campoDeTexto2.setEnabled(false);
        campoDeTexto2.setVisible(false);
        panel.add(campoDeTexto2);
        panel.add(etiquetaCantidad2);
        campoDeTexto3 = new JTextField();
        campoDeTexto3.setEnabled(false);
        campoDeTexto3.setVisible(false);
        panel.add(campoDeTexto3);
        panel.add(etiquetaMaterial2);
        campoDeTexto4 = new JTextField();
        campoDeTexto4.setEnabled(false);
        campoDeTexto4.setVisible(false);
        panel.add(campoDeTexto4);
        panel.add(etiquetaDescripcion2);
        campoDeTexto5 = new JTextField();
        campoDeTexto5.setEnabled(false);
        campoDeTexto5.setVisible(false);
        panel.add(campoDeTexto5);
        panel.add(etiquetaEjemploDeUso2);
        campoDeTexto6 = new JTextField();
        campoDeTexto6.setEnabled(false);
        campoDeTexto6.setVisible(false);
        panel.add(campoDeTexto6);
        panel.add(etiquetaHerramienta2);
        campoDeTexto7 = new JTextField();
        campoDeTexto7.setEnabled(false);
        campoDeTexto7.setVisible(false);
        panel.add(campoDeTexto7);
        boton6 = new JButton("Añadir");
        boton6.setForeground(Color.MAGENTA);
        boton6.setFont(new Font("cooper black",3,12));
        boton6.setEnabled(false);
        boton6.setVisible(false);
        panel.add(boton6);
        boton7 = new JButton("Regresar al menú de funciones");
        boton7.setForeground(Color.MAGENTA);
        boton7.setFont(new Font("cooper black",3,12));
        boton7.setEnabled(false);
        boton7.setVisible(false);
        panel.add(boton7);
        etiqueta4 = new JLabel("Haga click en medio y escriba el nombre del producto a eliminar");
        etiqueta4.setVisible(false);
        panel.add(etiqueta4);
        campoDeTexto8 = new JTextField();
        campoDeTexto8.setEnabled(false);
        campoDeTexto8.setVisible(false);
        panel.add(campoDeTexto8);
        boton8 = new JButton("Eliminar");
        boton8.setForeground(Color.MAGENTA);
        boton8.setFont(new Font("cooper black",3,12));
        boton8.setEnabled(false);
        boton8.setVisible(false);
        panel.add(boton8);
        boton9 = new JButton("Regresar al menú de funciones");
        boton9.setForeground(Color.MAGENTA);
        boton9.setFont(new Font("cooper black",3,12));
        boton9.setEnabled(false);
        boton9.setVisible(false);
        panel.add(boton9);
        etiqueta5 = new JLabel("Actualizar cantidad", SwingConstants.CENTER);
        panel.add(etiqueta5);
        boton10 = new JButton("Click");
        boton10.setForeground(Color.MAGENTA);
        boton10.setFont(new Font("cooper black",3,12));
        panel.add(boton10);
        etiqueta6 = new JLabel("Haga click abajo y escriba el nombre del producto que desea actualizar");
        etiqueta6.setVisible(false);
        panel.add(etiqueta6);
        campoDeTexto9 = new JTextField();
        campoDeTexto9.setEnabled(false);
        campoDeTexto9.setVisible(false);
        panel.add(campoDeTexto9);
        etiqueta7 = new JLabel("Escriba la cantidad y luego seleccione el boton agregar o el boton restar");
        etiqueta7.setVisible(false);
        panel.add(etiqueta7);
        campodeTexto10 = new JTextField();
        campodeTexto10.setEnabled(false);
        campodeTexto10.setVisible(false);
        panel.add(campodeTexto10);
        boton11 = new JButton("Añadir cantidad");
        boton11.setForeground(Color.MAGENTA);
        boton11.setFont(new Font("cooper black",3,12));
        boton11.setEnabled(false);
        boton11.setVisible(false);
        panel.add(boton11);
        boton12 = new JButton("Eliminar cantidad");
        boton12.setForeground(Color.MAGENTA);
        boton12.setFont(new Font("cooper black",3,12));
        boton12.setEnabled(false);
        boton12.setVisible(false);
        panel.add(boton12);
        boton13 = new JButton("Regresar al menú de funciones");
        boton13.setForeground(Color.MAGENTA);
        boton13.setFont(new Font("cooper black",3,12));
        boton13.setEnabled(false);
        boton13.setVisible(false);
        panel.add(boton13);

    }

    public void eventos(ArrayList<Producto> listadeProductos){
        ActionListener oyenteDeAccionboton1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(false);
                boton1.setVisible(false);
                boton1.setEnabled(false);
                etiqueta2.setVisible(false);
                boton2.setVisible(false);
                boton2.setEnabled(false);
                etiqueta3.setVisible(false);
                boton3.setVisible(false);
                boton3.setEnabled(false);
                etiqueta5.setVisible(false);
                boton10.setVisible(false);
                boton10.setEnabled(false);
                etiquetaNombre1.setVisible(true);
                etiquetaPrecio1.setVisible(true);
                etiquetaCantidad1.setVisible(true);
                etiquetaMaterial1.setVisible(true);
                etiquetaDescripcion1.setVisible(true);
                etiquetaEjemploDeUso1.setVisible(true);
                etiquetaHerramienta1.setVisible(true);
                boton4.setVisible(true);
                boton4.setEnabled(true);
                boton5.setVisible(true);
                boton5.setEnabled(true);
            }
        };

        ActionListener oyenteDeAccionboton2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(false);
                boton1.setVisible(false);
                boton1.setEnabled(false);
                etiqueta2.setVisible(false);
                boton2.setVisible(false);
                boton2.setEnabled(false);
                etiqueta3.setVisible(false);
                boton3.setVisible(false);
                boton3.setEnabled(false);
                etiqueta5.setVisible(false);
                boton10.setVisible(false);
                boton10.setEnabled(false);
                etiquetaNombre2.setText("Nombre");
                etiquetaNombre2.setVisible(true);
                campoDeTexto1.setVisible(true);
                campoDeTexto1.setEnabled(true);
                etiquetaPrecio2.setText("Precio");
                etiquetaPrecio2.setVisible(true);
                campoDeTexto2.setVisible(true);
                campoDeTexto2.setEnabled(true);
                etiquetaCantidad2.setText("Cantidad");
                etiquetaCantidad2.setVisible(true);
                campoDeTexto3.setVisible(true);
                campoDeTexto3.setEnabled(true);
                etiquetaMaterial2.setText("Material");
                etiquetaMaterial2.setVisible(true);
                campoDeTexto4.setVisible(true);
                campoDeTexto4.setEnabled(true);
                etiquetaDescripcion2.setText("Descripcion");
                etiquetaDescripcion2.setVisible(true);
                campoDeTexto5.setVisible(true);
                campoDeTexto5.setEnabled(true);
                etiquetaEjemploDeUso2.setText("Ejemplos de uso");
                etiquetaEjemploDeUso2.setVisible(true);
                campoDeTexto6.setVisible(true);
                campoDeTexto6.setEnabled(true);
                etiquetaHerramienta2.setText("Herramienta necesaria para su uso");
                etiquetaHerramienta2.setVisible(true);
                campoDeTexto7.setVisible(true);
                campoDeTexto7.setEnabled(true);
                boton6.setVisible(true);
                boton6.setEnabled(true);
                boton7.setVisible(true);
                boton7.setEnabled(true);

            }
        };

        ActionListener oyenteDeAccionboton3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(false);
                boton1.setVisible(false);
                boton1.setEnabled(false);
                etiqueta2.setVisible(false);
                boton2.setVisible(false);
                boton2.setEnabled(false);
                etiqueta3.setVisible(false);
                boton3.setVisible(false);
                boton3.setEnabled(false);
                etiqueta5.setVisible(false);
                boton10.setVisible(false);
                boton10.setEnabled(false);
                etiqueta4.setVisible(true);
                campoDeTexto8.setVisible(true);
                campoDeTexto8.setEnabled(true);
                boton8.setVisible(true);
                boton8.setEnabled(true);
                boton9.setVisible(true);
                boton9.setEnabled(true);
            }
        };

        ActionListener oyenteDeAccionboton4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                boolean condicionReinicio = false;
                for (int i = 0; i < listadeProductos.size(); i++) {
                    if(posicion < listadeProductos.size()){
                        Producto producto = listadeProductos.get(posicion);
                        etiquetaNombre1.setText("Nombre: " + producto.getNombre());
                        etiquetaPrecio1.setText("Precio: " + producto.getPrecio());
                        etiquetaCantidad1.setText("Cantidad: " + producto.getCantidad());
                        etiquetaMaterial1.setText("Material: " + producto.getMaterialDeElaboracion());
                        etiquetaDescripcion1.setText("Descripcion: " + producto.getDescripcion());
                        etiquetaEjemploDeUso1.setText("Ejemplo de uso: " + producto.getEjemplosDeUso());
                        etiquetaHerramienta1.setText("Herramienta para su uso: " + producto.getHerramienta());
                    }
                    else {
                        condicionReinicio = true;
                        break;
                    }
                }
        
                if (condicionReinicio) {
                    posicion = 0;
                    JOptionPane.showMessageDialog(panel, "La lista se recorrió por completo, por lo tanto se ha reiniciado, dale de nuevo al botón siguiente", "", JOptionPane.INFORMATION_MESSAGE);
                } else{
                posicion ++;
                }
            }
        };
        ActionListener oyenteDeAccionboton5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(true);
                boton1.setVisible(true);
                boton1.setEnabled(true);
                etiqueta2.setVisible(true);
                boton2.setVisible(true);
                boton2.setEnabled(true); 
                etiqueta3.setVisible(true);
                boton3.setVisible(true);
                boton3.setEnabled(true);
                etiqueta5.setVisible(true);
                boton10.setVisible(true);
                boton10.setEnabled(true);
                etiquetaNombre1.setVisible(false);
                etiquetaPrecio1.setVisible(false);
                etiquetaCantidad1.setVisible(false);
                etiquetaMaterial1.setVisible(false);
                etiquetaDescripcion1.setVisible(false);
                etiquetaEjemploDeUso1.setVisible(false);
                etiquetaHerramienta1.setVisible(false);
                boton4.setVisible(false);
                boton4.setEnabled(false);
                boton5.setVisible(false);
                boton5.setEnabled(false);
                etiquetaNombre1.setText("");
                etiquetaPrecio1.setText("");
                etiquetaCantidad1.setText("");
                etiquetaMaterial1.setText("");
                etiquetaDescripcion1.setText("");
                etiquetaEjemploDeUso1.setText("");
                etiquetaHerramienta1.setText("");
                posicion = 0;
            }
        };

        ActionListener oyenteDeAccionboton6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                String nombre = campoDeTexto1.getText();
                int precio = Integer.parseInt(campoDeTexto2.getText());
                int cantidad = Integer.parseInt(campoDeTexto3.getText());
                String material = campoDeTexto4.getText();
                String descripcion = campoDeTexto5.getText();
                String ejemplosdeuso = campoDeTexto6.getText();
                String herramienta = campoDeTexto7.getText();

                Producto nuevoProducto = new Producto(nombre, descripcion, precio, cantidad, material, ejemplosdeuso, herramienta);
                listadeProductos.add(nuevoProducto);
                campoDeTexto1.setText("");
                campoDeTexto2.setText("");
                campoDeTexto3.setText("");
                campoDeTexto4.setText("");
                campoDeTexto5.setText("");
                campoDeTexto6.setText("");
                campoDeTexto7.setText("");
            }
        };

        ActionListener oyenteDeAccionboton7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(true);
                boton1.setVisible(true);
                boton1.setEnabled(true);
                etiqueta2.setVisible(true);
                boton2.setVisible(true);
                boton2.setEnabled(true);
                etiqueta3.setVisible(true);
                boton3.setVisible(true);
                boton3.setEnabled(true);
                etiqueta5.setVisible(true);
                boton10.setVisible(true);
                boton10.setEnabled(true);
                etiquetaNombre2.setVisible(false);
                campoDeTexto1.setVisible(false); 
                campoDeTexto1.setEnabled(false);
                etiquetaPrecio2.setVisible(false);
                campoDeTexto2.setVisible(false);
                campoDeTexto2.setEnabled(false);
                etiquetaCantidad2.setVisible(false);
                campoDeTexto3.setVisible(false);
                campoDeTexto3.setEnabled(false);
                etiquetaMaterial2.setVisible(false);
                campoDeTexto4.setVisible(false);
                campoDeTexto4.setEnabled(false);
                etiquetaDescripcion2.setVisible(false);
                campoDeTexto5.setVisible(false);
                campoDeTexto5.setEnabled(false);
                etiquetaEjemploDeUso2.setVisible(false);
                campoDeTexto6.setVisible(false);
                campoDeTexto6.setEnabled(false);
                etiquetaHerramienta2.setVisible(false);
                campoDeTexto7.setVisible(false);
                campoDeTexto7.setEnabled(false);
                boton6.setVisible(false);
                boton6.setEnabled(false);
                boton7.setVisible(false);
                boton7.setEnabled(false);
                campoDeTexto1.setText("");
                campoDeTexto2.setText("");
                campoDeTexto3.setText("");
                campoDeTexto4.setText("");
                campoDeTexto5.setText("");
                campoDeTexto6.setText("");
                campoDeTexto7.setText("");

            }
        };

        ActionListener oyenteDeAccionboton8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                String nombreABuscar = campoDeTexto8.getText();
                boolean productoHaSidoBorrado = false;
                for (Producto productofor:listadeProductos){
                    if (productofor.getNombre().equals(nombreABuscar)){
                        listadeProductos.remove(productofor);
                        productoHaSidoBorrado = true;
                    }
                }
                if (productoHaSidoBorrado) {
                    JOptionPane.showMessageDialog(panel, "Se han eliminado los productos con el nombre ingresado por el usuario", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(panel, "No existen productos en inventario con el nombre ingresado por el usuario", "", JOptionPane.ERROR_MESSAGE);
                }
                campoDeTexto8.setText("");
            }
        };

        ActionListener oyenteDeAccionboton9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                etiqueta1.setVisible(true);
                boton1.setVisible(true);
                boton1.setEnabled(true);
                etiqueta2.setVisible(true);
                boton2.setVisible(true);
                boton2.setEnabled(true);
                etiqueta3.setVisible(true);
                boton3.setVisible(true);
                boton3.setEnabled(true);
                etiqueta5.setVisible(true);
                boton10.setVisible(true);
                boton10.setEnabled(true);
                etiqueta4.setVisible(false);
                campoDeTexto8.setVisible(false);
                campoDeTexto8.setEnabled(false);
                boton8.setVisible(false);
                boton8.setEnabled(false);
                boton9.setVisible(false);
                boton9.setEnabled(false);
                campoDeTexto8.setText("");
            }
        };

        boton1.addActionListener(oyenteDeAccionboton1);
        boton2.addActionListener(oyenteDeAccionboton2);
        boton3.addActionListener(oyenteDeAccionboton3);
        boton4.addActionListener(oyenteDeAccionboton4);
        boton5.addActionListener(oyenteDeAccionboton5);
        boton6.addActionListener(oyenteDeAccionboton6);
        boton7.addActionListener(oyenteDeAccionboton7);
        boton8.addActionListener(oyenteDeAccionboton8);
        boton9.addActionListener(oyenteDeAccionboton9);
    }
}
