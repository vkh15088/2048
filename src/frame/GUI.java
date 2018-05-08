
package game_project;


import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class GUI extends javax.swing.JFrame {

   
    private demo2048 game;
      HighscoreManager hm = new HighscoreManager();// highscore
    //private Push_Stack pu = new Push_Stack();
    private JButton [][] array = new JButton[4][4]; 
    String name = "";// name player
    public GUI() {
        initComponents();
        game = new demo2048();
        game.addnewcell();// hien o dau tien trong game
        game.addnewcell();// hien o dau tien trong game
        Best.setText("" + hm.getHighScore());// hien ten tren GUI best
        assignBTtoArray();//chay game
        setDefaultText();
        name = JOptionPane.showInputDialog(this, "What's your name?");// thanh hoi khi bat dau choi
        player.setText(name);// yeu cau nhap ten
        view(game);
    }
    
    public void setDefaultText() {
        for(int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                array[i][j].setText(null);
            }
    }
    
    public void assignBTtoArray() {// phan dinh o nhiem vu
        array[0][0] = arr1;
        array[0][1] = arr2;
        array[0][2] = arr3;
        array[0][3] = arr4;
        array[1][0] = arr5;
        array[1][1] = arr6;
        array[1][2] = arr7;
        array[1][3] = arr8;
        array[2][0] = arr9;
        array[2][1] = arr10;
        array[2][2] = arr11;
        array[2][3] = arr12;
        array[3][0] = arr13;
        array[3][1] = arr14;
        array[3][2] = arr15;
        array[3][3] = arr16_;
        
    }
    public void view(demo2048 Obj) {
        for (int i = 0; i < 4; i++) {               
            for (int j = 0; j < 4; j++) {
                if(Obj.getValue(i,j) != 0) {
                    switch(Obj.getValue(i, j)) {
                        default : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,0,51));
                            break;
                        }
                        case 2 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,255,255));
                            break;
                        }
                        case 4 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(153,153,153));
                            break;

                        }
                        case 8 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,153,51));
                           break;
                        }
                        case 16 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,102,102));
                           break;
                        }
                        case 32 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,51,51));
                           break;

                        }
                        case 64 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,0,0));
                           break;
                        }
                        case 128 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,255,102));
                            break;
                        }
                        case 256 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,255,51));
                           break;
                        }
                        case 512 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,255,0));
                           break;
                        }
                        case 1024 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,203,57));
                            break;
                        }
                        case 2048 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,183,57));
                           break;
                        }
                    }
                }
                else 
                {
                    array[i][j].setBackground(new Color(240,240,240));
                }
            }
        }
        Score.setText("" + game.getCurrentscore());
        //jButton1.setBackground();
        
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
        arr1 = new javax.swing.JButton();
        arr2 = new javax.swing.JButton();
        arr3 = new javax.swing.JButton();
        arr4 = new javax.swing.JButton();
        arr5 = new javax.swing.JButton();
        arr6 = new javax.swing.JButton();
        arr7 = new javax.swing.JButton();
        arr8 = new javax.swing.JButton();
        arr9 = new javax.swing.JButton();
        arr10 = new javax.swing.JButton();
        arr11 = new javax.swing.JButton();
        arr12 = new javax.swing.JButton();
        arr13 = new javax.swing.JButton();
        arr14 = new javax.swing.JButton();
        arr15 = new javax.swing.JButton();
        arr16_ = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Score = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Best = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        player = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        arr1.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr1ActionPerformed(evt);
            }
        });

        arr2.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr2ActionPerformed(evt);
            }
        });

        arr3.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr3ActionPerformed(evt);
            }
        });

        arr4.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr4ActionPerformed(evt);
            }
        });

        arr5.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr6.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr7.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr8.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr9.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr10.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr11.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr12.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr13.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr14.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr15.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr16_.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr16_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr16_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(arr13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr16_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(arr5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(arr9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(arr1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arr1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arr2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arr3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arr4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(arr5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(arr8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arr12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(arr9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arr16_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(arr13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("VNI-Chancery", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N

        Score.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Score)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Best", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("VNI-Chancery", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N

        Best.setBackground(new java.awt.Color(0, 0, 0));
        Best.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Best.setForeground(new java.awt.Color(255, 255, 255));
        Best.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Best.setText("0");
        Best.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Best, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Best, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Play-Mode-Repeat-All-Disabled-icon.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(365, 309));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        player.setBackground(new java.awt.Color(0, 102, 102));
        player.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        player.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("VNI-Chancery", 0, 30)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setName("Player"); // NOI18N
        label1.setText("Player :");

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(player)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(252, 252, 252))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(354, 354, 354))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_UP){
            game.moveup();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            game.movedown();
        }else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            game.moveright();
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            game.moveleft();
            
        }
      
      
         if(!game.notchaged())
            game.addnewcell();
            game.pushBoardToStack(game.board);  
        setDefaultText();
        view(game);       
        Best.setText("" + hm.getHighScore());// highscore
        
        if(game.gameover()) {   //check game over 
        hm.addScore(name, game.getCurrentscore());// hm la` high score manager
        JOptionPane.showMessageDialog(this,"LEADER BOARD\n"+hm.getHighscoreString());// hien thi danh sach cac diem max tren bo nho
        player.setText("   ");
        GameOver gameover = new GameOver();
        gameover.setVisible(true);
        gameover.requestFocus();
        gameover.toFront();
        this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void BestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BestActionPerformed

    private void arr16_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr16_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr16_ActionPerformed

    private void arr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr2ActionPerformed

    private void arr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr1ActionPerformed

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GUI GUI = new GUI();
        GUI.setVisible(true);
        GUI.requestFocus();
        GUI.toFront();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
        game.undo();
        game.setCurrentscore((int) (game.currentscore * 0.8));
        setDefaultText();
        view(game);
       
        if(game.stack_board.size() <= 1) { JOptionPane.showMessageDialog(this,"Can't undo ");
           
        }

       
        jPanel2.setFocusable(true);
        requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr3ActionPerformed

    private void arr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the  form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Best;
    private javax.swing.JLabel Score;
    private javax.swing.JButton arr1;
    private javax.swing.JButton arr10;
    private javax.swing.JButton arr11;
    private javax.swing.JButton arr12;
    private javax.swing.JButton arr13;
    private javax.swing.JButton arr14;
    private javax.swing.JButton arr15;
    private javax.swing.JButton arr16_;
    private javax.swing.JButton arr2;
    private javax.swing.JButton arr3;
    private javax.swing.JButton arr4;
    private javax.swing.JButton arr5;
    private javax.swing.JButton arr6;
    private javax.swing.JButton arr7;
    private javax.swing.JButton arr8;
    private javax.swing.JButton arr9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private javax.swing.JTextField player;
    // End of variables declaration//GEN-END:variables
}
