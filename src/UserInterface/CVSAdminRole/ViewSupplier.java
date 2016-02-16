package UserInterface.CVSAdminRole;


import Business.Drug;
import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class ViewSupplier extends javax.swing.JPanel {

    private Supplier supplier;
    private JPanel userProcessContainer;
    
    public ViewSupplier(JPanel userProcessContainer,Supplier supplier ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        supplierName.setText(supplier.getSupplierName());
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        model.setRowCount(0);
       for(Drug d : supplier.getDrugCatalog().getDrugList()){
           Object row[] = new Object[10];
           row[0] = d;
           row[1] = d.getDrugId();
           row[2] = d.getPharmaComp();
           row[3] = d.getConcentration();
           row[4] = d.getComposition();
           row[5] = d.getListPrice();
           row[6] = d.getMfgContact(); 
           row[7] = d.getDrugId();
           row[8] = d.getDrugId();
           row[9] = d.getDrugId();
           model.addRow(row);
       }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        supplierName.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        supplierName.setForeground(new java.awt.Color(153, 0, 51));
        supplierName.setText("jLabel1");

        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugName", "Drug Id", "Pharmacy name", "Concentration", "Composition", "List Price", "Mfg Contact", "Mfg Licence", "Mfg Email", "Marketed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalog);

        btnBack.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 51));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(supplierName))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(supplierName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBack)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JLabel supplierName;
    // End of variables declaration//GEN-END:variables
}
