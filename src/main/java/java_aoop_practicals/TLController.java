package java_aoop_practicals;

public class TLController {

    private TLModel model;
    private TLView view;

    public TLController(TLModel model) {
        this.model = model;
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
