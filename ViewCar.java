/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarun
 */
public class ViewCar extends javax.swing.JFrame {

    /**
     * Creates new form ViewCar
     */
    public ViewCar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MyTable = new javax.swing.JTable();
        addCompany = new javax.swing.JComboBox<>();
        useAs = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        varient = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 435));
        setPreferredSize(new java.awt.Dimension(1020, 435));
        setSize(new java.awt.Dimension(1020, 435));
        getContentPane().setLayout(null);

        MyTable.setBackground(new java.awt.Color(0, 0, 0));
        MyTable.setForeground(new java.awt.Color(255, 255, 255));
        MyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "carmodel", "comapny", "carnumber", "makeyear", "useas", "sitting", "engine", "type", "varient", "rent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MyTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 980, 280);

        addCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------select-------" }));
        addCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(addCompany);
        addCompany.setBounds(220, 40, 120, 20);

        useAs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------select------", "taxi", "individual rent" }));
        getContentPane().add(useAs);
        useAs.setBounds(220, 80, 110, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(373, 1090, 56, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Car");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 4, 280, 30);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(297, 1093, 34, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Varient");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(424, 44, 50, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("use as");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 80, 50, 20);

        varient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------select--------", "base model", "economic model", "top model" }));
        getContentPane().add(varient);
        varient.setBounds(490, 40, 150, 20);

        jButton1.setText("available car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 80, 140, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select Company");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 40, 120, 20);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\New folder\\back-button.png")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 20, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\New folder\\IMG_420280.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 1050, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompanyActionPerformed
     
        String str=addCompany.getSelectedItem().toString();
        
     if(str.equals("------select-------"))
     {  
         showCar();
     
     }  
        
    }//GEN-LAST:event_addCompanyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        showTable();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new AdminPage().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void showTable(){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn=null;
	Statement stmt=null;
	ResultSet rset=null;
        
        try{
            
            	String companyName =addCompany.getSelectedItem().toString();
                String use= useAs.getSelectedItem().toString();
                String varients= varient.getSelectedItem().toString();
                
                conn = DBConnection.getConnection();
		stmt= conn.createStatement();
                String sql= "select * from service where company ='"+companyName+"'  and use_as='"+use+"' and varient='"+varients+"'";
                rset = stmt.executeQuery(sql);
                
               
                          while(MyTable.getRowCount() > 0) 
        {
            ((DefaultTableModel) MyTable.getModel()).removeRow(0);
        }
        int columns = rset.getMetaData().getColumnCount();
        while(rset.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rset.getObject(i);
            }
            ((DefaultTableModel) MyTable.getModel()).insertRow(rset.getRow()-1,row);
        }

                 
            
 }
    
               catch(Exception e){
            System.err.println(e);
            e.printStackTrace();
        }
        finally{
            try{
                rset.close();
                stmt.close();
                conn.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
            
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
     public void showCar(){
          
         Connection conn= null;
          Statement smt= null;
          ResultSet rst=null;
        
try{
 conn=DBConnection.getConnection();
	    smt=conn.createStatement();
            
            String sql1="select name from company";
            rst=smt.executeQuery(sql1);
            while(rst.next()){
                addCompany.addItem(rst.getString("name"));
                
            }   



}



catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rst!=null)rst.close();
				if(smt!=null)smt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
       
       
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MyTable;
    private javax.swing.JComboBox<String> addCompany;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> useAs;
    private javax.swing.JComboBox<String> varient;
    // End of variables declaration//GEN-END:variables
}
