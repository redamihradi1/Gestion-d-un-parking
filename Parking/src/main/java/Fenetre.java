import classes.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Fenetre extends javax.swing.JFrame {

    ArrayList<Vehicule> Vehicules;
    DefaultListModel modeleListe;
    File fichier ;
    FileWriter fw;
    PrintWriter pw ; 
    
    public Fenetre() {
        initComponents();
        Vehicules = new ArrayList<>();
        modeleListe = new DefaultListModel();
        
        try {
            fichier = new File("Fichier.veh");
            fw = new FileWriter(fichier);
            pw = new PrintWriter(fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        btnAjouter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnEnregistrer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnFermer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFermer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // TODO add your handling code here:
        int choix = JOptionPane.showConfirmDialog(this,"Etes-vous sur de vouloir sortir",
                "Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        if(choix == 0){
          System.exit(0);  
        }
        
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String marque,modele,immatriculation,type;
        int nbrportes,vitessemax,choix=0;
        boolean remorque ; 
        Vehicule vehicule = null ;
        
        type = JOptionPane.showInputDialog(this,"Entrer  le type du vehicule",
                "Type",JOptionPane.PLAIN_MESSAGE);
        
        
        if(type.equalsIgnoreCase("Voiture")){
            marque = JOptionPane.showInputDialog(this,"Entrer  la marque du vehicule",
                "Marque",JOptionPane.PLAIN_MESSAGE);
        modele = JOptionPane.showInputDialog(this,"Entrer  le modele du vehicule",
                "Modele",JOptionPane.PLAIN_MESSAGE);
        immatriculation = JOptionPane.showInputDialog(this,"Entrer  l'immatriculation du vehicule",
                "Immatriculation",JOptionPane.PLAIN_MESSAGE);
            nbrportes = Integer.parseInt(JOptionPane.showInputDialog(this,"Entrer  le nombre de portes de la voitures",
                "Nombre de portes de la voiture",JOptionPane.PLAIN_MESSAGE));
            vehicule = new Voiture(marque, modele, immatriculation, nbrportes);
           
        }
        else if(type.equalsIgnoreCase("Moto")){
            marque = JOptionPane.showInputDialog(this,"Entrer  la marque du vehicule",
                "Marque",JOptionPane.PLAIN_MESSAGE);
        modele = JOptionPane.showInputDialog(this,"Entrer  le modele du vehicule",
                "Modele",JOptionPane.PLAIN_MESSAGE);
        immatriculation = JOptionPane.showInputDialog(this,"Entrer  l'immatriculation du vehicule",
                "Immatriculation",JOptionPane.PLAIN_MESSAGE);
            vitessemax= Integer.parseInt(JOptionPane.showInputDialog(this,"Entrer  la vitesse maximale de la moto",
                "Vitesse maximale de la moto",JOptionPane.PLAIN_MESSAGE));
            vehicule = new Moto(marque, modele, immatriculation, vitessemax);
            
            
        }
        else if(type.equalsIgnoreCase("Camion")){
            marque = JOptionPane.showInputDialog(this,"Entrer  la marque du vehicule",
                "Marque",JOptionPane.PLAIN_MESSAGE);
        modele = JOptionPane.showInputDialog(this,"Entrer  le modele du vehicule",
                "Modele",JOptionPane.PLAIN_MESSAGE);
        immatriculation = JOptionPane.showInputDialog(this,"Entrer  l'immatriculation du vehicule",
                "Immatriculation",JOptionPane.PLAIN_MESSAGE);
            choix = JOptionPane.showConfirmDialog(this, "Le camion a-t-il une remorque","Remorque",JOptionPane.YES_NO_OPTION);
            if(choix == 0){
                remorque = true ; 
            }
            else{ 
            remorque = false ; 
            }
            vehicule = new Camion(marque, modele, immatriculation, remorque);
            
        }
        else {
            JOptionPane.showMessageDialog(this, "Votre choix est incorrect ","Choix incorrect",
                    JOptionPane.OK_OPTION);
        }
        Vehicules.add(vehicule);
        modeleListe.add(modeleListe.getSize(), Vehicules);
        jList1.setModel(modeleListe);
        
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        for(Vehicule v:Vehicules){
            pw.println(v);
        }
        pw.close();
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        if(jList1.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Selectionner un vehicule a supprimer",
                    "Pas de selection",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int indice = jList1.getSelectedIndex();
            modeleListe.remove(indice);
            Vehicules.remove(indice);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        String marque,modele,immatriculation;
        int nbrPortes,remorque,vitesseMax;
        if(jList1.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Selectionner un vehicule a modifier",
                    "Pas de selection",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int indice = jList1.getSelectedIndex();
            Vehicule v = Vehicules.get(indice);
            marque = JOptionPane.showInputDialog(this, "Changer la marque",
                    v.getMarque());
            modele = JOptionPane.showInputDialog(this, "Changer la modele",
                    v.getModele());
            immatriculation = JOptionPane.showInputDialog(this, "Changer l'immatriculation",
                    v.getImmatriculation());
            if(v instanceof Voiture){
                nbrPortes = Integer.valueOf(JOptionPane.showInputDialog(this, "Changer le nombres de portes",
                    ((Voiture) v).getNombrePortes()));
                ((Voiture) v).setNombrePortes(nbrPortes);
            }
            else if(v instanceof Camion){
                remorque = JOptionPane.showConfirmDialog(this, "Le camion a-t-il une remorque","Remorque",JOptionPane.YES_NO_OPTION);
                boolean choix = true;
                if(remorque == JOptionPane.NO_OPTION){
                    choix = false;
                    ((Camion) v).setRemorque(choix);
                }
                else{
                    ((Camion) v).setRemorque(choix);
                }
                
            }
            else if(v instanceof Moto){
                vitesseMax = Integer.valueOf(JOptionPane.showInputDialog(this, "Changer la vitesse maximale",
                    ((Moto) v).getVitesseMax()));
                ((Moto) v).setVitesseMax(vitesseMax);
            }
            else{
                JOptionPane.showMessageDialog(this, "Erreur inconnue","erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
            jList1.setModel(modeleListe);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    
    public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Fenetre f =  new Fenetre();
               f.setVisible(true);
               f.setTitle("Gestion d'un Parking");
               f.setLocationRelativeTo(null);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
