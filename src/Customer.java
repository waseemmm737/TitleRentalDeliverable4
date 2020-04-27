
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Customer extends javax.swing.JFrame {

    
    private static String id; //initialize parameter
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    
    public Customer(String id) { //constuctor  && value of id comes from method searchCustomer of index class 
        initComponents();
        this.id=id;
        jLabel3.setText(id);  //set value of id to jLabel3
        jLabel5.setVisible(false);  //hide all component that set with false value
        jTextField1.setVisible(false);
        jButton3.setVisible(false);
        
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jButton5.setVisible(false);
        
        jLabel11.setVisible(false);
        jTextField4.setVisible(false);
        jButton7.setVisible(false);
        
        jButton6.setVisible(false);
        
        String path="jdbc:mysql://localhost:3306/movierental";
            String user="root";
            String password ="";      
            try {              
                String mp;
                String cuid=jLabel3.getText();
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT * from customers where c_id = '"+cuid+"'";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                while (rs.next())
                { 
                  jLabel6.setText(rs.getString("c_name")); //display customer name on customer dashboard
                }
                String query1 ="SELECT * from loyality where cus_id = '"+cuid+"'";
                p=conn.prepareStatement(query1);
                rs=p.executeQuery();
                while (rs.next())
                { 
                  jLabel8.setText(rs.getString("l_point")); //display loyalty point of that customer
                  
                  String point=rs.getString("l_point");
                  int pp=Integer.parseInt(point);
                  if(pp>=100){
                      jButton6.setVisible(true); //display the free rental title option if loyalty point greater then or equals 100
                  }
                  
                }
                
            }
            catch (SQLException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }

   
    private void initComponents() {

    	//initialize all components
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Ultra Vision");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Customer Dashboard");

        jButton2.setText("Rent Title");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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

        jLabel5.setText("Enter mo_id to rent");

        jButton3.setText("Rent");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Loyality Points");

        jLabel8.setText("jLabel8");

        jButton4.setText("Rental Title");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Enter r_id to return");

        jLabel10.setText("Enter mo_id to return");

        jButton5.setText("Return");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Get Free Rental Movie");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter mo_id to get free rental movie");

        jButton7.setText("Rent");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Update Subscrition Plan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(349, 349, 349)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(jTextField1))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(27, 27, 27)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jButton5))
                                .addGap(48, 48, 48)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)
                        .addComponent(jButton6)
                        .addComponent(jButton8))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton7))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(0, 146, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        index i=new index();
        i.setVisible(true); //redirect to index class by pressing back button 
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	rentTitle();  //calling function by pressing rent Title button
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {       
        makeRent(); //calling function by pressing rent button
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    	displayRentedTitle(); //function call
    	
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        
        returnTitle(); 
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String path="jdbc:mysql://localhost:3306/movierental";
            String user="root";
            String password ="";      
            try {
                jLabel5.setVisible(false);
        jTextField1.setVisible(false);
        jButton3.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jButton5.setVisible(false);
        jLabel11.setVisible(true);
        jTextField4.setVisible(true);
        jButton7.setVisible(true);
                String mp;
                String cid=jLabel3.getText();
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT * from customers,membership where c_id = '"+cid+"' && customers.c_id=membership.cu_id";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                while (rs.next())
                { 
                  mp = rs.getString("m_type");
                  if(mp.equalsIgnoreCase("PR")){
                      jLabel4.setText("Premium Member");
                      String query2 ="SELECT * from movies where mo_status=0 ";
                      p=conn.prepareStatement(query2);
                      rs=p.executeQuery();
                      jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  }
                  else{     
                      jLabel4.setText(mp);
                      String query1 ="SELECT * from movies where mo_type = '"+mp+"' && mo_status=0 ";
                      p=conn.prepareStatement(query1);
                      rs=p.executeQuery();
                      jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  }
                     
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        rentFreeTitle(); //call to this function if loyalty point > or = 100
        
    } 

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        String cccid=jLabel3.getText();
        dispose();
        updatec up=new updatec(cccid); //initialize update class object and passing customer id to that class
        up.setVisible(true); //redirect to update class
    }
    
    private void rentTitle() {
    	String path="jdbc:mysql://localhost:3306/movierental";
        String user="root";
        String password ="";      
        try {
            jLabel5.setVisible(true);
    jTextField1.setVisible(true);
    jButton3.setVisible(true);
    jLabel9.setVisible(false);
    jLabel10.setVisible(false);
    jTextField2.setVisible(false);
    jTextField3.setVisible(false);
    jButton5.setVisible(false);
    jLabel11.setVisible(false);
    jTextField4.setVisible(false);
    jButton7.setVisible(false);
            String mp;
            String cid=jLabel3.getText();
            Connection conn=DriverManager.getConnection(path,user,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=null;
            PreparedStatement p=null;
            String query ="SELECT * from customers,membership where c_id = '"+cid+"' && customers.c_id=membership.cu_id";
            p=conn.prepareStatement(query);
            rs=p.executeQuery();
            while (rs.next())
            { 
              mp = rs.getString("m_type"); //getting type of title
              if(mp.equalsIgnoreCase("PR")){ //matching with customer subscription Premium
                  jLabel4.setText("Premium Member");
                  String query2 ="SELECT * from movies where mo_status=0 ";
                  p=conn.prepareStatement(query2);
                  rs=p.executeQuery();
                  jTable1.setModel(DbUtils.resultSetToTableModel(rs)); //display all title according to premium subscription
              }
              else{     //matching with customer subscription
                  jLabel4.setText(mp);
                  String query1 ="SELECT * from movies where mo_type = '"+mp+"' && mo_status=0 ";
                  p=conn.prepareStatement(query1);
                  rs=p.executeQuery(); 
                  jTable1.setModel(DbUtils.resultSetToTableModel(rs)); //display all title according to subscription
              }
                 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void makeRent() {
    	String path="jdbc:mysql://localhost:3306/movierental";
        String user="root";
        String password ="";      
        try {
            String cid=jLabel3.getText();
            Connection conn=DriverManager.getConnection(path,user,password);
            Statement stmt=conn.createStatement();
             ResultSet rs=null;
            PreparedStatement p=null;
            int r_status=1;
            String moid=jTextField1.getText();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date = format.format(new java.util.Date());
            String query ="insert into rent(r_date_added,r_status,movie_id,customer_id) values ('"+date+"','"+r_status+"','"+moid+"','"+cid+"')";
            stmt.executeUpdate(query); //inserting information in rent table 
            
            String query1 ="update movies set mo_status='1' where mo_id='"+moid+"'"; //update status of title to 1 mean the title is rented
            stmt.executeUpdate(query1);
            
            String query2 ="SELECT * from loyality where cus_id = '"+cid+"'"; 
            p=conn.prepareStatement(query2);
            rs=p.executeQuery();
            while (rs.next())
            { 
              String point = rs.getString("l_point");
              int poin =Integer.parseInt(point); //conversion of string to int
              poin=poin+10; //add 10 points to loyalty point per rent
              
              String query3 ="update loyality set l_point='"+poin+"' where cus_id='"+cid+"'"; //insert +10 point in loyalty table according to particular customer id
              stmt.executeUpdate(query3);
              
            }
            
            String query5 ="SELECT * from loyality where cus_id = '"+cid+"'";
            p=conn.prepareStatement(query5);
            rs=p.executeQuery();
            while (rs.next())
            { 
              jLabel8.setText(rs.getString("l_point")); //display updated loyalty point on customer dashboard
            }
           
            JOptionPane.showMessageDialog(null,"Title Rented"); //display message that Title rented
                          
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void displayRentedTitle() {
    	jLabel5.setVisible(false);
        jTextField1.setVisible(false);
        jButton3.setVisible(false);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jButton5.setVisible(true);
        jLabel11.setVisible(false);
        jTextField4.setVisible(false);
        jButton7.setVisible(false);
        String path="jdbc:mysql://localhost:3306/movierental";
            String user="root";
            String password ="";      
            try {
                String cid=jLabel3.getText(); //customer id
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT rent.r_id, rent.r_date_added,movies.mo_id,movies.mo_name from rent,movies where customer_id like '"+cid+"' && movies.mo_id=rent.movie_id && rent.r_status=1 ";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); //display detail of rented title according to particular customer
                
            } catch (SQLException ex) {
                Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void returnTitle() {
    	String path="jdbc:mysql://localhost:3306/movierental";
        String user="root";
        String password ="";      
        try {
            String rid=jTextField2.getText();
            String mid=jTextField3.getText();

            Connection conn=DriverManager.getConnection(path,user,password);
            Statement stmt=conn.createStatement();
            
            String query1 ="update movies set mo_status='0' where mo_id='"+mid+"'"; //update title status to 0 means title now available
            stmt.executeUpdate(query1);
            
            String query2 ="update rent set r_status='0' where r_id='"+rid+"'"; //update rent status to 0 mean title is return by particular person
            stmt.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null,"Title Returned"); //message on title returned
            
           
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void rentFreeTitle() {
    	String path="jdbc:mysql://localhost:3306/movierental";
        String user="root";
        String password ="";      
        try {
            String cid=jLabel3.getText();
            Connection conn=DriverManager.getConnection(path,user,password); //connection
            Statement stmt=conn.createStatement();
             ResultSet rs=null;
            PreparedStatement p=null;
            int r_status=1;
            String moid=jTextField4.getText();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date = format.format(new java.util.Date());
            String query ="insert into rent(r_date_added,r_status,movie_id,customer_id) values ('"+date+"','"+r_status+"','"+moid+"','"+cid+"')";
            stmt.executeUpdate(query);
            
            String query1 ="update movies set mo_status='1' where mo_id='"+moid+"'";
            stmt.executeUpdate(query1);
            
            String query2 ="SELECT * from loyality where cus_id = '"+cid+"'";
            p=conn.prepareStatement(query2);
            rs=p.executeQuery();
            while (rs.next())
            { 
              String point = rs.getString("l_point");
              int poin =Integer.parseInt(point);
              poin=poin-100; //deduct 100 point per free rental
              
              String query3 ="update loyality set l_point='"+poin+"' where cus_id='"+cid+"'";
              stmt.executeUpdate(query3);
              
            }
            
            String query5 ="SELECT * from loyality where cus_id = '"+cid+"'";
            p=conn.prepareStatement(query5);
            rs=p.executeQuery();
            while (rs.next())
            { 
              jLabel8.setText(rs.getString("l_point")); //update loyalty points on customer dashboard
            }
           
            JOptionPane.showMessageDialog(null,"Free Movie Rented");
                          
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
  
    
}
