/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.service;

import in.com.emlak.domain.Emlak;
import in.com.emlak.domain.User;
import java.util.List;

/**
 *
 * @author ELIDOR
 */
public interface UserService {

    public void register(Emlak e);
    
    public void Delete(Emlak e);

    public void update(Emlak e);

    public User login(String loginName, String password);

    public List<Emlak> konumAramaString();

    public Emlak findByAttribute(String evlerId);
}
