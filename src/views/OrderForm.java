/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.ItemFormController;
import controller.OrderFormController;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;

/**
 *
 * @author sanu
 */
public class OrderForm extends javax.swing.JFrame {

    DefaultTableModel dtm;

    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        setDate();
        dtm = (DefaultTableModel) tblOrders.getModel();
        loadAllCustomers();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtODate = new javax.swing.JTextField();
        txtOID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbItem = new javax.swing.JComboBox<>();
        txtItemSearch = new javax.swing.JTextField();
        txtItemQtyOnHand = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbCusID = new javax.swing.JComboBox<>();
        txtCusSalary = new javax.swing.JTextField();
        txtCusID = new javax.swing.JTextField();
        txtCusName = new javax.swing.JTextField();
        txtCusAddress = new javax.swing.JTextField();
        txtSearcCusID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnPurhchaseOrder = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtBuyQty = new javax.swing.JTextField();
        btnAddTable = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtODate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, 40));
        jPanel2.add(txtOID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        jLabel1.setText("Order Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel4.setText("Order ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 80));

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 40));
        jPanel3.add(txtItemSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, 40));
        jPanel3.add(txtItemQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 40));
        jPanel3.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 40));
        jPanel3.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 40));
        jPanel3.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 40));

        jLabel11.setText("Select Item");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setText("Search from Code");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel13.setText("Item Code");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel14.setText("Item Name");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel15.setText("Item Qty on Hand");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel16.setText("Item Unit Price");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 340, 230));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCusID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCusIDItemStateChanged(evt);
            }
        });
        jPanel4.add(cmbCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));
        jPanel4.add(txtCusSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, 40));
        jPanel4.add(txtCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 40));

        txtCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 40));
        jPanel4.add(txtCusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 40));

        txtSearcCusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearcCusIDActionPerformed(evt);
            }
        });
        jPanel4.add(txtSearcCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 130, 40));

        jLabel2.setText("Search from ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, -1));

        jLabel6.setText("Select Customer");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setText("Customer ID");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setText("Customer Name");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jLabel9.setText("Customer Address");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setText("Customer Salary");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 350, 230));

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 74, 74));
        jLabel3.setText("Purchase Order Manage");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 40));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Item Name", "Qty", "Unit Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblOrders);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 170));

        btnPurhchaseOrder.setBackground(new java.awt.Color(52, 103, 211));
        btnPurhchaseOrder.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnPurhchaseOrder.setForeground(new java.awt.Color(254, 254, 254));
        btnPurhchaseOrder.setText("Purchase");
        btnPurhchaseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurhchaseOrderActionPerformed(evt);
            }
        });
        jPanel6.add(btnPurhchaseOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 110, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 720, 230));

        jPanel7.setBackground(new java.awt.Color(254, 254, 254));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(txtBuyQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 140, 40));

        btnAddTable.setBackground(new java.awt.Color(218, 35, 50));
        btnAddTable.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnAddTable.setForeground(new java.awt.Color(254, 254, 254));
        btnAddTable.setText("Add Row");
        btnAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableActionPerformed(evt);
            }
        });
        jPanel7.add(btnAddTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));

        jLabel5.setText("Buy Qty");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 340, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNameActionPerformed

    private void txtSearcCusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearcCusIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearcCusIDActionPerformed

    private void btnPurhchaseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurhchaseOrderActionPerformed

        try {
            //        details for orders table
            String orderID = txtOID.getText();
            String orderDate = txtODate.getText();
            String customerID = cmbCusID.getSelectedItem().toString();

            OrderDTO order = new OrderDTO(orderID, orderDate, customerID);

////        details for OrderDetails
//            ArrayList<OrderDetailDTO> allOrderDetails = new ArrayList<>();
            for (int i = 0; i < dtm.getRowCount(); i++) {

                String itemCode = dtm.getValueAt(i, 0).toString();
                int qty = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                double unitPrice = Double.parseDouble(dtm.getValueAt(i, 3).toString());

                OrderDetailDTO orderDetail = new OrderDetailDTO(orderID, itemCode, qty, unitPrice);
                order.getOrderDetails().add(orderDetail);
            }

           
            boolean purchaseOrder = new OrderFormController().purchaseOrder(order);
            if (purchaseOrder) {
                JOptionPane.showMessageDialog(this, "Order Placed");
            } else {
                JOptionPane.showMessageDialog(this, "Eroor");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPurhchaseOrderActionPerformed

    private void cmbCusIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCusIDItemStateChanged
        try {
            String selectedCustomerID = cmbCusID.getSelectedItem().toString();
            CustomerDTO searchCustomer = new OrderFormController().searchCustomer(selectedCustomerID);
            if (searchCustomer != null) {
                txtCusID.setText(searchCustomer.getCustomerID());
                txtCusName.setText(searchCustomer.getCustomerName());
                txtCusAddress.setText(searchCustomer.getCustomerAddress());
                txtCusSalary.setText(searchCustomer.getCustomerSalary()+ "");
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCusIDItemStateChanged

    private void cmbItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemItemStateChanged
        String selectedItem = cmbItem.getSelectedItem().toString();
        try {
            ItemDTO searchItem = new OrderFormController().searchItem(selectedItem);
            if (searchItem != null) {
                txtItemCode.setText(searchItem.getItemCode());
                txtItemName.setText(searchItem.getItemName());
                txtItemQtyOnHand.setText(searchItem.getQty() + "");
                txtUnitPrice.setText(searchItem.getUnitPrice() + "");
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbItemItemStateChanged

    private void btnAddTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTableActionPerformed

//        gather details for the table
        String itemCode = cmbItem.getSelectedItem().toString();
        String itemName = txtItemName.getText();
        int buyQty = Integer.parseInt(txtBuyQty.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        double total = unitPrice * buyQty;

        Object[] row = {itemCode, itemName, buyQty, unitPrice, total};
        dtm.addRow(row);

    }//GEN-LAST:event_btnAddTableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTable;
    private javax.swing.JButton btnPurhchaseOrder;
    private javax.swing.JComboBox<String> cmbCusID;
    private javax.swing.JComboBox<String> cmbItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtBuyQty;
    private javax.swing.JTextField txtCusAddress;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusSalary;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemQtyOnHand;
    private javax.swing.JTextField txtItemSearch;
    private javax.swing.JTextField txtODate;
    private javax.swing.JTextField txtOID;
    private javax.swing.JTextField txtSearcCusID;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        String date = LocalDate.now().toString();
        txtODate.setText(date);
    }

    private void loadAllCustomers() {
        try {
            ArrayList<CustomerDTO> allCustomers = new OrderFormController().getAllCustomers();
            cmbCusID.removeAllItems();
            for (CustomerDTO customer : allCustomers) {
                cmbCusID.addItem(customer.getCustomerID());
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllItems() {
        cmbItem.removeAllItems();
        try {
            ArrayList<ItemDTO> allItems = new ItemFormController().getAllItems();
            for (ItemDTO item : allItems) {
                cmbItem.addItem(item.getItemCode());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
