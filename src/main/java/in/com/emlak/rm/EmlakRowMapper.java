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
public class EmlakRowMapper implements RowMapper<Emlak> {

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
        e.setAdres(rs.getString("adres"));

        return e;
    }
}
