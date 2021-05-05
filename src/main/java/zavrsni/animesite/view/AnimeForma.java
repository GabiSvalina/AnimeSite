/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import zavrsni.animesite.controller.ObradaAlreadyWatched;
import zavrsni.animesite.controller.ObradaAnime;
import zavrsni.animesite.controller.ObradaWatchlist;
import zavrsni.animesite.model.Anime;
import zavrsni.animesite.model.User;
import zavrsni.animesite.util.AnimeException;

/**
 *
 * @author gabri
 */
public class AnimeForma extends javax.swing.JFrame {
    
    private ObradaAnime obrada;
    private ObradaAlreadyWatched obradaAnime;
    private ObradaWatchlist obradaWatchlist;
    private User user;
    
    
    
    
    /**
     * Creates new form AnimeForma
     */
    public AnimeForma() {
        initComponents();
        obrada = new ObradaAnime();
        
//        loadAnime();
        
        setTitle(Aplikacija.NASLOV_APP);
        new Vrijeme().start();
        
        String name = Aplikacija.user.getName();
        String surname = Aplikacija.user.getSurname();
        lblNameUser.setText("WELCOME \r" + name.toUpperCase() + " " + surname.toUpperCase());
        
        ucitaj();
        loadWatchlist();
    }

    private void ucitaj() {
        DefaultListModel<Anime> m = new DefaultListModel<>();
        m.addAll(obrada.getPodaci());
        lstAnime.setModel(m);
    }

    
    
        private class Vrijeme extends Thread{
        
        private SimpleDateFormat df = 
                new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");

        @Override
        public void run() {
            while (true) {                
                lblTime.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameUser = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstWatchlist = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAlreadyWatched = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAnime = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnAddWatchlist = new javax.swing.JButton();
        btnRemoveWatchlist = new javax.swing.JButton();
        btnDeleteAlreadyWatched = new javax.swing.JButton();
        btnAddAlreadyWatched = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNameEnglish = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNameJapanese = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtReleaseYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSeasons = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEpisodes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnSave = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNameUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNameUser.setText("Welcome");

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setText("Time");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Watchlist");

        lstWatchlist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstWatchlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstWatchlistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstWatchlist);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Already Watched");

        lstAlreadyWatched.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(lstAlreadyWatched);

        lstAnime.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAnimeValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstAnime);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Anime");

        btnAddWatchlist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddWatchlist.setText("Add");
        btnAddWatchlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWatchlistActionPerformed(evt);
            }
        });

        btnRemoveWatchlist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveWatchlist.setText("Remove");
        btnRemoveWatchlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveWatchlistActionPerformed(evt);
            }
        });

        btnDeleteAlreadyWatched.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteAlreadyWatched.setText("Remove");
        btnDeleteAlreadyWatched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAlreadyWatchedActionPerformed(evt);
            }
        });

        btnAddAlreadyWatched.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddAlreadyWatched.setText("Add");
        btnAddAlreadyWatched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlreadyWatchedActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Name English");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Name Japanese");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Genre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Release Year");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Seasons");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Episodes");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        jScrollPane4.setViewportView(txtDescription);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNameEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSeasons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(txtGenre, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddWatchlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnRemoveWatchlist, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(btnDeleteAlreadyWatched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAddAlreadyWatched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEpisodes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNameJapanese)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtReleaseYear)))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddWatchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoveWatchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddAlreadyWatched, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeleteAlreadyWatched, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameJapanese, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtReleaseYear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSeasons, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtEpisodes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstAnimeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAnimeValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if (lstAnime.getSelectedValue() == null) {
            return;
        }
        
        Anime a = lstAnime.getSelectedValue();

        txtNameEnglish.setText(a.getNameEng());
        txtNameJapanese.setText(a.getNameJap());
        txtGenre.setText(a.getGenre());
        txtReleaseYear.setText(a.getReleaseYear());
        txtSeasons.setText(a.getSeason());
        txtEpisodes.setText(a.getEpisode());
        txtDescription.setText(a.getDescription());
        
    }//GEN-LAST:event_lstAnimeValueChanged

    private void btnAddAlreadyWatchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlreadyWatchedActionPerformed
          DefaultListModel<Anime> m;         
        try {
            m=(DefaultListModel<Anime>) lstAlreadyWatched.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m= new DefaultListModel<>();
            lstAlreadyWatched.setModel(m);
        }
        boolean postoji;
       for(Anime a : lstAnime.getSelectedValuesList()){
           postoji=false;
           for(int i=0;i<m.size();i++){
               if(a.getId().equals(m.get(i).getId())){
                   postoji=true;
                   break;
               }
           }
           if(!postoji){
               
               
               m.addElement(a);
           }
       }
       lstAlreadyWatched.repaint();
       
    }//GEN-LAST:event_btnAddAlreadyWatchedActionPerformed

    private void btnDeleteAlreadyWatchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAlreadyWatchedActionPerformed
            DefaultListModel<Anime> m;
        try {
            m=(DefaultListModel<Anime>) lstAlreadyWatched.getModel();
            m.get(0).toString();
        } catch (Exception e) {
           return;
        }
        
        for(Anime an : lstAlreadyWatched.getSelectedValuesList()){
          
           for(int i=0;i<m.size();i++){
               if(an.getId().equals(m.get(i).getId())){
                   m.removeElementAt(i);
                   break;
               }
           }
          
       }
    }//GEN-LAST:event_btnDeleteAlreadyWatchedActionPerformed

    private void btnAddWatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWatchlistActionPerformed
        DefaultListModel<Anime> m;         
        try {
            m=(DefaultListModel<Anime>) lstWatchlist.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m= new DefaultListModel<>();
            lstWatchlist.setModel(m);
        }
        boolean postoji;
       for(Anime a : lstAnime.getSelectedValuesList()){
           postoji=false;
           for(int i=0;i<m.size();i++){
               if(a.getId().equals(m.get(i).getId())){
                   postoji=true;
                   break;
               }
           }
           if(!postoji){
               
               
               m.addElement(a);
           }
       }
       lstWatchlist.repaint();
    }//GEN-LAST:event_btnAddWatchlistActionPerformed

    private void btnRemoveWatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveWatchlistActionPerformed
        DefaultListModel<Anime> m;
        try {
            m=(DefaultListModel<Anime>) lstWatchlist.getModel();
            m.get(0).toString();
        } catch (Exception e) {
           return;
        }
        
        for(Anime an : lstWatchlist.getSelectedValuesList()){
          
           for(int i=0;i<m.size();i++){
               if(an.getId().equals(m.get(i).getId())){
                   m.removeElementAt(i);
                   break;
               }
           }
          
       }
    }//GEN-LAST:event_btnRemoveWatchlistActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//        if (obrada.getEntitet()==null || 
