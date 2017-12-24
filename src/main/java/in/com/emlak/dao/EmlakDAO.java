/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.dao;

import in.com.emlak.domain.Emlak;
import java.util.List;

/**
 *
 * @author ELIDOR
 */
public interface EmlakDAO {

    public void save(Emlak e);

    public void update(Emlak e);

    public void delete(Integer userId);

    public List<Emlak> findAll();

    public List<Emlak> findByProperty(String propName, Object propValue);

    public Emlak findByPropertyObj(String propName, Object propValue);
}
