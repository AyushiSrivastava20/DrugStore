/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CVSAdminRole;

import Business.StoreCatalog;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class AdminAreaWorkPlace extends javax.swing.JPanel {

    /**
     * Creates new form AdminAreaWorkPlace
     */
    
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private StoreCatalog storeCatalog;
    
    public AdminAreaWorkPlace(JPanel userProcessContainer,SupplierDirectory supplierDirectory,StoreCatalog storeCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.storeCatalog = storeCatalog;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageSupplierJButton = new javax.swing.JButton();
        browseInventoryJButton = new javax.swing.JButton();
        manageStoreJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        manageSupplierJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageSupplierJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        manageSupplierJButton.setForeground(new java.awt.Color(153, 0, 51));
        manageSupplierJButton.setText("Manage Supplier(s)>>");
        manageSupplierJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSupplierJButtonActionPerformed(evt);
            }
        });

        browseInventoryJButton.setBackground(new java.awt.Color(255, 255, 255));
        browseInventoryJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        browseInventoryJButton.setForeground(new java.awt.Color(153, 0, 51));
        browseInventoryJButton.setText("Browse Inventory>>");
        browseInventoryJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        browseInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseInventoryJButtonActionPerformed(evt);
            }
        });

        manageStoreJButton1.setBackground(new java.awt.Color(255, 255, 255));
        manageStoreJButton1.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        manageStoreJButton1.setForeground(new java.awt.Color(153, 0, 51));
        manageStoreJButton1.setText("Manage CVS Store(s)>>");
        manageStoreJButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageStoreJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manageSupplierJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(browseInventoryJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageStoreJButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(manageSupplierJButton)
                .addGap(80, 80, 80)
                .addComponent(manageStoreJButton1)
                .addGap(92, 92, 92)
                .addComponent(browseInventoryJButton)
                .addGap(198, 198, 198))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSupplierJButtonActionPerformed
        // TODO add your handling code here:
    ManageSuppliers ms = new ManageSuppliers(userProcessContainer, supplierDirectory);
    userProcessContainer.add("ManageSuppliers", ms);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_manageSupplierJButtonActionPerformed

    private void manageStoreJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreJButton1ActionPerformed
        // TODO add your handling code here:
    ManageStore mss = new ManageStore(userProcessContainer, storeCatalog);
    userProcessContainer.add("ManageStore", mss);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageStoreJButton1ActionPerformed

    private void browseInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseInventoryJButtonActionPerformed
        // TODO add your handling code here:
    browseInventory bi = new browseInventory(userProcessContainer,storeCatalog);
    userProcessContainer.add("browseInventory", bi);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_browseInventoryJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseInventoryJButton;
    private javax.swing.JButton manageStoreJButton1;
    private javax.swing.JButton manageSupplierJButton;
    // End of variables declaration//GEN-END:variables
}
