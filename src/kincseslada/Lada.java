
package kincseslada;


public class Lada {
    private String ladaNev = "", felirat = "";
    private int ladaSzam = 0;
    
    Lada(String ladaNev, String felirat, int ladaSzam){
        this.ladaNev = ladaNev;
        this.felirat = felirat;
        this.ladaSzam = ladaSzam;
    }

    public String getLadaNev() {
        return ladaNev;
    }

    public String getFelirat() {
        return felirat;
    }

    public int getLadaSzam() {
        return ladaSzam;
    }

    @Override
    public String toString() {
        return "Ládanév: " + getLadaNev() + ", Felirat: " + getFelirat();
    }

}
