/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author tarun
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
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

        jTextField6 = new javax.swing.JTextField();
        empM = new javax.swing.JRadioButton();
        empF = new javax.swing.JRadioButton();
        employeeName = new javax.swing.JTextField();
        empDoj = new javax.swing.JTextField();
        employeeId = new javax.swing.JTextField();
        empNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeAdd = new javax.swing.JTextArea();
        employeeDob = new javax.swing.JTextField();
        empQuali = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        empPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        empGen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        empM.setForeground(new java.awt.Color(255, 255, 255));
        empM.setText("male");

        empF.setForeground(new java.awt.Color(255, 255, 255));
        empF.setText("Female");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(880, 550));
        getContentPane().setLayout(null);
        getContentPane().add(employeeName);
        employeeName.setBounds(150, 60, 240, 30);

        empDoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDojActionPerformed(evt);
            }
        });
        getContentPane().add(empDoj);
        empDoj.setBounds(620, 240, 200, 30);
        getContentPane().add(employeeId);
        employeeId.setBounds(620, 120, 200, 30);
        getContentPane().add(empNo);
        empNo.setBounds(620, 60, 200, 30);

        employeeAdd.setColumns(20);
        employeeAdd.setRows(5);
        jScrollPane1.setViewportView(employeeAdd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 180, 240, 120);
        getContentPane().add(employeeDob);
        employeeDob.setBounds(150, 330, 240, 30);

        empQuali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Graduate", "10+2", "Matrix" }));
        getContentPane().add(empQuali);
        empQuali.setBounds(150, 410, 130, 30);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 20, 34, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qualification");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 410, 80, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 60, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone no");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 60, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 180, 70, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOJ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 240, 34, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 120, 70, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 120, 50, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 180, 60, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DOB");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 330, 28, 17);
        getContentPane().add(empPass);
        empPass.setBounds(620, 180, 200, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\New folder\\1327063447.png")); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 370, 160, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 370, 150, 50);

        empGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Male", "Female", "Other" }));
        getContentPane().add(empGen);
        empGen.setBounds(156, 120, 100, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\New folder\\hd-dark-wallpapers-4.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 886, 562);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminPage a= new AdminPage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empDojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empDojActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                Connection conn=null;
		Statement stmt=null;
		ResultSet rset=null;
                
                try{
                    
                    String emp_id=employeeId.getText().trim();
			String emp_name=employeeName.getText().trim();
			String gender=empGen.getSelectedItem().toString();
			String emp_no=empNo.getText().trim();
			String emp_pass=empPass.getText().trim();
			String qualification=empQuali.getSelectedItem().toString();
			String emp_doj=empDoj.getText().trim();
			String emp_dob=employeeDob.getText().trim();
			String add=employeeAdd.getText().trim();
			if(emp_id.equals("")){
				JOptionPane.showMessageDialog(this,"Fill user name");
				employeeId.requestFocus();
				return;
			}else if(emp_name.equals("")){
				JOptionPane.showMessageDialog(this,"Fill Name");
				employeeName.requestFocus();
				return;
			}else if(emp_no.equals("")){
				JOptionPane.showMessageDialog(this,"Fill ContactNo");
				empNo.requestFocus();
				return;
			}else if(emp_pass.equals("")){
				JOptionPane.showMessageDialog(this,"Fill password");
				empPass.requestFocus();
				return;
			}else if(qualification.equals("")){
			   	JOptionPane.showMessageDialog(this,"Fill Qualification");
			   	empQuali.requestFocus();
			   	return;
			}else if(emp_doj.equals("")){
				JOptionPane.showMessageDialog(this,"Fill doj");
				empDoj.requestFocus();
				return;
			}else if(emp_dob.equals("")){
				JOptionPane.showMessageDialog(this,"Fill dob");
				employeeDob.requestFocus();
				return;
			}else if(add.equals("")){
				JOptionPane.showMessageDialog(this,"Fill Address");
				employeeAdd.requestFocus();
                                return;
                        }
                    
                    
                    
                    
                    
                    if(!exist(emp_id)){
                        
                      	conn=DBConnection.getConnection();
		        stmt=conn.createStatement();
                        String sql="insert into addemployee(name,gender,address,DOB,qualification,phone_no,user_name,DOJ,password) values("+
				 "'"+emp_name+"','"+gender+"','"+add+"','"+emp_dob+"','"+qualification+"','"+emp_no+"','"+emp_id+"','"+emp_doj+"','"+emp_pass+"')";
			int rowAffected = stmt.executeUpdate(sql);
                         if(rowAffected>0){
                             JOptionPane.showMessageDialog(this,"employee added successfully");
                             setAllBlanke();
                             
                         }
                         else
                             JOptionPane.showMessageDialog(this,"some problem in data");
                 }
                    
                    else{
                        JOptionPane.showMessageDialog(this,"employee already registered");
                    }
                }
                    	catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
    }
    
     public void setAllBlanke(){
        
        	employeeId.setText("");
		employeeName.setText("");
		empGen.setSelectedItem("select");
		empNo.setText("");
		employeeDob.setText("");
		empQuali.setSelectedItem("select");
		empDoj.setText("");
		empPass.setText("");
		employeeAdd.setText("");
        
        
        
        
    }
    
    
    
    
 	public boolean exist(String empId){
		Connection conn=null;
		Statement stmt=null;
		ResultSet rset=null;
		boolean flag=false;
		try{
			conn=DBConnection.getConnection();
			stmt=conn.createStatement();
			String sql="select name from addemployee where user_name='"+empId+"'";
		   	rset =	stmt.executeQuery(sql);
		   	if(rset.next()){
		   		flag=true;
		   	}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rset!=null)rset.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return flag;
	
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
                
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empDoj;
    private javax.swing.JRadioButton empF;
    private javax.swing.JComboBox<String> empGen;
    private javax.swing.JRadioButton empM;
    private javax.swing.JTextField empNo;
    private javax.swing.JPasswordField empPass;
    private javax.swing.JComboBox<String> empQuali;
    private javax.swing.JTextArea employeeAdd;
    private javax.swing.JTextField employeeDob;
    private javax.swing.JTextField employeeId;
    private javax.swing.JTextField employeeName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}