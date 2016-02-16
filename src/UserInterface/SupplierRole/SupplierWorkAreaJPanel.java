package UserInterface.SupplierRole;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    public SupplierWorkAreaJPanel(JPanel userProcessContainer,Supplier supplier ) {
        initComponents();
       this.supplier = supplier;
       this.userProcessContainer = userProcessContainer;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createDrugJButton = new javax.swing.JButton();
        manageDrugJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        createDrugJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        createDrugJButton.setForeground(new java.awt.Color(153, 0, 51));
        createDrugJButton.setText("Create Drug Catalog>>");
        createDrugJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDrugJButtonActionPerformed(evt);
            }
        });

        manageDrugJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        manageDrugJButton.setForeground(new java.awt.Color(153, 0, 51));
        manageDrugJButton.setText("Manage Drug Catalog>>");
        manageDrugJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backJButton.setForeground(new java.awt.Color(153, 0, 0));
        backJButton.setText("<<Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageDrugJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createDrugJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(backJButton)))
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(createDrugJButton)
                .addGap(86, 86, 86)
                .addComponent(manageDrugJButton)
                .addGap(161, 161, 161)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDrugJButtonActionPerformed
        // TODO add your handling code here:
        CreateNewdrugJPanel cnd = new CreateNewdrugJPanel(userProcessContainer, supplier);
        userProcessContainer.add("CreateNewdrugJPanel", cnd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createDrugJButtonActionPerformed

    private void manageDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugJButtonActionPerformed
        // TODO add your handling code here:
        ManageDrugCatalogJPanel md = new ManageDrugCatalogJPanel(userProcessContainer, supplier);
        userProcessContainer.add("ManageDrugCatalogJPanel", md);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDrugJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createDrugJButton;
    private javax.swing.JButton manageDrugJButton;
    // End of variables declaration//GEN-END:variables
}