//                obrada.getEntitet().getId() == null) {
//            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
//            return;
//        }
//        postaviVrijednostiNaEntitet();
//
//        try {
//            obrada.update();
//            pocisti();
//            ucitajRazrede();
//        } catch (EdunovaException e) {
//            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
//        }
        obrada.setEntitet(new Anime());
        setAnimeOnEntity();

        try {
            obrada.update();
        } catch (AnimeException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lstWatchlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstWatchlistValueChanged
       if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstWatchlist.getSelectedValue() == null) {
            return;
        }
        
        Anime a = lstWatchlist.getSelectedValue();
    }//GEN-LAST:event_lstWatchlistValueChanged

    
    private void setAnimeOnEntity() {
        var c = Aplikacija.user;
        
        DefaultListModel<Anime> a;
        try {
            a=(DefaultListModel<Anime>) lstWatchlist.getModel();
            c.setAnime(new ArrayList<>());
            for(int i=0;i<a.getSize();i++){
                c.getAnime().add(a.get(i));
            }
        } catch (Exception e) {
           
        }
    }

    private void loadWatchlist() {
                
        DefaultListModel<Anime> m = new DefaultListModel<>();

        m.addAll(Aplikacija.user.getAnime());

        lstWatchlist.setModel(m);
    }
    
    private void loadAlreadyWatched() {
                
        DefaultListModel<Anime> m = new DefaultListModel<>();

        m.addAll(Aplikacija.user.getAnime());

        lstAlreadyWatched.setModel(m);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAlreadyWatched;
    private javax.swing.JButton btnAddWatchlist;
    private javax.swing.JButton btnDeleteAlreadyWatched;
    private javax.swing.JButton btnRemoveWatchlist;
    private javax.swing.JToggleButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList<Anime> lstAlreadyWatched;
    private javax.swing.JList<Anime> lstAnime;
    private javax.swing.JList<Anime> lstWatchlist;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtEpisodes;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtNameEnglish;
    private javax.swing.JTextField txtNameJapanese;
    private javax.swing.JTextField txtReleaseYear;
    private javax.swing.JTextField txtSeasons;
    // End of variables declaration//GEN-END:variables
    
//    private void loadAnime() {
//         DefaultListModel<Anime> m = new DefaultListModel<>();
//
//        m.addAll(obradaA.getPodaci());
//
//        lstAnime.setModel(m);
//    }
    
    private void setValueOnEntity(){
        
        
        var a = obrada.getEntitet();
        a.setNameEng(txtNameEnglish.getText());
        a.setNameJap(txtNameJapanese.getText());
        a.setGenre(txtGenre.getText());
        a.setReleaseYear(txtReleaseYear.getText());
        a.setSeason(txtSeasons.getText());
        a.setEpisode(txtEpisodes.getText());
        a.setDescription(txtDescription.getText());
        
        
        
    }
    
    private void setWatchlistOnEntity(){
        var a = Aplikacija.user;
        DefaultListModel<Anime> m;
        try {
            m=(DefaultListModel<Anime>) lstWatchlist.getModel();
            a.setAnime(new ArrayList<>());
            for(int i=0;i<m.getSize();i++){
                a.getAnime().add(m.get(i));
            }
        } catch (Exception e) {
           
        }
    }
//    
//    
//        private void postaviVrijednostiNaEntitet() {
//       var g = obradaA.getEntitet();
//       g.setNameEng(txtNaziv.getText());
//       g.setUcitelj((Ucitelj) cmbUcitelji.getSelectedItem());
//       g.setSkolskagodina((SkolskaGodina) cmbGodina.getSelectedItem());
//       
//       DefaultListModel<Ucenik> m;
//        try {
//            m=(DefaultListModel<Ucenik>) lstUceniciURazredu.getModel();
//            g.setUcenici(new ArrayList<>());
//            for(int i=0;i<m.getSize();i++){
//                g.getUcenici().add(m.get(i));
//            }
//        } catch (Exception e) {
//           
//        }                
//    }




}
