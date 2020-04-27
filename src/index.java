
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class index extends javax.swing.JFrame { //extends jFrame class
	
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

    public index() {
    	//initialize jFrame component
        initComponents();
    }

   
    private void initComponents() {
    	
        jPanel1 = new javax.swing.JPanel(); //initial jPanel
        jLabel1 = new javax.swing.JLabel(); //initial jLabel1
        jButton1 = new javax.swing.JButton(); //initial jButton1
        jScrollPane1 = new javax.swing.JScrollPane(); //initial Scroller for jTabel
        jTable1 = new javax.swing.JTable(); //initial jTable
        jTextField1 = new javax.swing.JTextField(); //initial jTextfield
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window on exit

        jPanel1.setBackground(new java.awt.Color(153, 153, 153)); //setting background color

        jLabel1.setText("Ultra Vision"); //set name of jLabel1

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //initialize layout
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setText("Search Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() { //actionlistener
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt); //call to this function when event occur
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel( //setting rows and column of jTable
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jButton2.setText("Search Title");
        jButton2.addActionListener(new java.awt.event.ActionListener() { //action listner of searchTitle
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Title");
        jButton3.addActionListener(new java.awt.event.ActionListener() { //action listner of addTitle
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add Customer");
        jButton4.addActionListener(new java.awt.event.ActionListener() { //action listner of addcustomer
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        //setting size of jframe and its component
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
    	//calling function searchCustomer
       searchCustomer(); 
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //calling function searchTitle
       searchTitle();
       
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); //close current jFrame
        addmovie ad=new addmovie(); //initialize addmovie class object
        ad.setVisible(true); //display the add addmovie class jFrame
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); //close current jFrame
        addcustomer ac=new addcustomer(); //initialize addcustomer class object
        ac.setVisible(true); //display the add addcustomer class jFrame
    }
    
    private void searchCustomer() {
    	String path="jdbc:mysql://localhost:3306/movierental"; //path of database
        String user="root";
        String password ="";      
        try {
            String c_id;
            String customer= jTextField1.getText(); //getting customer name from textfield1
            Connection conn=DriverManager.getConnection(path,user,password); //making connection to database
            Statement stmt=conn.createStatement();
            ResultSet rs=null;
            PreparedStatement p=null;
            String query ="SELECT * from customers where c_name like '"+customer+"' ";
            p=conn.prepareStatement(query); 
            rs=p.executeQuery(); //execute query
            while (rs.next())
            {                   
            c_id=rs.getString("c_id"); //getting id of customer
            dispose();
            Customer c= new Customer(c_id); //initialize customer object and passing customer id
            c.setVisible(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex); //exception handling
        }
    }
    
    private void searchTitle() {
    	 String path="jdbc:mysql://localhost:3306/movierental"; 
         String user="root";
         String password ="";      
         try {
             String movie= jTextField2.getText(); //getting title name from textfield2
             Connection conn=DriverManager.getConnection(path,user,password);
             Statement stmt=conn.createStatement();
             ResultSet rs=null;
             PreparedStatement p=null;
             String query ="SELECT * from movies where mo_name like '"+movie+"' ";
             p=conn.prepareStatement(query); //preparing query
             rs=p.executeQuery(); //execute query
             jTable1.setModel(DbUtils.resultSetToTableModel(rs)); //display the title detail in table form
             
         } catch (SQLException ex) {
             Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
