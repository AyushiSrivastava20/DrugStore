/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CVSAdminRole;

import Business.StoreCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class ManageStore extends javax.swing.JPanel {

    /**
     * Creates new form ManageStore
     */
    private JPanel userProcessContainer;
    private StoreCatalog storeCatalog;
    
    public ManageStore(JPanel userProcessContainer,StoreCatalog storeCatalog) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.storeCatalog= storeCatalog;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageStoreJButton = new javax.swing.JButton();
        backCSMJButton = new javax.swing.JButton();
        createStoreJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        manageStoreJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        manageStoreJButton.setForeground(new java.awt.Color(153, 0, 0));
        manageStoreJButton.setText("Manage Store(s) >>");
        manageStoreJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreJButtonActionPerformed(evt);
            }
        });

        backCSMJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backCSMJButton.setForeground(new java.awt.Color(153, 0, 0));
        backCSMJButton.setText("<< Back");
        backCSMJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backCSMJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCSMJButtonActionPerformed(evt);
            }
        });

        createStoreJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        createStoreJButton.setForeground(new java.awt.Color(153, 0, 0));
        createStoreJButton.setText("Create Store(s) >>");
        createStoreJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStoreJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(backCSMJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageStoreJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(createStoreJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(createStoreJButton)
                .addGap(72, 72, 72)
                .addComponent(manageStoreJButton)
                .addGap(126, 126, 126)
                .addComponent(backCSMJButton)
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStoreJButtonActionPerformed
        // TODO add your handling code here:
    CreateStore cs = new CreateStore(userProcessContainer, storeCatalog);
    userProcessContainer.add("CreateStore", cs);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_createStoreJButtonActionPerformed

    private void manageStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreJButtonActionPerformed
        // TODO add your handling code here:
    ManageStoreCatalog mcs = new ManageStoreCatalog(userProcessContainer, storeCatalog);
    userProcessContainer.add("ManageStoreCatalog", mcs);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer); 
    }//GEN-LAST:event_manageStoreJButtonActionPerformed

    private void backCSMJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCSMJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backCSMJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backCSMJButton;
    private javax.swing.JButton createStoreJButton;
    private javax.swing.JButton manageStoreJButton;
    // End of variables declaration//GEN-END:variables
}