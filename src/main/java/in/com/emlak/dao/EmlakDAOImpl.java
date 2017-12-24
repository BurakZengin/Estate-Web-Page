/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.dao;

import in.com.emlak.domain.Emlak;
import in.com.emlak.rm.EmlakRowMapper;
import in.com.emlak.rm.HomeDetailRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ELIDOR
 */
@Repository
public class EmlakDAOImpl extends BaseDAO implements EmlakDAO {

    @Override
    public void save(Emlak e) {
        String sql = "INSERT INTO evler(konum, fiyat, tip, bolge, aciklama, metreKare, odaSayisi,"
                + "binaYasi, bulunduguKat, katSayisi, isinma, banyoSayisi, esyali, kullanimDurumu, siteIcerisinde,"
                + "aidat, krediyeUygun, kimden, takas, adres, photo) VALUES(:konum, :fiyat, :tip, :bolge, :aciklama, :metreKare, :odaSayisi,"
                + ":binaYasi, :bulunduguKat, :katSayisi, :isinma, :banyoSayisi, :esyali, :kullanimDurumu, :siteIcerisinde,"
                + ":aidat, :krediyeUygun, :kimden, :takas, :adres, :photo)";
        Map m = new HashMap();
        m.put("konum", e.getKonum());
        m.put("fiyat", e.getFiyat());
        m.put("tip", e.getTip());
        m.put("bolge", e.getBolge());
        m.put("aciklama", e.getAciklama());
        m.put("metreKare", e.getMetreKare());
        m.put("odaSayisi", e.getOdaSayisi());
        m.put("binaYasi", e.getBinaYasi());
        m.put("bulunduguKat", e.getBulunduguKat());
        m.put("katSayisi", e.getKatSayisi());
        m.put("isinma", e.getIsinma());
        m.put("banyoSayisi", e.getBanyoSayisi());
        m.put("esyali", e.getEsyali());
        m.put("kullanimDurumu", e.getKullanimDurumu());
        m.put("siteIcerisinde", e.getSiteIcerisinde());
        m.put("aidat", e.getAidat());
        m.put("krediyeUygun", e.getKrediyeUygun());
        m.put("kimden", e.getKimden());
        m.put("takas", e.getTakas());
        m.put("adres", e.getAdres());
        m.put("photo", e.getPhoto());

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer evlerId = kh.getKey().intValue();
        e.setEvlerId(evlerId);
    }

    @Override
    public void update(Emlak e) {
        String sql = "UPDATE evler "
                + " SET konum=:konum,"
                + " fiyat=:fiyat, "
                + " tip=:tip,"
                + " bolge=:bolge,"
                + " aciklama=:aciklama,"
                + " metreKare=:metreKare,"
                + " odaSayisi=:odaSayisi,"
                + " binaYasi=:binaYasi,"
                + " bulunduguKat=:bulunduguKat,"
                + " katSayisi=:katSayisi,"
                + " isinma=:isinma,"
                + " banyoSayisi=:banyoSayisi,"
                + " esyali=:esyali,"
                + " kullanimDurumu=:kullanimDurumu,"
                + " siteIcerisinde=:siteIcerisinde,"
                + " aidat=:aidat,"
                + " krediyeUygun=:krediyeUygun,"
                + " kimden=:kimden,"
                + " takas=:takas,"
                + " adres=:adres,"
                + " photo=:photo"
                + " WHERE evlerId=:evlerId";

        Map m = new HashMap();
        m.put("evlerId", e.getEvlerId());
        m.put("konum", e.getKonum());
        m.put("fiyat", e.getFiyat());
        m.put("tip", e.getTip());
        m.put("bolge", e.getBolge());
        m.put("aciklama", e.getAciklama());
        m.put("metreKare", e.getMetreKare());
        m.put("odaSayisi", e.getOdaSayisi());
        m.put("binaYasi", e.getBinaYasi());
        m.put("bulunduguKat", e.getBulunduguKat());
        m.put("katSayisi", e.getKatSayisi());
        m.put("isinma", e.getIsinma());
        m.put("banyoSayisi", e.getBanyoSayisi());
        m.put("esyali", e.getEsyali());
        m.put("kullanimDurumu", e.getKullanimDurumu());
        m.put("siteIcerisinde", e.getSiteIcerisinde());
        m.put("aidat", e.getAidat());
        m.put("krediyeUygun", e.getKrediyeUygun());
        m.put("kimden", e.getKimden());
        m.put("takas", e.getTakas());
        m.put("adres", e.getAdres());
        m.put("photo", e.getPhoto());
        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Integer evlerId) {
        String sql = "DELETE FROM evler WHERE evlerId=?";
        getJdbcTemplate().update(sql, evlerId);
    }

    @Override
    public List<Emlak> findAll() {
        String sql = "SELECT userId, konum, tip, fiyat FROM evler";
        /*
           List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
           return users;
         */
        return getJdbcTemplate().query(sql, new EmlakRowMapper());
    }

    @Override
    public List<Emlak> findByProperty(String propName, Object propValue) {
        String sql = "SELECT evlerId, konum, fiyat, tip, bolge, aciklama, "
                + "metreKare, odaSayisi, binaYasi, bulunduguKat, katSayisi, "
                + "isinma, banyoSayisi, esyali, kullanimDurumu, siteIcerisinde, "
                + "aidat, krediyeUygun, kimden, takas, adres, photo FROM evler WHERE " + propName + "=?";
        return getJdbcTemplate().query(sql, new HomeDetailRowMapper(), propValue);
    }

    @Override
    public Emlak findByPropertyObj(String propName, Object propValue) {
        String sql = "SELECT evlerId, konum, fiyat, tip, bolge, aciklama, "
                + "metreKare, odaSayisi, binaYasi, bulunduguKat, katSayisi, "
                + "isinma, banyoSayisi, esyali, kullanimDurumu, siteIcerisinde, "
                + "aidat, krediyeUygun, kimden, takas, adres, photo FROM evler WHERE " + propName + "=?";
        return getJdbcTemplate().queryForObject(sql, new HomeDetailRowMapper(), propValue);
    }

}
