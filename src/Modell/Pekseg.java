package Modell;

public class Pekseg {

    private Pekaru[] pekaruk;
    private int pekaruDb;
    private boolean termeles;

    public Pekseg() {
        this(5);
    }

    public Pekseg(int db) {
        pekaruDb = 0;
        pekaruk = new Pekaru[db];
        termeles = true;
    }

    public void sutoFeltolt(Pekaru pekaru) {
        if (termeles) {
            if (pekaruDb < pekaruk.length) {
                pekaruk[pekaruDb++] = pekaru;
            } else {
                System.out.println("A sütő megtelt!!");
            }
        } else {
            System.out.println("Nincs termelés");
        }
    }

    public void sutes(int perc) {
        for (Pekaru pekaru : pekaruk) {
            if (pekaru instanceof Sutemeny) {
                if (perc >= 35) {
                    pekaru.setOdaegett(true);
                    System.out.println("A " + pekaru.getPekaruNeve() +" megégett!");
                } else if (perc >= 25 && perc < 35) {
                    pekaru.setKisutve(true);
                    pekaru.setNyers(false);
                    System.out.println("A " + pekaru.getPekaruNeve() +" megsült!");
                }
            }
            if (pekaru instanceof Kenyer) {
                if (perc >= 70) {
                    pekaru.setOdaegett(true);
                    System.out.println("A " + pekaru.getPekaruNeve() +" megégett!");
                } else if (perc >= 60 && perc < 70) {
                    pekaru.setKisutve(true);
                    pekaru.setNyers(false);
                    System.out.println("A " + pekaru.getPekaruNeve() +" megsült!");
                }
            }
        }
    }
    
    public void kivetel(String pekaruNeve){
        int index = -1;
        for (int i = 0; i < pekaruk.length; i++) {
            if (pekaruk[i].getPekaruNeve().equals(pekaruNeve)){
                index = i;
            }
        }
        System.out.println("Kiadva: " + pekaruk[index].getPekaruNeve());
        pekaruk[index] = null;
    }

    public void leeg() {
        termeles = false;
        pekaruk = new Pekaru[5];
    }
}
