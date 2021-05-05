/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.controller;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import zavrsni.animesite.model.User;
import zavrsni.animesite.util.AnimeException;

/**
 *
 * @author gabri
 */

public class ObradaUser extends Obrada<User>{

    public User autoriziraj(String username, char[] password){
       
        User use=(User) session
                .createQuery("from User u where u.username=:username")
                .setParameter("username", username)
                .getSingleResult();
        
        if(use==null){
            return null;
        }
        return BCrypt.checkpw(new String(password),use.getPassword()) ? use : null;
    }
    
    
    @Override
    public List<User> getPodaci() {
        return session.createQuery("from User").list();
    }
    
    @Override
    protected void kontrolaDelete() throws AnimeException {
        
    }

    @Override
    protected void kontrolaCreate() throws AnimeException {
        
    }

    @Override
    protected void kontrolaUpdate() throws AnimeException {
        
    }

    
  
    
    
    
 
}
