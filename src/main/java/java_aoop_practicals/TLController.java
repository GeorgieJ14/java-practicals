package java_aoop_practicals;

public class TLController {

    private TLModel model = new TLModel();
    private TLView view;

    public TLController() {
        // this.model = model;
    }

    public TLModel getModel() {
        return model;
    }

    public void setView(TLView  view) {
        this.view = view;
    }

    public void change() {
        model.change();
    }

    public void initialise() {
        model.initialise();
    }
}
