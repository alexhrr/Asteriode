
package asteroids.modelos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Ventana extends JFrame implements ActionListener{
    JPanel p1 = new JPanel();
    JButton iniciar, salir;
    JLabel titulo = new JLabel("Asteroides");
    Lienzo li = new Lienzo();
    Ventana(){
        CrearPanel();
        Escuchar();
        CrearVentana();
    }

    private void CrearPanel() {
        p1.setLayout(null);
        iniciar= new JButton("Iniciar");
        salir = new JButton("Salir");
        iniciar.setBounds(40, 350, 100, 30);
        salir.setBounds(160, 350, 100, 30);
        titulo.setBounds(50, 50, 300, 200);
        titulo.setFont(new Font("Times New Roman",Font.ITALIC,50));
        p1.add(iniciar);
        p1.add(salir);
        p1.add(titulo);
    }

    private void CrearVentana() {
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Asteroides");
        setResizable(false);
        setBackground(Color.white);
        setLocationRelativeTo(null);
        add(p1);
        setVisible(true);      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(iniciar)){
            CambioPanel(p1, li);
            
        }
        if(e.getSource().equals(salir)){
            this.dispose();
        }
        
    }
    
    public void Escuchar(){
        iniciar.addActionListener(this);
        salir.addActionListener(this);
        addKeyListener(li);
    }
    
    public void CambioPanel(JPanel pv,JPanel pn){
        setVisible(false);
        remove(pv);
        add(pn);
        setVisible(true);
    }
    
}
