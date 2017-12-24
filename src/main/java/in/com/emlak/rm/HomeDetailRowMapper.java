/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.rm;

import in.com.emlak.domain.Emlak;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ELIDOR
 */
public class HomeDetailRowMapper implements RowMapper<Emlak> {

    @Override
    public Emlak mapRow(ResultSet rs, int i) throws SQLException {
        Emlak e = new Emlak();
        e.setEvlerId(rs.getInt("evlerId"));
        e.setFiyat(rs.getString("fiyat"));
        e.setMetreKare(rs.getString("metreKare"));
        e.setOdaSayisi(rs.getString("odaSayisi"));
        e.setBulunduguKat(rs.getString("bulunduguKat"));
        e.setKonum(rs.getString("konum"));     
        e.setTip(rs.getString("tip"));
        e.setBolge(rs.getString("bolge"));
        e.setAciklama(rs.getString("aciklama"));
        e.setBinaYasi(rs.getString("binaYasi"));
        e.setIsinma(rs.getString("isinma"));     
        e.setKatSayisi(rs.getString("katSayisi"));
        e.setBanyoSayisi(rs.getString("banyoSayisi"));
        e.setEsyali(rs.getString("esyali"));
        e.setKullanimDurumu(rs.getString("kullanimDurumu"));
        e.setSiteIcerisinde(rs.getString("siteIcerisinde"));
        e.setKrediyeUygun(rs.getString("krediyeUygun"));
        e.setKimden(rs.getString("kimden"));
        e.setTakas(rs.getString("takas"));
        e.setAidat(rs.getString("aidat"));
        e.setAdres(rs.getString("adres"));
            
        return e;
    }
    
}
