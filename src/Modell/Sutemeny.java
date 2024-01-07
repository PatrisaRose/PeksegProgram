
package Modell;


public class Sutemeny extends Pekaru{
    
    private Csomagolas csomi;
    
    public Sutemeny(String pekaruNeve) {
        super(pekaruNeve);
    }

    public Sutemeny(Csomagolas csomi, String pekaruNeve) {
        super(pekaruNeve);
        this.csomi = csomi;
    }

    public Csomagolas getCsomi() {
        return csomi;
    }

    @Override
    public String toString() {
        return "Sutemeny{" + "csomi=" + csomi + '}';
    }
    
    
}
