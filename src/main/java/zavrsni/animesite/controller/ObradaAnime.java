/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.controller;

import java.util.List;
import org.hibernate.CacheMode;
import zavrsni.animesite.model.Anime;
import zavrsni.animesite.util.AnimeException;

/**
 *
 * @author gabri
 */
    
public class ObradaAnime extends Obrada<Anime>{

    @Override
    public List<Anime> getPodaci() {
        List<Anime> lista =session.createQuery("from Anime").list();
        session.setCacheMode(CacheMode.IGNORE);
        return lista;
    }

    @Override
    protected void kontrolaCreate() throws AnimeException {
       
    }

    @Override
    protected void kontrolaUpdate() throws AnimeException {
        
    }

    @Override
    protected void kontrolaDelete() throws AnimeException {
       
    }

}
