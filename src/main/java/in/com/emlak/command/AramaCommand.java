/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.command;

/**
 *
 * @author ELIDOR
 */
public class AramaCommand {
    
    private String konum;
    private String bolge;
    private int evlerId;

    public int getEvlerId() {
        return evlerId;
    }

    public void setEvlerId(int evlerId) {
        this.evlerId = evlerId;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    } 

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }
    
}
