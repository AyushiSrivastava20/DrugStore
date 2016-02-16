package UserInterface.SupplierRole;

import Business.Drug;

import Business.Supplier;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class CreateNewdrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;

    public CreateNewdrugJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer;

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mktdByJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        createJButton = new javax.swing.JButton();
        backCDJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        drugNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pharmaJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        concentrationJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        compositionJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contactJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        licenceJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        availJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        mktdByJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        mktdByJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mktdByJTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel11.setText("Marketed By");

        createJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        createJButton.setForeground(new java.awt.Color(153, 0, 0));
        createJButton.setText("Create");
        createJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        backCDJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backCDJButton.setForeground(new java.awt.Color(153, 0, 0));
        backCDJButton.setText("<< Back");
        backCDJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backCDJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCDJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Create Drug Details");

        drugNameJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        drugNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel2.setText("Drug Name");

        pharmaJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel4.setText("Pharma Company");

        concentrationJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        concentrationJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concentrationJTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setText("Concentration");

        compositionJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        compositionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionJTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel6.setText("Composition");

        priceJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel7.setText("List Price");

        contactJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel8.setText("Mfg. Contact ");

        licenceJTextField.setBackground(java.awt.SystemColor.controlHighlight);
        licenceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenceJTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel9.setText("Mfg. Licence");

        emailJTextField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel10.setText("Mfg. Email");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Availability");

        availJTextField.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(302, 302, 302))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(backCDJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(30, 30, 30))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drugNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(pharmaJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(concentrationJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(compositionJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(priceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(contactJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(licenceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(emailJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(mktdByJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(availJTextField))
                        .addGap(216, 216, 216))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drugNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backCDJButton)
                    .addComponent(createJButton))
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mktdByJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mktdByJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mktdByJTextFieldActionPerformed

    private void concentrationJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concentrationJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concentrationJTextFieldActionPerformed

    private void compositionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compositionJTextFieldActionPerformed

    private void licenceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenceJTextFieldActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        try{
            
            Drug drug = supplier.getDrugCatalog().addDrug();
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
            JOptionPane.showMessageDialog(null, "Drug has been successfully created");
            resetFields();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter appropriate values in the fields!");
       }
 
    }//GEN-LAST:event_createJButtonActionPerformed

    public void resetFields(){
        drugNameJTextField.setText("");
        pharmaJTextField.setText("");
        compositionJTextField.setText("");
        concentrationJTextField.setText("");
        priceJTextField.setText("");
        contactJTextField.setText("");
        emailJTextField.setText("");
        mktdByJTextField.setText("");
        licenceJTextField.setText("");
        availJTextField.setText("");
  
    }
    private void drugNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameJTextFieldActionPerformed

    private void backCDJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCDJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backCDJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availJTextField;
    private javax.swing.JButton backCDJButton;
    private javax.swing.JTextField compositionJTextField;
    private javax.swing.JTextField concentrationJTextField;
    private javax.swing.JTextField contactJTextField;
    private javax.swing.JButton createJButton;
    private javax.swing.JTextField drugNameJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    // End of variables declaration//GEN-END:variables
}
