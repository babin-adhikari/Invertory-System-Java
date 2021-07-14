/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodlifemart;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author rehan
 */
public class GoodLifeMartGUI extends javax.swing.JFrame {
    
    DefaultTableModel model;
    ArrayList<Item> itemArrayList = new ArrayList<Item>();
    boolean errorFound=false;
    boolean FirstEntry=true;
    boolean fileSaved = true;
    
    /**
     * Creates new form GoodLifeMartGUI
     */
    public GoodLifeMartGUI() {
        
        setUndecorated(true);
        
        initComponents();
        
        try{
            
            Font Font_menu =createFontmenu("fon1.ttf");         
            jLabel3.setFont(Font_menu);        
            jLabel4.setFont(Font_menu); 
            jLabel15.setFont(Font_menu); 
            jLabel5.setFont(Font_menu); 
            jLabel16.setFont(Font_menu); 
            jLabel26.setFont(Font_menu); 
            jLabel27.setFont(Font_menu); 
            jLabel28.setFont(Font_menu); 
            jLabel29.setFont(Font_menu); 
            jLabel30.setFont(Font_menu); 
            jLabel31.setFont(Font_menu); 
            jLabel32.setFont(Font_menu); 
            jLabel33.setFont(Font_menu); 
            jLabel6.setFont(Font_menu); 
            jLabel41.setFont(Font_menu); 
            jLabel42.setFont(Font_menu); 
            jLabel43.setFont(Font_menu); 
            jLabel44.setFont(Font_menu); 
            jLabel45.setFont(Font_menu); 
            jLabel46.setFont(Font_menu); 
            jLabel47.setFont(Font_menu); 
            jLabel48.setFont(Font_menu); 
            jLabel7.setFont(Font_menu); 
            jLabel50.setFont(Font_menu); 
            jLabel52.setFont(Font_menu); 
            jLabel53.setFont(Font_menu); 
            jLabel21.setFont(Font_menu); 
            jLabel38.setFont(Font_menu); 
            jLabel36.setFont(Font_menu);
            jLabel39.setFont(Font_menu); 
            jLabel23.setFont(Font_menu); 
            jLabel79.setFont(Font_menu); 
            jLabel80.setFont(Font_menu); 
            
            jButton1.setFont(Font_menu); 
            jButton7.setFont(Font_menu); 
            jButton8.setFont(Font_menu); 
            jButton15.setFont(Font_menu); 
            jButton11.setFont(Font_menu); 
            jButton12.setFont(Font_menu); 
            jButton5.setFont(Font_menu); 
            jButton6.setFont(Font_menu);
            jButton14.setFont(Font_menu); 
            jButton3.setFont(Font_menu); 
            jButton10.setFont(Font_menu); 
            jButton13.setFont(Font_menu); 
            
            jRadioButton3.setFont(Font_menu); 
            jRadioButton4.setFont(Font_menu); 
            
            Font Font_menu1 =createFontmenu1("fon2.ttf"); 
            jLabel2.setFont(Font_menu1); 
            
            Font Font_menu2 =createFontmenu2("fon3.ttf"); 
            jLabel1.setFont(Font_menu2); 
            
            Font Font_menu3 =createFontmenu3("fon4.ttf"); 
            jLabel13.setFont(Font_menu3); 
            jLabel17.setFont(Font_menu3); 
            jLabel49.setFont(Font_menu3); 
            jLabel35.setFont(Font_menu3); 
            
            Font Font_menu4 =createFontmenu4("fon5.ttf"); 
            jLabel25.setFont(Font_menu4); 
            jLabel8.setFont(Font_menu4);
            
            Font Font_menu5 =createFontmenu5("fon6.ttf"); 
            jLabel70.setFont(Font_menu5); 
            jLabel71.setFont(Font_menu5); 
            jLabel72.setFont(Font_menu5); 
            jLabel73.setFont(Font_menu5); 
            jLabel74.setFont(Font_menu5); 
            jLabel75.setFont(Font_menu5); 
            jLabel76.setFont(Font_menu5); 
            jLabel77.setFont(Font_menu5); 
            jLabel78.setFont(Font_menu5); 
            
            
        }          
        catch(FontFormatException | IOException e)
        {
            
        }
        

        
        
        
        //jButton8.setBackground(Color.red);
        jButton8.setContentAreaFilled(false);
        jButton8.setOpaque(true);
        
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        
        JTableHeader tableHeader = jTable1.getTableHeader();
        tableHeader.setFont(new Font("Dialog", Font.BOLD, 12) {
        });
        
        recordDetails();
        
        jLabel80.setText("");
        
        jMenu4.setEnabled(false);
        
        setLocationRelativeTo(null);
        
        
        
    }
    
