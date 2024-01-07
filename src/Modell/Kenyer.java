
package Modell;


public class Kenyer extends Pekaru{
    private boolean  magvas;

    public Kenyer(boolean magvas, String pekaruNeve) {
        super(pekaruNeve);
        this.magvas = magvas;
    }

    public boolean isMagvas() {
        return magvas;
    }

    public void setMagvas(boolean magvas) {
        this.magvas = magvas;
    }

    @Override
    public String toString() {
        return "Kenyer{" + "magvas=" + magvas + '}';
    }
    
     
    
}
