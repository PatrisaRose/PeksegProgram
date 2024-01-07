package Modell;

public abstract class Pekaru {

    private String pekaruNeve;
    private boolean kisutve;
    private boolean odaegett;
    private boolean nyers;

    public Pekaru(String pekaruNeve) {
        this.pekaruNeve = pekaruNeve;
        kisutve = false;
        odaegett = false;
        nyers = true;
    }

    public String getPekaruNeve() {
        return pekaruNeve;
    }

    public void setPekaruNeve(String pekaruNeve) {
        this.pekaruNeve = pekaruNeve;
    }

    public boolean isKisutve() {
        return kisutve;
    }

    public void setKisutve(boolean kisutve) {
        this.kisutve = kisutve;
    }

    public boolean isOdaegett() {
        return odaegett;
    }

    public void setOdaegett(boolean odaegett) {
        this.odaegett = odaegett;
    }

    public boolean isNyers() {
        return nyers;
    }

    public void setNyers(boolean nyers) {
        this.nyers = nyers;
    }

    @Override
    public String toString() {
        return "Pekaru{" + "pekaruNeve=" + pekaruNeve + ", kisutve=" + kisutve + ", odaegett=" + odaegett + ", nyers=" + nyers + '}';
    }
    
    

    

}
