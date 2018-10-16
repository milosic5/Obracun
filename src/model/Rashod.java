
package model;

/**
 *
 * @author Milos
 */
public class Rashod {
    
    private String naziv;
    private int planiranaVrednost;
    private int realizovanaVrednost;
    private boolean realizovano;

    public boolean isRealizovano() {
        return realizovano;
    }

    public void setRealizovano(boolean realizovano) {
        this.realizovano = realizovano;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPlaniranaVrednost() {
        return planiranaVrednost;
    }

    public void setPlaniranaVrednost(int planiranaVrednost) {
        this.planiranaVrednost = planiranaVrednost;
    }

    public int getRealizovanaVrednost() {
        return realizovanaVrednost;
    }

    public void setRealizovanaVrednost(int realizovanaVrednost) {
        this.realizovanaVrednost = realizovanaVrednost;
    }
    
    
    
}
