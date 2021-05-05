/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.controller;

import java.util.List;
import org.hibernate.CacheMode;
import zavrsni.animesite.model.AlreadyWatched;
import zavrsni.animesite.model.Watchlist;
import zavrsni.animesite.util.AnimeException;

/**
 *
 * @author gabri
 */
public class ObradaWatchlist extends Obrada<Watchlist>{

    
    @Override
    public List<Watchlist> getPodaci() {
        List<Watchlist> lista =session.createQuery("from Watchlist").list();
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
