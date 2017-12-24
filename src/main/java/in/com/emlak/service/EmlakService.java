/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.service;

import in.com.emlak.domain.Emlak;
import java.util.List;

/**
 *
 * @author ELIDOR
 */
public interface EmlakService {

    public List<Emlak> arama(String tip, String bolge, String konum);

    public List<Emlak> konumArama();

    public List<Emlak> findByAttribute(String evlerId);

}
