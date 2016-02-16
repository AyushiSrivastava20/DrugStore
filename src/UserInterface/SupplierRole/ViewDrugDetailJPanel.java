package UserInterface.SupplierRole;

import Business.Drug;
import UserInterface.CVSAdminRole.ManageStoreCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class ViewDrugDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Drug drug;

    public ViewDrugDetailJPanel(JPanel userProcessContainer, Drug drug) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.drug = drug;
        populateDrug();
        idJTextField.setEnabled(false);
    }

    public void populateDrug() {
        drugNameJTextField.setText(drug.getDrugName());
        idJTextField.setText(String.valueOf(drug.getDrugId()));
        pharmaJTextField.setText(drug.getPharmaComp());
        concentrationJTextField.setText(drug.getConcentration());
        compositionJTextField.setText(drug.getComposition());
        priceJTextField.setText(drug.getListPrice());
        contactJTextField.setText(drug.getMfgContact());
        licenceJTextField.setText(drug.getMfglic());
        emailJTextField.setText(drug.getMfgEmail());
        mktdByJTextField.setText(drug.getMrktBy());
        availJTextField.setText(String.valueOf(drug.getAvail()));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mktdByJTextField = new javax.swing.JTextField();
        compositionJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        drugNameJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        contactJTextField = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        idJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        licenceJTextField = new javax.swing.JTextField();
        pharmaJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        concentrationJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        availJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        mktdByJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        mktdByJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mktdByJTextFieldActionPerformed(evt);
            }
        });

        compositionJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        compositionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionJTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel2.setText("Drug Name");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel8.setText("Mfg. Contact ");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Serial ID");

        priceJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        save.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        save.setForeground(new java.awt.Color(153, 0, 0));
        save.setText("Save");
        save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        drugNameJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel9.setText("Mfg. Licence");

        update.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        update.setForeground(new java.awt.Color(153, 0, 0));
        update.setText("Update");
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel4.setText("Pharma Company");

        contactJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        back.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 0));
        back.setText("<<Back");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        idJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel10.setText("Mfg. Email");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setText("Concentration");

        licenceJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        licenceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenceJTextFieldActionPerformed(evt);
            }
        });

        pharmaJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel11.setText("Marketed By");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel6.setText("Composition");

        emailJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        concentrationJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        concentrationJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concentrationJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("View Drug Details");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel7.setText("List Price");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel12.setText("Availability");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drugNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(idJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(pharmaJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(concentrationJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(compositionJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(priceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(contactJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(licenceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(emailJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(mktdByJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(availJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drugNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pharmaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(concentrationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(compositionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contactJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(licenceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mktdByJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(availJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(back))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mktdByJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mktdByJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mktdByJTextFieldActionPerformed

    private void compositionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compositionJTextFieldActionPerformed

    private void licenceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenceJTextFieldActionPerformed

    private void concentrationJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concentrationJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concentrationJTextFieldActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try {
            drug.setDrugName(drugNameJTextField.getText());
            drug.setPharmaComp(pharmaJTextField.getText());
            drug.setComposition(compositionJTextField.getText());
            drug.setConcentration(concentrationJTextField.getText());
            drug.setListPrice(priceJTextField.getText());
            drug.setMfgContact(contactJTextField.getText());
            drug.setMfgEmail(emailJTextField.getText());
            drug.setMrktBy(mktdByJTextField.getText());
            drug.setMfglic(licenceJTextField.getText());
            drug.setAvail(Integer.parseInt(availJTextField.getText()));
            JOptionPane.showMessageDialog(null, "Drug has been successfully updated");
            save.setEnabled(false);
            update.setEnabled(true);
            drugNameJTextField.setEnabled(false);
            pharmaJTextField.setEnabled(false);
            compositionJTextField.setEnabled(false);
            concentrationJTextField.setEnabled(false);
            priceJTextField.setEnabled(false);
            contactJTextField.setEnabled(false);
            emailJTextField.setEnabled(false);
            mktdByJTextField.setEnabled(false);
            licenceJTextField.setEnabled(false);
            availJTextField.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter appropriate values in the fields!");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        drugNameJTextField.setEnabled(true);
        pharmaJTextField.setEnabled(true);
        compositionJTextField.setEnabled(true);
        concentrationJTextField.setEnabled(true);
        priceJTextField.setEnabled(true);
        contactJTextField.setEnabled(true);
        emailJTextField.setEnabled(true);
        mktdByJTextField.setEnabled(true);
        licenceJTextField.setEnabled(true);
        availJTextField.setEnabled(true);
        save.setEnabled(true);
        update.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length -1];
        ManageDrugCatalogJPanel mds = (ManageDrugCatalogJPanel) component;
        mds.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availJTextField;
    private javax.swing.JButton back;
    private javax.swing.JTextField compositionJTextField;
    private javax.swing.JTextField concentrationJTextField;
    private javax.swing.JTextField contactJTextField;
    private javax.swing.JTextField drugNameJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licenceJTextField;
    private javax.swing.JTextField mktdByJTextField;
    private javax.swing.JTextField pharmaJTextField;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
