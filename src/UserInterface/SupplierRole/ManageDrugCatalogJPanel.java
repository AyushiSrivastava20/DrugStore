package UserInterface.SupplierRole;


import Business.Drug;
import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class ManageDrugCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugCatalogJPanel
     */
    private JPanel userProcessContainer;
    private Supplier supplier;

    public ManageDrugCatalogJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer;
        populateTable();   
    }
public void populateTable(){
    DefaultTableModel model = (DefaultTableModel)drugJTable.getModel();
    model.setRowCount(0);
    for(Drug d : supplier.getDrugCatalog().getDrugList()){
        Object row[] = new Object[5];
        row[0] = d;
        row[1] = d.getDrugId();
        row[2] = d.getComposition();
        row[3] = d.getPharmaComp();
        row[4] = d.getAvail();
        model.addRow(row);
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugJTable = new javax.swing.JTable();
        viewDrugJButton = new javax.swing.JButton();
        deleteDrugJButton = new javax.swing.JButton();
        searchDrug = new javax.swing.JButton();
        backMD = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        searchJTextField.setBackground(new java.awt.Color(240, 240, 240));
        searchJTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Manage Drug Catalog");

        drugJTable.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        drugJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Id", "Concentration", "Pharma Company", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugJTable);

        viewDrugJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        viewDrugJButton.setForeground(new java.awt.Color(153, 0, 0));
        viewDrugJButton.setText("View Drug Details >>");
        viewDrugJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugJButtonActionPerformed(evt);
            }
        });

        deleteDrugJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        deleteDrugJButton.setForeground(new java.awt.Color(153, 0, 0));
        deleteDrugJButton.setText("Delete Drug >>");
        deleteDrugJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDrugJButtonActionPerformed(evt);
            }
        });

        searchDrug.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        searchDrug.setForeground(new java.awt.Color(153, 0, 0));
        searchDrug.setText("Search >>");
        searchDrug.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDrugActionPerformed(evt);
            }
        });

        backMD.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backMD.setForeground(new java.awt.Color(153, 0, 0));
        backMD.setText("<<Back");
        backMD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(searchDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDrugJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(deleteDrugJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backMD, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewDrugJButton)
                            .addComponent(deleteDrugJButton))
                        .addGap(34, 34, 34)
                        .addComponent(searchDrug))
                    .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(backMD)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDrugJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRowCount();
        if(selectedRow>0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"WOULD YOU LIKE TO DELETE THE drug?","Warning", dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Drug d = (Drug)drugJTable.getValueAt(selectedRow,0);
                supplier.getDrugCatalog().removeDrug(d);
                populateTable();
                
            }
        
        }else{
            
            JOptionPane.showMessageDialog(null,"Please Select a row from the table first","WARNING", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_deleteDrugJButtonActionPerformed

    private void viewDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRow();
        
        if(selectedRow>=0){
            Drug d = (Drug)drugJTable.getValueAt(selectedRow,0);
            ViewDrugDetailJPanel vd = new ViewDrugDetailJPanel(userProcessContainer,d);
            userProcessContainer.add("ViewStore", vd);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
    }                                                

        else{
             JOptionPane.showMessageDialog(null,"Please Select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewDrugJButtonActionPerformed

    private void backMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMDActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backMDActionPerformed

    private void searchDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDrugActionPerformed
        // TODO add your handling code here:
        
        String id = searchJTextField.getText();
        Drug d = supplier.getDrugCatalog().searchDrug(id);
        if(d==null){
            JOptionPane.showMessageDialog(null,"Please enter a proper Name");
            return;
        }
            ViewDrugDetailJPanel vd = new ViewDrugDetailJPanel(userProcessContainer,d);
            userProcessContainer.add("ViewStore", vd);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_searchDrugActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMD;
    private javax.swing.JButton deleteDrugJButton;
    private javax.swing.JTable drugJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchDrug;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton viewDrugJButton;
    // End of variables declaration//GEN-END:variables
}
