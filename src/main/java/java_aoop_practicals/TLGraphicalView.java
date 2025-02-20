package java_aoop_practicals;

import java.awt.Canvas;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class TLGraphicalView implements Observer {
    
    private TLModel model;
    private Canvas canvas;
    private ColorPanel pane;
    
    public TLGraphicalView(TLModel model)  { 
        this.model = model; 
        this.pane = new ColorPanel(model);
        

        JFrame frame = new JFrame("MVC Lights");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.getContentPane().add(pane);
        
        frame.pack();

        frame.setResizable(false);
        frame.setVisible(true);

        model.addObserver(this);
        update(model, null);
    } 

    @Override
    public void update(Observable o, Object arg) {
        pane.repaint();
    }
}
