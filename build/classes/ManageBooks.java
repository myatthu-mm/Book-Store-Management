
import java.awt.Image;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ManageBooks extends javax.swing.JFrame {
    DefaultTableModel model;
    ResultSet rs;
    Connection conn;
    Statement stmt;
    String sql;
    String imgPath=null;
    private PreparedStatement pstmt;
    

    /**
     * Creates new form ManageBooks
     */
    public ManageBooks() {
        initComponents();
        model=(DefaultTableModel)tbBooks.getModel();
        fetch();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBooks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBookTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        lblPriceError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(731, 552));
        setMinimumSize(new java.awt.Dimension(731, 552));
        setPreferredSize(new java.awt.Dimension(731, 552));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("~Books Management~");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbBooks.setFont(new java.awt.Font("Zawgyi-One", 0, 11)); // NOI18N
        tbBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Author", "Category", "Price($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBooks.setToolTipText("");
        tbBooks.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tbBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBooks);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel4.setText("Book Title:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 40, 60, 20);

        jLabel5.setText("Author:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 80, 50, 20);

        jLabel6.setText("Category:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 120, 60, 20);

        jLabel8.setText("Price:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 160, 40, 20);

        txtBookTitle.setFont(new java.awt.Font("Zawgyi-One", 0, 11)); // NOI18N
        jPanel4.add(txtBookTitle);
        txtBookTitle.setBounds(90, 40, 150, 30);

        txtAuthor.setFont(new java.awt.Font("Zawgyi-One", 0, 11)); // NOI18N
        jPanel4.add(txtAuthor);
        txtAuthor.setBounds(90, 80, 150, 30);

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Art", "Cartoon", "Commercial", "Computer", "Engineering", "Funny", "History", "Languages", "Laws", "Medicine", "Music", "Novel", "Politics", "Sports" }));
        jPanel4.add(cbCategory);
        cbCategory.setBounds(90, 120, 150, 30);

        txtPrice.setText("0.0");
        jPanel4.add(txtPrice);
        txtPrice.setBounds(90, 160, 70, 30);

        lblPriceError.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblPriceError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(lblPriceError);
        lblPriceError.setBounds(160, 160, 110, 30);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setMaximumSize(new java.awt.Dimension(100, 120));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(290, 10, 140, 140);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Choose Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(440, 50, 110, 30);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear);
        btnClear.setBounds(440, 90, 110, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        btnUpdate.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(21, 21, 21))
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(290, 160, 380, 80);

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_key.png"))); // NOI18N
        jLabel7.setText("Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 210, 100, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     JFileChooser file=new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result=file.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=file.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            lblImage.setIcon(ResizeImage(path,null));
            imgPath=path;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(tbBooks.getSelectedRow()>-1){
        int i=tbBooks.getSelectedRow();
        try{
            createDB();
                String selectSql="select * from Book limit "+i+",1 ";
                stmt=conn.createStatement();
                rs=stmt.executeQuery(selectSql);
                rs.next();
                int id=rs.getInt("BookID");
                String delSql="delete from Book where BookID = ?";
                
                pstmt=conn.prepareStatement(delSql);
            pstmt.setInt(1,id);
            
            if(pstmt.executeUpdate()==1){
                JOptionPane.showMessageDialog(this,"Deleted Successfully ");
                clear();
                model.removeRow(i);
                clear();
            }
            else{
                JOptionPane.showMessageDialog(this,"Deleted Failed");
            }
            stmt.close();
            conn.close();
           
                
            } catch (SQLException ex) {
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Select data");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        administration ad=new administration();
        this.dispose();
        ad.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String title=txtBookTitle.getText();
        String author=txtAuthor.getText();
        String category=cbCategory.getSelectedItem().toString();
        double price=0.0;
        try{
        price=Double.parseDouble(txtPrice.getText());
        lblPriceError.setText("");
        }catch(NumberFormatException e){
            lblPriceError.setText("Price values missing!");
        }
        if(imgPath!=null){
            try{
                createDB();
                sql="insert into Book(BookID,BookTitle,Author,Category,Price,Image) values(null,?,?,?,?,?)";
                pstmt=conn.prepareStatement(sql);
                try{
                    InputStream img=new FileInputStream(new File(imgPath));
                    pstmt.setString(1, title);
                    pstmt.setString(2, author);
                    pstmt.setString(3, category);
                   
                    pstmt.setDouble(4, price);         
                    pstmt.setBlob(5, img);

                    if(pstmt.executeUpdate()==1){
                        JOptionPane.showMessageDialog(rootPane,"One Record add successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                        clear();
                        model.setRowCount(0);
                        fetch();
                    }
                    pstmt.close();
                    conn.close();
                }catch(FileNotFoundException ex){
                    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null ,ex);

                }
               
            }
            catch(SQLException e1){
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null ,e1);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Image not Found!");
        }
        imgPath=null;

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
            int i=tbBooks.getSelectedRow();
            String btitle=txtBookTitle.getText();
            String bAuthor=txtAuthor.getText();
            String bCategory=cbCategory.getSelectedItem().toString();
            double bPrice=Double.parseDouble(txtPrice.getText());
            try{
                createDB();
                String selectSql="select * from Book limit "+i+",1";
                stmt=conn.createStatement();
                rs=stmt.executeQuery(selectSql);
                rs.next();
                int id=rs.getInt("BookID");
                System.out.println("BookID Test"+id);
                
                if(imgPath==null){
                    
                    sql="update Book set BookTitle=?,Author=?,Category=?,Price=? where BookID=?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1, btitle);
                pstmt.setString(2, bAuthor);
                pstmt.setString(3, bCategory);
                pstmt.setDouble(4, bPrice);
                pstmt.setInt(5,id);
                
                }
                else{
                    InputStream img=new FileInputStream(imgPath);
                    sql="update Book set BookTitle=?,Author=?,Category=?,Price=?,Image=? where BookID=?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1, btitle);
                pstmt.setString(2, bAuthor);
                pstmt.setString(3, bCategory);
                pstmt.setDouble(4, bPrice);
                pstmt.setBlob(5, img);
                pstmt.setInt(6, id);
                    
                }
            }catch(FileNotFoundException ex){
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE,null,ex);
            } catch (SQLException ex) {
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            if(pstmt.executeUpdate()==1){
                JOptionPane.showMessageDialog(rootPane,"Update Complete ***","UPDATE",JOptionPane.NO_OPTION);
                model.setRowCount(0);
                clear();
                fetch();
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Update Error !!!","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBooksMouseClicked
        // TODO add your handling code here:
        int i=tbBooks.getSelectedRow();
            
            txtBookTitle.setText(model.getValueAt(i, 0).toString());
            txtAuthor.setText(model.getValueAt(i, 1).toString());
            cbCategory.setSelectedItem((Object)model.getValueAt(i,2));
            txtPrice.setText(model.getValueAt(i, 3).toString());
            try{
            createDB();            
            sql="select * from Book limit "+i+",1";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            
                 if(rs.next()){
                     lblImage.setIcon(ResizeImage(null,rs.getBytes("Image")));
                 }
                 else{
                     JOptionPane.showMessageDialog(this, "Image not Found");
                 }
                   stmt.close();
                   conn.close();
               
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        
    }//GEN-LAST:event_tbBooksMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
        
    }//GEN-LAST:event_btnClearActionPerformed
    public void clear(){
        txtBookTitle.setText("");
        txtAuthor.setText("");
        cbCategory.setSelectedIndex(0);
        txtPrice.setText("");
        lblImage.setIcon(null);
        tbBooks.clearSelection();
        lblPriceError.setText("");
    }
    public void fetch(){
        try{
            createDB();
            stmt=conn.createStatement();
            sql="select * from Book";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                 Object[] column=new Object[5];
                 
                 column[0]=rs.getString("BookTitle");
                 column[1]=rs.getString("Author");
                 column[2]=rs.getString("Category");
                 column[3]=rs.getString("Price");
                 model.addRow(column);
               /* String id=rs.getString("BookID");
                String title=rs.getString("BookTitle");
                String author=rs.getString("Author");
                String category=rs.getString("Category");
                String price=rs.getString("Price");
                addTableData (id,title,author,category,price);*/
            }
            stmt.close();
            conn.close();
        }catch(SQLException e){
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public ImageIcon ResizeImage(String ImagePath,byte[] pic){
        ImageIcon MyImage=null;
        if(ImagePath!=null){
            MyImage=new ImageIcon(ImagePath);
        }
        else{
            MyImage=new ImageIcon(pic);
        }
        Image img=MyImage.getImage();
        Image newImg=img.getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
        return image;
    }
   /* private void addTableData(String id,String title,String author,String category,String price){
        Object[] column=new Object[5];
        column[0]=id;
        column[1]=title;
        column[2]=author;
        column[3]=category;
        column[4]=price;
        model.addRow(column);
    }*/
    void createDB(){
        try{
            conn=DriverManager.getConnection("jdbc:ucanaccess://bookshop.accdb","","");
            System.out.println("Connection Active!");
        }catch(Exception e){
            System.out.println("DB Error!");
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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPriceError;
    private javax.swing.JTable tbBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}