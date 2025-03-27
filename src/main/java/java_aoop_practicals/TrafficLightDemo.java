package java_aoop_practicals;

public class TrafficLightDemo {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(
            new Runnable() {
                public void run () {createAndShowGUI();}
            }
        );
    }

    public static void createAndShowGUI() {

        // TLModel model = new TLModel();
        TLController controller = new TLController();
        TLView view = new TLView(controller.getModel(), controller);
        TLGraphicalView gview = new TLGraphicalView(controller.getModel());
    }
}
