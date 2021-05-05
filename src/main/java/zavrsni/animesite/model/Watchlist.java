/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author gabri
 */
@Entity
public class Watchlist extends Entitet{
    @ManyToMany
    private List<Anime> animewatchlist = new ArrayList<>();
   
    @OneToOne
   private User user;
}
