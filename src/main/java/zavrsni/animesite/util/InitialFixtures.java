/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.util;

import org.hibernate.Session;
import zavrsni.animesite.model.Anime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import zavrsni.animesite.model.User;


/**
 *
 * @author gabri
 */
public class InitialFixtures {
     public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();

        Anime a = new Anime();
        a.setNameEng("Inu-Yasha");
        a.setNameJap("Inuyasha");
        a.setGenre("Adventure, Fantasy, Romance");
        a.setEpisode("167");
        a.setReleaseYear("2000.");
        a.setSeason("7");
        a.setDescription("Kagome leads a fairly normal life.Her house is a thousand-year-old Japanese temple.Legend has it that the old well on the temple grounds keeps a vicious ancient monster at bay.The well opens up and sucked Kagome inside transporting her to an ancient time.");
        
        Anime b = new Anime();
        b.setNameEng("Attack on Titan");
        b.setNameJap("Shingeki no kyojin");
        b.setGenre("Action, Dark Fantasy, Post-apocaliptic");
        b.setEpisode("75");
        b.setReleaseYear("2013."); 
        b.setSeason("4");
        b.setDescription(" Several hundred years ago,humans were nearly exterminated by giants.Giants are several stories tall,seem to have no intelligence and devour humans.A small percentage of humanity survived by walling themselves in a city protected by extremely high walls.");
        
        Anime c = new Anime();
        c.setNameEng("Sword art online");
        c.setNameJap("Sōdo Āto Onrain");
        c.setGenre("Adventure, Science-fiction");
        c.setEpisode("96");
        c.setReleaseYear("2012.");
        c.setSeason("3");
        c.setDescription("The only way to escape is to clear the game.Death in game means actual death.The ten thousand who have logged onto the as of yet mysterious game Sword Art Online using their Nerve Gear have been forced into this perilous death game and are trapped inside.");
        
        Anime d = new Anime();
        d.setNameEng("Maid Sama!");
        d.setNameJap("Kaichou wa Maid-sama!");
        d.setGenre("Comedy, Romance");
        d.setEpisode("26");
        d.setReleaseYear("2010.");
        d.setSeason("1");
        d.setDescription("Ayuzawa Misaki the head of the student council despises the mostly male population at her school. However, Misaki's quite handsome schoolmate, Usui Takumi, just discovered her secret — that she works after school at a maid cafe.");
        
        Anime e = new Anime();
        e.setNameEng("Jujutsu Kaisen");
        e.setNameJap("Jujutsu Kaisen");
        e.setGenre("Adventure, Dark Fantasy, Supernatural");
        e.setEpisode("24");
        e.setReleaseYear("2020.");
        e.setSeason("1");
        e.setDescription("Should any demon consume Sukuna's body parts, the power they gain could destroy the world as we know it. Fortunately, there exists a mysterious school of Jujutsu Sorcerers who exist to protect the precarious existence of the living from the undead! ");
        
        Anime f = new Anime();
        f.setNameEng("Tower of God");
        f.setNameJap("Kami no Tō");
        f.setGenre("Action, Dark Fantasy");
        f.setEpisode("13");
        f.setReleaseYear("2020.");
        f.setSeason("1");
        f.setDescription("A boy named Twenty-Fifth Bam,who is trapped beneath a mysterious Tower with only Rachel.When Rachel enters the Tower,Bam manages to open the door into it as well and faces challenges at each floor of this tower as he tries to find his closest companion.");
        
        Anime g = new Anime();
        g.setNameEng("The God Of High School");
        g.setNameJap("Gas Obeu Hai Seuku");
        g.setGenre("Comedy, Supernatural");
        g.setEpisode("13");
        g.setReleaseYear("2020.");
        g.setSeason("1");
        g.setDescription("It all began as a fighting tournament to seek out for the best fighter among all high school students in Korea.Mori Jin,a Taekwondo specialist and a high school student,soon learns that there is something much greater beneath the stage of the tournament.");
        
        Anime h = new Anime();
        h.setNameEng("Haikyuu!!");
        h.setNameJap("Haikyuu!!");
        h.setGenre("Comedy, Sports");
        h.setEpisode("85");
        h.setReleaseYear("2014.");
        h.setSeason("4");
        h.setDescription("Hinata's club had no members, but somehow persevered and finally made it into its very first and final regular match of middle school, where it was steamrolled by Tobio Kageyama. Vowing revenge, Hinata applied to the Karasuno High School volleyball club.");
        
        Anime i = new Anime();
        i.setNameEng("Seven Deadly Sins");
        i.setNameJap("Nanatsu no Taizai");
        i.setGenre("Adventure, Fantasy");
        i.setEpisode("96");
        i.setReleaseYear("2014.");
        i.setSeason("4");
        i.setDescription("A group of evil knights who conspired to overthrow the kingdom of Britannia,were said to have been eradicated by the Holy Knights.Ten years later,the Holy Knights have staged a Coup d'état and assassinated the king, becoming tyrannical rulers.");
        
        Anime j = new Anime();
        j.setNameEng("Kuroko's Basketball");
        j.setNameJap("Kuroko no Basuke");
        j.setGenre("Comedy, Sports");
        j.setEpisode("75");
        j.setReleaseYear("2012.");
        j.setSeason("3");
        j.setDescription("Kuroko happens to be the shadowy sixth member of the legendary Generation of Miracles basketball team. Together, Kagami and Kuroko aim to take their team to the inter-high school championship — against Kuroko's former teammates.");
        
        s.save(a);
        s.save(b);
        s.save(c);
        s.save(d);
        s.save(e);
        s.save(f);
        s.save(g);
        s.save(h);
        s.save(i);
        s.save(j);
       
        s.getTransaction().commit();
        
    }
   
}
