/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.util;

import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
import zavrsni.animesite.controller.ObradaUser;
import zavrsni.animesite.model.User;

/**
 *
 * @author gabri
 */
public class KreirajUser {
        
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();

        User u = new User();
        u.setUsername("Gabi");
        u.setName("Gabriela");
        u.setSurname("Svalina");
        
        u.setPassword(BCrypt.hashpw("anime", BCrypt.gensalt()));
        s.save(u);

        s.getTransaction().commit();
        
    }
}
