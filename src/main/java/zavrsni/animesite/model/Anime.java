/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.model;

import javax.persistence.Entity;

/**
 *
 * @author gabri
 */
@Entity
public class Anime extends Entitet {
    
    private String nameEng;
    private String nameJap;
    private String genre;
    private String episode;
    private String releaseYear;
    private String season;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getNameJap() {
        return nameJap;
    }

    public void setNameJap(String nameJap) {
        this.nameJap = nameJap;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    
    @Override
    public String toString() {
        if(getNameEng()==null || getNameEng().trim().isEmpty()){
            return"[Name isn't defined]";
        }
        
        return getNameEng();
    }
}
