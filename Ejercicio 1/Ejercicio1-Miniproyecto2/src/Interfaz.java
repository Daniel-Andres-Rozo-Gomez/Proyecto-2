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
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;


    public Interfaz(ArrayList<Producto> listadeProductos){
        contenedor = getContentPane();
        this.setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ferreteria Bob el constructor");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(700, 600));
        Ventana();
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
    }
}