    private void recordDetails(){
        jLabel79.setText("Number of Items: "+itemArrayList.size());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 681));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(375, 700));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(119, 93, 93));
        jButton1.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit System");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Playlist", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 93, 93));
        jLabel1.setText("Goodlife Mart");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 93, 93));
        jLabel2.setText("shopping made simple");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(119, 93, 93));
        jLabel3.setText("Home");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/home.png"))); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/add.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel4.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(119, 93, 93));
        jLabel4.setText("Add an Item");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/refresh.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel15.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(119, 93, 93));
        jLabel15.setText("Update Item");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(119, 93, 93));
        jLabel5.setText("Delete Item");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/dustbin.png"))); // NOI18N
        jLabel40.setPreferredSize(new java.awt.Dimension(25, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/search.png"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(36, 36));
        jLabel12.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(119, 93, 93));
        jLabel16.setText("Search / Browse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel2, "card2");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(112, 95, 95));
        jLabel26.setText("Add an Item");
        jLabel26.setPreferredSize(new java.awt.Dimension(74, 18));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(112, 95, 95));
        jLabel27.setText("Item ID");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(112, 95, 95));
        jLabel28.setText("Item Name");

        jLabel29.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(112, 95, 95));
        jLabel29.setText("Item Category");

        jLabel30.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(112, 95, 95));
        jLabel30.setText("Company");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Category--", "Snack Food", "Poultry", "Liquor", "Bakery", "Dairy", "Vegetables" }));

        jLabel31.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(112, 95, 95));
        jLabel31.setText("Item Availability");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jRadioButton3.setText("Available");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jRadioButton4.setText("Not Available");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(112, 95, 95));
        jLabel32.setText("Price");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(112, 95, 95));
        jLabel33.setText("Discount (%)");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(119, 93, 93));
        jButton7.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add Item");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(119, 93, 93));
        jButton8.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Clear");
        jButton8.setContentAreaFilled(false);
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/add.png"))); // NOI18N
        jLabel34.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel13.setFont(new java.awt.Font("Playlist", 0, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(112, 95, 95));
        jLabel13.setText("Goodlife Mart");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 102));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(119, 93, 93));
        jLabel6.setText("Return to Home");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 0, 102));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 102));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 0, 102));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 0, 102));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 0, 102));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton7))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel27))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel12, "card6");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(112, 95, 95));
        jLabel41.setText("Update an Item");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(112, 95, 95));
        jLabel42.setText("Item ID to Update");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(112, 95, 95));
        jLabel43.setText("Item Name");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(112, 95, 95));
        jLabel44.setText("Item Category");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(112, 95, 95));
        jLabel45.setText("Company");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Category--", "Snack Food", "Poultry", "Liquor", "Bakery", "Dairy", "Vegetables" }));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(112, 95, 95));
        jLabel46.setText("Item Availability");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton5.setText("Available");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton6.setText("Not Available");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(112, 95, 95));
        jLabel47.setText("Price");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(112, 95, 95));
        jLabel48.setText("Discount (%)");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(119, 93, 93));
        jButton11.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Update Item");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setOpaque(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(119, 93, 93));
        jButton12.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Clear");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setOpaque(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Playlist", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 95, 95));
        jLabel17.setText("Goodlife Mart");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/refresh.png"))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 0, 102));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 0, 102));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 0, 102));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 0, 102));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 0, 102));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 0, 102));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 0, 102));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(119, 93, 93));
        jLabel7.setText("Return to Home");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton15.setBackground(new java.awt.Color(119, 93, 93));
        jButton15.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Get Item Details");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setOpaque(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField16)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(14, 14, 14)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jRadioButton5))
                .addGap(3, 3, 3)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jLayeredPane1.add(jPanel11, "card7");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Playlist", 0, 28)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(112, 95, 95));
        jLabel49.setText("Goodlife Mart");

        jLabel50.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(119, 93, 93));
        jLabel50.setText("Delete Details");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/dustbin.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(112, 95, 95));
        jLabel52.setText("Delete Item Id");

        jTextField2.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(143, 143, 143));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(119, 93, 93));
        jButton5.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete Item");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(119, 93, 93));
        jButton14.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Drop Table");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setOpaque(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(112, 95, 95));
        jLabel53.setText("Drop all Details:");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(119, 93, 93));
        jLabel21.setText("Return to Home");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton6.setBackground(new java.awt.Color(119, 93, 93));
        jButton6.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel51)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton14))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jButton14))
                .addGap(45, 45, 45)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel6, "card8");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Playlist", 0, 28)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(112, 95, 95));
        jLabel35.setText("Goodlife Mart");

        jLabel36.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(119, 93, 93));
        jLabel36.setText("Search/Browse");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/search.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(112, 95, 95));
        jLabel38.setText("Search By Price:");

        jTextField1.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(143, 143, 143));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(119, 93, 93));
        jButton3.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search Item");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(112, 95, 95));
        jLabel39.setText("Browse by Category:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Category--", "Snack Food", "Poultry", "Liquor", "Bakery", "Dairy", "Vegetables" }));

        jButton10.setBackground(new java.awt.Color(119, 93, 93));
        jButton10.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Items Available in Category");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setOpaque(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(119, 93, 93));
        jLabel23.setText("Return to Home");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goodlifemart/Icon/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton13.setBackground(new java.awt.Color(119, 93, 93));
        jButton13.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Clear");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setOpaque(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 0, 102));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton13))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton3))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel15, "card5");

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(739, 700));
        jLayeredPane2.setLayout(new java.awt.CardLayout());

        jPanel8.setBackground(new java.awt.Color(138, 164, 255));

        jLabel25.setFont(new java.awt.Font("Raleway Medium", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Overview");

        jLabel70.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel70.setText("Did you ever imagine that the freshest of bakery items, top quality poultry items,");

        jLabel71.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel71.setText("and snack food, dairy products, and hundreds of branded liquor could be handpicked");

        jLabel72.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel72.setText("and delivered to your home, all at the click of a button? Nepal’s first comprehensive ");

        jLabel73.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel73.setText("online megastore, Good Life Mart brings a whopping 20000+ products with a variety ");

        jLabel74.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel74.setText("of brands, to thousands of happy customers. Good Life Mart has everything you need");

        jLabel75.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel75.setText("for your daily needs. Good Life Mart is convenience personified and we’ve taken");

        jLabel76.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel76.setText("away all the stress associated with shopping for daily essentials, and you can now");

        jLabel77.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel77.setText("order all your household products and even buy groceries online without traveling ");

        jLabel78.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        jLabel78.setText("long distances or standing in serpentine queues.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addComponent(jLabel76)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jLabel78)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel8, "card2");

        jPanel9.setBackground(new java.awt.Color(138, 164, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(739, 700));

        jLabel8.setFont(new java.awt.Font("Raleway SemiBold", 0, 24)); // NOI18N
        jLabel8.setText("System Record");

        jTable1.setFont(new java.awt.Font("Raleway Medium", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Category", "Company", "Availibility", "Price", "Discount (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        jLabel79.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel79.setText("Number of Items:");

        jLabel80.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 0, 102));
        jLabel80.setText("File Not Saved*");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addGap(18, 18, 18)
                .addComponent(jLabel80)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel9, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1200, 21));

        jMenu2.setText("File");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Import .csv File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Import .txt File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Export .csv File");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Export .txt File");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("User Manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setText("About Us");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("                                                                                                                                                                                                                                                                                                                                              ");
        jMenu4.setMinimumSize(new java.awt.Dimension(1082, 19));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu4MouseEntered(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("—");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("✖ ");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        exitSystem();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void fileNotSaved(){
        fileSaved=false;
        jLabel80.setText("File not Saved*");
    }
    
    private void fileSaved(){
        fileSaved=true;
        jLabel80.setText("");
    }
    
    private void exitSystem(){
        if(fileSaved == false){
            String[] options = {"Save", "Don't Save", "Close"};

            int x = JOptionPane.showOptionDialog(null, "Do you want to Save Changes?",
                    "File not Saved",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if(x==0){
                String[] options2 = {"Export to .csv file", "Export to .txt file"};

                int y = JOptionPane.showOptionDialog(null, "Which extention do you want to save.",
                        "File not Saved",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, options2[0]);
                if(y==0){
                    exportCsvFile();
//                    fileSaved();
                } else if (y==1){
                    exportTxtFile();
//                    fileSaved();
                }
                
            } else if(x==1){
                dispose();
            } else if (x==2){
            
            }
        }else{
            dispose();
        }
    }
    
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        errorFound=false;
        
        String itemId = jTextField7.getText().trim();
        checkEmptyValue(itemId, jLabel11, "Item Id");
        for (int i=0; i<itemArrayList.size(); i++){
            if (itemId.equals(itemArrayList.get(i).itemId)){
                JOptionPane.showMessageDialog(null,"Duplicate Item ID, " + itemArrayList.get(i).itemId , "Duplication Error", JOptionPane.ERROR_MESSAGE);
                errorFound=true;
            }
        }
        
        String itemName = jTextField8.getText().trim();
        checkEmptyValue(itemName, jLabel54, "Item Name");

        String itemCategory = (String) jComboBox3.getSelectedItem();
        checkEmptyValue(itemCategory, jLabel55, "Item Category");
        
        String company = (String) jTextField9.getText().trim();
        checkEmptyValue(company, jLabel56, "Company");

        String availability = "";
        if(jRadioButton3.isSelected()){
            availability=availability+jRadioButton3.getText();
        } else if(jRadioButton4.isSelected()){
            availability=availability+jRadioButton4.getText();
        }
        checkEmptyValue(availability, jLabel57, "Availability");
        
        int priceInt = 0;
        try{
            priceInt = Integer.parseInt(jTextField10.getText().trim());
            if (priceInt<=0){
                JOptionPane.showMessageDialog(null,"Please enter a Positive Integer Price", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound=true;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please Enter a valid number for Price", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel59.setText("*Required Field");
            errorFound=true;
        }
            
        int discountInt = 0; 
        try{
            discountInt = Integer.parseInt(jTextField11.getText().trim());
            if (discountInt<0 || discountInt>100 ){
                JOptionPane.showMessageDialog(null,"Please enter a Positive Integer Discount in the range of 0 to 100", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound=true;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please Enter a valid number for Discount", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel58.setText("*Required Field");
            errorFound=true;
        } 
        
        priceInt =  priceInt - (priceInt*discountInt)/100;
        
        Item newItem;
        
        if(errorFound == false){
            
            newItem = new Item(itemId, itemName, itemCategory, company, availability, priceInt, discountInt);

            itemArrayList.add(newItem);
            
            String price = Integer.toString(priceInt);
            String discount = Integer.toString(discountInt);
            
            String details [] = {itemId, itemName, itemCategory, company, availability, price, discount};
            
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.addRow(details);

            JOptionPane.showMessageDialog(null, itemId +" / "+ itemName +" Item Added", "Item Added", JOptionPane.INFORMATION_MESSAGE);
            
            clearAddItemPanel();
            
            fileNotSaved();
        }
        
        recordDetails();
               
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        clearAddItemPanel();
    }//GEN-LAST:event_jButton8ActionPerformed
    private void clearAddItemPanel(){
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox3.setSelectedIndex(0);
        jTextField9.setText("");
        buttonGroup1.clearSelection();
        jTextField10.setText("");
        jTextField11.setText("");
        
        jLabel11.setText("");
        jLabel54.setText("");
        jLabel55.setText("");
        jLabel56.setText("");
        jLabel57.setText("");
        jLabel59.setText("");
        jLabel58.setText("");
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        jPanel8.setVisible(true);
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel12.setVisible(true);
        jPanel9.setVisible(true);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        errorFound=importCsvFile();
        
        if(errorFound==false){
            jPanel8.setVisible(false);
            jPanel9.setVisible(true);

            recordDetails();

            fileNotSaved();
        }else{
            jPanel8.setVisible(true);
            jPanel9.setVisible(false);
            
            deleteTableInfo();
            
            recordDetails();
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        errorFound=false;

        int searchValue = 0;
        String searchValueStr = jTextField1.getText().trim();
        checkEmptyValue(searchValueStr, jLabel68, "Search Value");
        
        if(checkEmptyTable()==true && errorFound==false){
            JOptionPane.showMessageDialog(null,"Empty Table", "Empty Table", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
        }
        
        if(errorFound==false && checkEmptyTable()==false){
            try{
                searchValue = Integer.parseInt(searchValueStr);
                if (searchValue<=0){
                    JOptionPane.showMessageDialog(null,"Please enter a Positive Integer Price", "Error", JOptionPane.ERROR_MESSAGE);
                    errorFound=true;
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Please Enter a valid number for Price", "Error", JOptionPane.ERROR_MESSAGE);
                jLabel59.setText("*Required Field");
                errorFound=true;
            }
        }
        
        if(errorFound == false && checkEmptyTable()==false){
            SelectionSort.sort(itemArrayList);

            int itemIndex = BinarySearchArrayList.BinarySearch(itemArrayList, searchValue);

            if (itemIndex != -1) {
                    JOptionPane.showMessageDialog(null,"Item for price Rs. " + searchValue + " : " + itemArrayList.get(itemIndex).getItemName());
                } else {
                    JOptionPane.showMessageDialog(null, "No Item exists at given price","No Item Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        recordDetails();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        errorFound=false;
        boolean valueFound=false;
        
        String searchValue=(String) jComboBox1.getSelectedItem();
        checkEmptyValue(searchValue, jLabel69, "Search Value");
        
        int rowCount=itemArrayList.size();
        
        int numberOfItems=0;
        String category;
        String values = "";
        
        if(checkEmptyTable()==true && errorFound==false){
            JOptionPane.showMessageDialog(null,"Empty Table", "Empty Table", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
        }
        
        if(errorFound==false && checkEmptyTable()==false){
            for(int i=0; i<rowCount; i++){
                category=itemArrayList.get(i).itemCategory;
        
                if(searchValue.equals(category)){
                    numberOfItems++;
                    values = itemArrayList.get(i).itemName+", "+values;
                    valueFound=true;
                    
                }
            }
            
            if (valueFound==true){
                values = values.substring(0,values.length() - 2);
                JOptionPane.showMessageDialog(null, "There are " + numberOfItems + " items in Category " + searchValue +" :- " + values);
            }
            
            else if(valueFound==false){
                JOptionPane.showMessageDialog(null, "There are " + numberOfItems + " items in Category "+searchValue);
            }
        }
        
        recordDetails();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jPanel10.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        jPanel10.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        errorFound=false;
        boolean valueFound = false;

        //itemId, itemName, itemCategory, company, availability, price, discount
        
        String itemId = jTextField12.getText().trim();
        checkEmptyValue(itemId, jLabel60, "Item Id");

        String itemName = jTextField13.getText().trim();
        checkEmptyValue(itemName, jLabel66, "Item Name");

        String itemCategory = (String) jComboBox4.getSelectedItem();
        checkEmptyValue(itemCategory, jLabel65, "Item Category");

        String company = (String) jTextField14.getText().trim();
        checkEmptyValue(company, jLabel64, "Company");

        String availability = "";
        if(jRadioButton5.isSelected()){
            availability=availability+jRadioButton5.getText();
        } else if(jRadioButton6.isSelected()){
            availability=availability+jRadioButton6.getText();
        }
        checkEmptyValue(availability, jLabel63, "Availability");
        
        int priceInt = 0;
        boolean flag=false;
        
        
        
        try{
            String pricee=jTextField15.getText().trim();
            if ("".equals(pricee))
            {
                checkEmptyValue(pricee, jLabel62, "Price");
                flag=true;
            }
            priceInt = Integer.parseInt(jTextField15.getText().trim());
            if (priceInt<=0 && flag==false){
                JOptionPane.showMessageDialog(null,"Please enter a Positive Integer Price", "Error", JOptionPane.ERROR_MESSAGE);
                jLabel62.setText("*Required Field");
                errorFound=true;
            }
             
            
        }catch(NumberFormatException e){   
            if (flag==false)
            {
                JOptionPane.showMessageDialog(null,"Please enter a Valid Positive Integer Price", "Error", JOptionPane.ERROR_MESSAGE);
                jLabel62.setText("*Required Field");
                errorFound=true;
            }
            
        }

        
        int discountInt = 0;
        boolean isEmpty=false;
        try{
            String discon=jTextField16.getText().trim();
            if ("".equals(discon))
            {
                checkEmptyValue(discon, jLabel61, "Discount");
                isEmpty=true;
            }
            discountInt = Integer.parseInt(jTextField16.getText().trim());
            if (discountInt<0 || discountInt>100 && isEmpty==false){
                JOptionPane.showMessageDialog(null,"Please enter a Positive Integer Discount in the range of 0 to 100", "Error", JOptionPane.ERROR_MESSAGE);
                jLabel61.setText("*Required Field");
                errorFound=true;
            }
        }catch(NumberFormatException e){
            if (isEmpty==false)
            {
                JOptionPane.showMessageDialog(null,"Please enter a Valid Positive Integer Discount", "Error", JOptionPane.ERROR_MESSAGE);
                jLabel61.setText("*Required Field");
                errorFound=true;
            }
        }
        
        if(checkEmptyTable()==true && errorFound==false){
            JOptionPane.showMessageDialog(null,"Empty Table", "Empty Table", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
        }
        
        
        priceInt = priceInt - (priceInt*discountInt)/100;

        String price = Integer.toString(priceInt);
        String discount = Integer.toString(discountInt);

        String details [] = {itemId, itemName, itemCategory, company, availability, price, discount};

        String value;
        model=(DefaultTableModel)jTable1.getModel();

        for(int i=0; i<itemArrayList.size(); i++){
            value=itemArrayList.get(i).itemId;
            
            
            if (itemId.equals(value) && errorFound==false){
                itemArrayList.remove(itemArrayList.get(i));
                model.removeRow(i);
                
                
                model.addRow(details);

                Item newItem;
                newItem = new Item(itemId, itemName, itemCategory, company, availability, priceInt, discountInt);
                itemArrayList.add(newItem);
                
                valueFound=true;
                
                fileNotSaved();
            } 
        }
        
        
        if(valueFound==true){
            JOptionPane.showMessageDialog(null, itemId +" / "+ itemName +" is Updated", "Item Updated", JOptionPane.INFORMATION_MESSAGE);
            clearUpdateItemPanel();
        }else if(checkEmptyTable()==false && errorFound==false){
            JOptionPane.showMessageDialog(null, "Item Id does not exist in the record", "Item Id not Found", JOptionPane.INFORMATION_MESSAGE);
        }
        
       
        
        recordDetails();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        clearUpdateItemPanel();
    }//GEN-LAST:event_jButton12ActionPerformed
    private void clearUpdateItemPanel(){
        
        jTextField12.setText("");
        jTextField13.setText("");
        jComboBox4.setSelectedIndex(0);
        jTextField14.setText("");
        buttonGroup2.clearSelection();
        jTextField15.setText("");
        jTextField16.setText("");
        
        jLabel60.setText("");
        jLabel61.setText("");
        jLabel62.setText("");
        jLabel63.setText("");
        jLabel64.setText("");
        jLabel65.setText("");
        jLabel66.setText("");
    }
    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel11.setVisible(true);
        jPanel9.setVisible(true);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel15.setVisible(true);
        jPanel9.setVisible(true);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        errorFound=false;
        
        String deleteIdValue = jTextField2.getText().trim();
        checkEmptyValue(deleteIdValue, jLabel67, "Delete Id");
        
        String value;
        boolean valueFound = false;
        model=(DefaultTableModel)jTable1.getModel();
        
        if(checkEmptyTable()==true && errorFound==false){
            JOptionPane.showMessageDialog(null,"Empty Table", "Empty Table", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
        }
        
        for(int i=0; i<itemArrayList.size(); i++){
            value=itemArrayList.get(i).itemId;
            if (deleteIdValue.equals(value) && errorFound==false){
                String itemName=itemArrayList.get(i).itemName;
                JOptionPane.showMessageDialog(null, value+", "+ itemName +" item is Deleted", "Item Deleted", JOptionPane.INFORMATION_MESSAGE);
                itemArrayList.remove(itemArrayList.get(i));
                model.removeRow(i);
                valueFound = true;
                clearDeleteItemPanel();
                
                fileNotSaved();
            }
        }

        if(valueFound==false && errorFound!=true && checkEmptyTable()==false){
            JOptionPane.showMessageDialog(null,"Please Enter a valid Item ID to Delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(checkEmptyTable()==true && errorFound==false){
            fileSaved();
        }
        
        recordDetails();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        deleteTableInfo();
        
        recordDetails();
        
        fileSaved();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel6.setVisible(true);
        jPanel9.setVisible(true);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        jPanel12.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        // TODO add your handling code here:
        jPanel13.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        // TODO add your handling code here:
        jPanel13.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
        jPanel11.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        // TODO add your handling code here:
        jPanel14.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        // TODO add your handling code here:
        jPanel14.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        // TODO add your handling code here:
        jPanel6.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        // TODO add your handling code here:
        jPanel16.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        // TODO add your handling code here:
        jPanel16.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        // TODO add your handling code here:
        jPanel15.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        // TODO add your handling code here:
        jPanel17.setBackground(new Color(232, 214, 165));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        // TODO add your handling code here:
        jPanel17.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel17MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clearDeleteItemPanel();
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void clearDeleteItemPanel(){
        jTextField2.setText("");
        
        jLabel67.setText("");
    }
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        clearSearchItemPanel();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4MouseEntered

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        exitSystem();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        exportCsvFile();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        exportTxtFile();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
        errorFound=false;
        boolean valueFound = false;
        
        String itemId = jTextField12.getText().trim();
        checkEmptyValue(itemId, jLabel60, "Item Id");
        
        String value;
        model=(DefaultTableModel)jTable1.getModel();
        
        for(int i=0; i<itemArrayList.size(); i++){
            value=itemArrayList.get(i).itemId;

            if (itemId.equals(value) && errorFound==false){
                
                // Item Name
                jTextField13.setText(itemArrayList.get(i).itemName);
                
                // Item Category
                jComboBox4.setSelectedItem(itemArrayList.get(i).itemCategory);
                
                // Company
                jTextField14.setText(itemArrayList.get(i).company);
                
                // availibility
                if((itemArrayList.get(i).availability).equals("Available")){
                    jRadioButton5.setSelected(true);
                    jRadioButton6.setSelected(false);
                }else if((itemArrayList.get(i).availability).equals("Not Available")){
                    jRadioButton5.setSelected(false);
                    jRadioButton6.setSelected(true);
                }
                
                // Price
                jTextField15.setText(Integer.toString(itemArrayList.get(i).price));
                
                // Discount
                jTextField16.setText(Integer.toString(itemArrayList.get(i).discount));
                
                valueFound=true;
                
            } 
        }
        
        
        if(valueFound==true){
            JOptionPane.showMessageDialog(null, itemId +" Details are stored in the text fields", "Details set in TextFields", JOptionPane.INFORMATION_MESSAGE);
        }else if(checkEmptyTable()==false && errorFound==false){
            JOptionPane.showMessageDialog(null, "Item Id does not exist in the record", "Item Id not Found", JOptionPane.ERROR_MESSAGE);
        }else if(checkEmptyTable()==true && errorFound==false){
            JOptionPane.showMessageDialog(null, "Empty Table", "Empty Table", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        errorFound=importTxtFile();
        
        if(errorFound==false){
            jPanel8.setVisible(false);
            jPanel9.setVisible(true);

            recordDetails();

            fileNotSaved();
        }else{
            jPanel8.setVisible(true);
            jPanel9.setVisible(false);
            
            deleteTableInfo();
            
            recordDetails();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        File file=new File("src\\HelpAndAboutUs\\AboutUs.pdf");
        try {
            Desktop.getDesktop().open(file);
        }   catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "File not found");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
                                                  
        File file=new File("src\\HelpAndAboutUs\\UserManual.pdf");
        try {
            Desktop.getDesktop().open(file);
        }   catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "File not found");
        }
    
    }                                          
    
    private void exportCsvFile(){
        errorFound=false;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Save");
        int userSelection = fileChooser.showSaveDialog(this);
        fileChooser.addChoosableFileFilter((new  FileNameExtensionFilter("Txt",".txt")));
        
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            String filePath = filetosave.getPath();
            filetosave= new File(filePath + ".csv");
            try {
                FileWriter fw = new  FileWriter(filetosave);
                BufferedWriter bw = new  BufferedWriter(fw);
                bw.write("Item Id,Item Name,Item Category,Company,Availability,Price,Discount");
                bw.newLine();
                for(int i = 0; i < jTable1.getRowCount();i++){
                    for(int j = 0; j < jTable1.getColumnCount();j++){
                        bw.write(jTable1.getValueAt(i, j).toString()+",");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Loaded Sucessfully","Sucess", JOptionPane.INFORMATION_MESSAGE);

                bw.close();
                fw.close();
                
                fileSaved();
                
                errorFound = false;
            } catch (HeadlessException | IOException e) {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound=true;
            }
            
        }
    }
    
    public void exportTxtFile(){
        errorFound=false;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            String filePath = filetosave.getPath();
            filetosave= new File(filePath + ".txt");
            try {
                FileWriter fw = new  FileWriter(filetosave);
                BufferedWriter bw = new  BufferedWriter(fw);
                for(int i = 0; i < jTable1.getRowCount();i++){
                    for(int j = 0; j < jTable1.getColumnCount();j++){
                        bw.write(jTable1.getValueAt(i, j).toString()+", ");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Loaded Sucessfully","Sucess", JOptionPane.INFORMATION_MESSAGE);

                bw.close();
                fw.close();
                
                errorFound=false;
                
                fileSaved();
                
            } catch (HeadlessException | IOException e) {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound=true;
            }

    }
    }
    
    private void clearSearchItemPanel(){
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        
        jLabel68.setText("");
        jLabel69.setText("");
    }
    
    public boolean importTxtFile(){
        errorFound=false;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Open");
        int userSelection = fileChooser.showDialog(this, "Open");
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            
            try {
                FirstEntry=false;
                FileReader fr = new FileReader(filetosave);
                BufferedReader br = new BufferedReader(fr);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] lines = br.lines().toArray();
                deleteTableInfo();
                Item newItem;
                for(int i = 0; i<lines.length;i++){
                    String[] row = lines[i].toString().split(", ");
                    model.addRow(row);

                    String itemId = row[0];
                    String itemName = row[1];
                    String itemCategory = row[2];
                    String company = row[3];
                    String availability = row[4];
                    int priceInt = Integer.parseInt(row[5]);
                    int discountInt = Integer.parseInt(row[6]);

                    newItem = new Item(itemId, itemName, itemCategory, company, availability, priceInt, discountInt);
                    itemArrayList.add(newItem);
                }
                JOptionPane.showMessageDialog(null, "Table Updated", "CSV File Imported",JOptionPane.INFORMATION_MESSAGE);
                errorFound =  false;
                
            } catch (HeadlessException | FileNotFoundException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound =  true;
            }
        }else{
            errorFound = true;
        }
        return errorFound; 
    }
    
    public boolean importCsvFile(){
        errorFound=false;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Open");

        int userSelection = fileChooser.showDialog(this, "Open");
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            
            try {
                FileReader fr = new FileReader(filetosave);
                BufferedReader br = new BufferedReader(fr);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] lines = br.lines().toArray();
                deleteTableInfo();
                Item newItem;

                for(int i = 1; i<lines.length;i++){
                    String[] row = lines[i].toString().split(",");
                    model.addRow(row);

                    String itemId = row[0];
                    String itemName = row[1];
                    String itemCategory = row[2];
                    String company = row[3];
                    String availability = row[4];
                    int priceInt = Integer.parseInt(row[5]);
                    int discountInt = Integer.parseInt(row[6]);

                    newItem = new Item(itemId, itemName, itemCategory, company, availability, priceInt, discountInt);
                    itemArrayList.add(newItem);
                }
                JOptionPane.showMessageDialog(null, "Table Updated", "CSV File Imported",JOptionPane.INFORMATION_MESSAGE);
                errorFound =  false;
            } catch (HeadlessException | FileNotFoundException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                errorFound =  true;
            }
//            errorFound=false;
        }else{
            errorFound =  true;
        }
            
        return errorFound;
    }
    
    public void deleteTableInfo(){
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        itemArrayList.removeAll(itemArrayList);
    }
    
    private void checkEmptyValue(String value, JLabel errorLabel, String nameLabel ){
        if(value.equals("") || value.equals("--Category--")){
            JOptionPane.showMessageDialog(null, nameLabel + " Field is Empty", "Field Empty", JOptionPane.ERROR_MESSAGE);
            errorLabel.setText("*Required Field");
            errorFound=true;
        }else{  
             errorLabel.setText("");
        }
    }
    
    private boolean checkEmptyTable(){
        int tableRows=itemArrayList.size();
        if(tableRows==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static final String Font_menu="fonts/Raleway-SemiBold.ttf";     
    private static Font createFontmenu(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu)) .deriveFont(80,14f);     
    }
    
    public static final String Font_menu1="fonts/Raleway-Light.ttf";     
    private static Font createFontmenu1(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu1)) .deriveFont(80,14f);     
    }
    
    public static final String Font_menu2="fonts/Playlist-Script.ttf";     
    private static Font createFontmenu2(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu2)) .deriveFont(80,36f);     
    }
    
    public static final String Font_menu3="fonts/Playlist-Script.ttf";     
    private static Font createFontmenu3(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu3)) .deriveFont(80,28f);     
    }
    
    public static final String Font_menu4="fonts/Raleway-SemiBold.ttf";     
    private static Font createFontmenu4(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu4)) .deriveFont(80,24f);     
    }
    
    public static final String Font_menu5="fonts/Raleway-SemiBold.ttf";     
    private static Font createFontmenu5(String url) 
    throws FontFormatException, IOException{
        return Font.createFont(Font.TRUETYPE_FONT,GoodLifeMartGUI.class.getClassLoader().getResourceAsStream(Font_menu5)) .deriveFont(80,16f);     
    }
    
//    private void checkEmptyNum(int number, JLabel ErrorLabel){
//        if(number==0){
//            ErrorLabel.setText("*Required Field");
//            errorFound=true;
//        }else {
//            ErrorLabel.setText("");
//        }
//    };
//    
//    private void showEmptyNumMessage(int number){
//        if(number == 0){
//            JOptionPane.showMessageDialog(null, "Field Empty", "Field Empty", JOptionPane.ERROR_MESSAGE);
//            errorFound=true;
//        }
//    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GoodLifeMartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoodLifeMartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoodLifeMartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoodLifeMartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        StartScreen sc=new StartScreen();
        GoodLifeMartGUI g=new GoodLifeMartGUI();
        sc.setVisible(true);
        try
        {
            for(int i=0; i<=100;i++)
            {
                Thread.sleep(18);
                sc.jLabel5.setText(Integer.toString(i));
                sc.jProgressBar1.setValue(i);
                if (i==100)
                {
                    sc.setVisible(false);
                    g.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
