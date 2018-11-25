
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 99
 */

public class CustomerLogin extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    Statement stmt;
    //String loginEmail;
    /**
     * Creates new form Login
     */
    public CustomerLogin() {
        initComponents();
        passerror.setVisible(false);
        mailerror.setVisible(false);
        txtEmail.setText("example@gmail.com");
        txtEmail.setForeground(Color.gray);
        bg.setFocusable(true);
        
        
    }
    private boolean formatCheck(String email){
        String emailCheck="^[a-zA-Z0-9_.]+@[a-zA-Z]+.[a-zA-Z]+$";
        boolean error = false;
        if(email.matches(emailCheck))
           mailerror.setVisible(false);
           
        else{
            //txtEmail.setForeground(Color.red);
            //txtEmail.setText("Email format incorrect");
             mailerror.setVisible(true);
       
            error=true;
        }
        return error;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mailerror = new javax.swing.JLabel();
        passerror = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(415, 335));
        setMinimumSize(new java.awt.Dimension(415, 335));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("ONLINE Book Center");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 390, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Welcome Customer ,");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 80, 170, 17);

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 0, 0));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(160, 210, 80, 23);

        Register.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 0, 255));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register);
        Register.setBounds(130, 240, 90, 23);

        Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 255, 0));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(80, 210, 80, 23);

        txtPassword.setEchoChar('#');
        jPanel1.add(txtPassword);
        txtPassword.setBounds(80, 160, 160, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(80, 110, 160, 30);

        jLabel5.setText("Register Here >>>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 110, 20);

        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 60, 20);

        jLabel1.setText("Email:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 110, 40, 20);

        mailerror.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        mailerror.setForeground(new java.awt.Color(255, 0, 0));
        mailerror.setText("Email Format incorrect");
        jPanel1.add(mailerror);
        mailerror.setBounds(80, 140, 160, 20);

        passerror.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        passerror.setForeground(new java.awt.Color(255, 0, 0));
        passerror.setText("Password Format incorrect");
        jPanel1.add(passerror);
        passerror.setBounds(80, 190, 160, 20);

        jLabel4.setText("Are you Admin? >>>");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 270, 120, 14);

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGo);
        btnGo.setBounds(130, 270, 90, 23);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
   
        /*project pj=new project();
        this.dispose();
        pj.setVisible(true);*/
        
        createDB();
        String email=txtEmail.getText();
        String password=new String(txtPassword.getPassword());
        
        if(password.length()>7){
            passerror.setVisible(false);
        }else{
            passerror.setVisible(true);
        }
        
        if(!formatCheck(email))
           
            System.out.println("format correct!");
        
        try{
            String sql="select * from Member";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            boolean found=false;
            while(rs.next()){
                if(rs.getString("Email").equals(email)){
                    System.out.println("pass");
                    if(rs.getString("Password").equals(password)){
                        found=true;
                        break;
                    }
                     passerror.setText("Wrong Password");
                    passerror.setVisible(true);
                   
                     System.out.println("wrong error");   
                    
                }
            }
            if(found){
                JOptionPane.showMessageDialog(rootPane,"Login Completed! WELCOME!","Success",Login.TOP);
                //JOptionPane.showMessageDialog(rootPane,"found","found",3);
                String session_email=email;
                mainproject pj=new mainproject(session_email);
                this.dispose();
                pj.setVisible(true);
                
                
                
            }
            else{
                System.out.println("fail");
                JOptionPane.showMessageDialog(rootPane,"Login Failed, User Name and Password doesn't match!,Try Again","Error",0);
                //txtPassword.setBorder(BorderFactory.createLineBorder(Color.red, 1));
//               if(rs.getString("Email")==email){
//                   System.out.println("pass!!");
//               }else{
//                   mailerror.setVisible(true);
//               }
//               if(rs.getString("Password")==password){
//                   System.out.println("pass$$$");
//               }else{
//                   passerror.setVisible(true);
//               }
             
                
            }
            stmt.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_LoginActionPerformed

    void createDB(){
    try{
       //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:ucanaccess://bookshop.accdb","","");
        System.out.println("Connection Active!");
            
    }
    catch(Exception e){
        System.out.println("Create DB Error!");
    }
    }
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
    Register rg=new Register();
    this.dispose();
    rg.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        //txtEmail.setBorder(BorderFactory.createXPStyle$XPFillBorder());
        txtEmail.setText("");
        txtEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().length()<1){
            txtEmail.setText("example@gmail.com");
        txtEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        txtEmail.setText("");
        txtPassword.setText("");
        mailerror.setText("");
        passerror.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        AdminLogin al=new AdminLogin();
        this.dispose();
        al.setVisible(true);
        
    }//GEN-LAST:event_btnGoActionPerformed
    
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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mailerror;
    private javax.swing.JLabel passerror;
    protected javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

   
}