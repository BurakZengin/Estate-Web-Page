/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.service;

import in.com.emlak.dao.BaseDAO;
import in.com.emlak.dao.EmlakDAO;
import in.com.emlak.domain.Emlak;
import in.com.emlak.rm.EmlakRowMapper;
import in.com.emlak.rm.KonumRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ELIDOR
 */
@Service
public class EmlakServiceImpl extends BaseDAO implements EmlakService {

    @Autowired
    private EmlakDAO emlakDAO;
    
    @Override
    public List<Emlak> arama(String tip, String bolge, String konum) {
        String sql = "SELECT evlerId, adres, fiyat, metreKare, odaSayisi, bulunduguKat, konum, tip, bolge FROM evler WHERE tip=? And bolge=? AND konum=?";
        return getJdbcTemplate().query(sql, new EmlakRowMapper(), tip, bolge, konum);
    }

    @Override
    public List<Emlak> findByAttribute(String evlerId) {
       return emlakDAO.findByProperty("evlerId", evlerId);
    }

    @Override
    public List<Emlak> konumArama() {
        String sql = "SELECT konum FROM evler";
        return getJdbcTemplate().query(sql, new KonumRowMapper());

    }
}
