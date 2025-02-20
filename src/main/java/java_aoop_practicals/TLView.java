package java_aoop_practicals;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TLView  implements Observer {

    private static final Dimension PANEL_SIZE = new Dimension(200,200);

    private final TLModel model;
    private final TLController controller;
    private JFrame frame;
    private JPanel panel;

    private final JTextField redField = new JTextField(3);
    private final JTextField amberField = new JTextField(3);
    private final JTextField greenField = new JTextField(3);
    private final JLabel redLabel = new JLabel("Red");
    private final JLabel amberLabel = new JLabel("Amber");
    private final JLabel greenLabel = new JLabel("Green");
    private final JButton changeButton = new JButton("Change");
    private final JButton initialiseButton = new JButton("Initialise");

     
    public TLView(TLModel model, TLController controller)  {        
        this.model = model; 
        model.addObserver(this);
        this.controller = controller;
        createControls();
        controller.setView(this);
        update(model, null);
    } 
    
    public void createControls()
    {
        frame = new JFrame("MVC Traffic Light Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
        createPanel();
        contentPane.add(panel);
        
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    @Override
     public void update(java.util.Observable o, Object arg) {
        redField.setText(model.getRed()?"ON":"OFF");
        amberField.setText(model.getAmber()?"ON":"OFF");
        greenField.setText(model.getGreen()?"ON":"OFF");
        frame.repaint();
    }

    private void createPanel() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        redField.setEditable(false);
        amberField.setEditable(false);
        greenField.setEditable(false);
        
        panel.add(redLabel);
        panel.add(redField);
        panel.add(amberLabel);
        panel.add(amberField);
        panel.add(greenLabel);
        panel.add(greenField);
        
        

        
        changeButton.addActionListener((ActionEvent e) -> {controller.change();});
        panel.add(changeButton);
       
        initialiseButton.addActionListener((ActionEvent e) -> {controller.initialise();});
        panel.add(initialiseButton);
        
        panel.setPreferredSize(PANEL_SIZE);
    }
}
