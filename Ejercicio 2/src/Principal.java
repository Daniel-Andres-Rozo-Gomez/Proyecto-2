import java.awt.event.MouseEvent;

public class Principal extends javax.swing.JFrame{
    private Lienzo canvas1;

    public Principal() {
        initComponents();
        canvas1 = new Lienzo();
        canvas1.setBounds(20,40,600,400);
        canvas1.addMouseListener(new java.awt.event.MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            
            }

            @Override
            public void mousePressed(MouseEvent e) {
                canvas1.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            
            }

            @Override
            public void mouseExited(MouseEvent e) {
   
            }
        });

        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
            
            }

            @Override
            public void mouseMoved(MouseEvent e) {
        
            }

        });

        this.add(canvas1);
}

    private void initComponents() {
    
    }

    private void add(Lienzo canvas12) {

    
    }

    public void setVisible(boolean b) {

    
    }
}