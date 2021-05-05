/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite;
    

import org.hibernate.Session;
import zavrsni.animesite.util.HibernateUtil;
import zavrsni.animesite.view.SplashScreen;

/**
 *
 * @author gabri
 */
public class Start {
    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        new SplashScreen().setVisible(true);
        

    }
}
