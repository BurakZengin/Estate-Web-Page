/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.service;

import in.com.emlak.dao.BaseDAO;
import in.com.emlak.dao.EmlakDAO;
import in.com.emlak.domain.Emlak;
import in.com.emlak.domain.User;
import in.com.emlak.rm.EmlakRowMapper;
import in.com.emlak.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ELIDOR
 */
@Service
public class UserServiceImpl extends BaseDAO implements UserService {

    @Autowired
    private EmlakDAO emlakDAO;
    
    @Override
    public void register(Emlak e) {
        emlakDAO.save(e);
    }
    
    @Override
    public User login(String username, String password) {
        String sql = "SELECT userId, username, password FROM user WHERE username=:un AND password=:pw";
        Map m = new HashMap();
        m.put("un", username);
        m.put("pw", password);

        User u = getNamedParameterJdbcTemplate().queryForObject(sql, m, new UserRowMapper());
        return u;
    }
    
    @Override
    public List<Emlak> konumAramaString() {
        String sql = "SELECT evlerId, adres, fiyat, metreKare, odaSayisi, bulunduguKat, konum, tip, bolge FROM evler";
        return getJdbcTemplate().query(sql, new EmlakRowMapper());

    }

    @Override
    public Emlak findByAttribute(String evlerId) {
        return emlakDAO.findByPropertyObj("evlerId", evlerId);
    }

    @Override
    public void update(Emlak e) {
        emlakDAO.update(e);
    }

    @Override
    public void Delete(Emlak e) {
        emlakDAO.delete(e.getEvlerId());
    }
    
}
