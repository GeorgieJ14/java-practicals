package java_aoop_practicals;

import java.util.Observable;

public class TLModelWithSpecification extends Observable {

    private boolean red;
    private boolean amber;
    private boolean green;

    public boolean invariant() {
        return (red && !amber && !green) || (red && amber && !green) || 
                (!red && !amber && green) || (!red && amber && !green);
    }

    public TLModelWithSpecification() {
        initialise();
    }
    
    public boolean getRed(){
        return red;
    }
    
    public boolean getAmber(){
        return amber;
    }

    public boolean getGreen(){
        return green;
    }

    /**
     * @pre. true
     * @post. (\old(red) && !\old(amber) && !\old(green) && red && amber && !green) ||
     * (\old(red) && \old(amber) && !\old(green) && !red && !amber && green) ||
     * (!\old(red) && !\old(amber) && \old(green) && !red && amber && !green) ||
     * (!\old(red) && \old(amber) && !\old(green) && red && !amber && !green)
     */
    // was red and now red-amber or was red-amber and now green or 
    // was green and now amber or was amber and now red
    public void change() {
        assert invariant();

        if (red && !amber && !green) {
            amber = true;
        } else if (red && amber && !green) {
            red = false; amber = false; green = true;
        } else if (!red && !amber && green) {
            green = false; amber = true;
        } else { // just assume amber (is this wise?)
            red = true; amber = false; green = false;
        }

        setChanged();
        notifyObservers();

    }

    /*@pre. true
     *@post. red && !amber && !green
    */
    public void initialise() {
        red = true;
        amber = false;
        green = false;
        setChanged();
        notifyObservers();
    }
}
