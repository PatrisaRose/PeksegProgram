
package Main;

import Modell.Kenyer;
import Modell.Pekseg;
import Modell.Sutemeny;

public class PeksegProgram {
    private Pekseg pekseg;

  
    public static void main(String[] args) {
       new PeksegProgram();
    }
    
    public PeksegProgram(){
        pekseg = new Pekseg(4);
        
        pekseg.sutoFeltolt(new Kenyer(false, "falusi kenyér"));
        pekseg.sutoFeltolt(new Sutemeny("csokis croissant"));
        pekseg.sutoFeltolt(new Kenyer(true, "magvas kenyér"));
        pekseg.sutoFeltolt(new Kenyer(false, "fehér kenyér"));
        
        pekseg.sutes(65);
        
        pekseg.kivetel("falusi kenyér");
    }
}
