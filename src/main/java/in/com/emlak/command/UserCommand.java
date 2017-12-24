/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.command;

import in.com.emlak.domain.Emlak;

/**
 *
 * @author ELIDOR
 */
public class UserCommand {

    Emlak user;
    //TODO: more fieds if required

    public Emlak getUser() {
        return user;
    }

    public void setUser(Emlak user) {
        this.user = user;
    }
    
}
