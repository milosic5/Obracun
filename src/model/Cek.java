
package model;

import java.util.Date;

/**
 *
 * @author Milos
 */
public class Cek {
    
    private int id;
    private int brojCeka;
    private int vrednost;
    private Date datumRealizacije;
    private boolean realizovan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrojCeka() {
        return brojCeka;
    }

    public void setBrojCeka(int brojCeka) {
        this.brojCeka = brojCeka;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        this.vrednost = vrednost;
    }

    public Date getDatumRealizacije() {
        return datumRealizacije;
    }

    public void setDatumRealizacije(Date datumRealizacije) {
        this.datumRealizacije = datumRealizacije;
    }

    public boolean isRealizovan() {
        return realizovan;
    }

    public void setRealizovan(boolean realizovan) {
        this.realizovan = realizovan;
    }
    
    
    
}
