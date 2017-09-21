package autoukis;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AutoUkis extends javax.swing.JFrame {

    private ArrayList<Gyvunas> gyvunai = new ArrayList<>();
    private List<AriamiLaukai> ariamiLaukai = new ArrayList<>();
    private ZemesPlotas plotas;
    private Map map = new Map();
    private Point p1, p2;
    private Color spalva;
    private UkioTechnika tech = new UkioTechnika(map, 0);
    private Prisijungimas prs = new Prisijungimas();

    public AutoUkis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        panelOne = new javax.swing.JPanel();
        buttonOne = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonTen = new javax.swing.JButton();
        buttonEleven = new javax.swing.JButton();
        buttonTwelve = new javax.swing.JButton();
        buttonThirteen = new javax.swing.JButton();
        buttonFourteen = new javax.swing.JButton();
        buttonFifteen = new javax.swing.JButton();
        buttonSixteen = new javax.swing.JButton();
        buttonSeventeen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelTwo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonEighteen = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textFieldThree = new javax.swing.JTextField();
        textFieldOne = new javax.swing.JTextField();
        textFieldTwo = new javax.swing.JTextField();
        textFieldFour = new javax.swing.JTextField();
        textFieldSix = new javax.swing.JTextField();
        textFieldFive = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        panelThree = map;
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ganyklos = new javax.swing.JRadioButton();
        Ukiniai = new javax.swing.JRadioButton();
        ariama = new javax.swing.JRadioButton();
        mastelisSlider = new javax.swing.JSlider();
        mastelisLabel = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        panelFour = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelFive = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelSix = new javax.swing.JPanel();
        panelSeven = new javax.swing.JPanel();
        panelEight = new javax.swing.JPanel();
        panelNine = new javax.swing.JPanel();
        panelTen = new javax.swing.JPanel();
        panelEleven = new javax.swing.JPanel();
        panelTwelve = new javax.swing.JPanel();
        panelThirteen = new javax.swing.JPanel();
        panelFourteen = new javax.swing.JPanel();
        panelFifteen = new javax.swing.JPanel();
        panelSixteen = new javax.swing.JPanel();
        panelSeventeen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Prisijungimas");

        jButton5.setText("Prisijungti");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Prisijungimo vardas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Slaptažodis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        mainPanel.add(jPanel1, "card19");

        buttonOne.setText("Gyvūnu sveikatos ir lokacijos sekimas ");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonTwo.setText("Žemės teritorijos, jų žymėjimas");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonFour.setText("Oro prognozė");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonSix.setText("Žemės parametrai");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonSeven.setText("Gyvūnų maisto istekliai");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonEight.setText("Maisto užsakymas");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonNine.setText("Technikos sekimas realiu laiku");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonTen.setText("Teritorijos žymejimas");
        buttonTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTenActionPerformed(evt);
            }
        });

        buttonEleven.setText("Ligų žemėlapis");
        buttonEleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElevenActionPerformed(evt);
            }
        });

        buttonTwelve.setText("Sąskaitos");
        buttonTwelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwelveActionPerformed(evt);
            }
        });

        buttonThirteen.setText("Darbuotojų samdymas");
        buttonThirteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThirteenActionPerformed(evt);
            }
        });

        buttonFourteen.setText("Pelno skaičiavimas");
        buttonFourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourteenActionPerformed(evt);
            }
        });

        buttonFifteen.setText("Derlius");
        buttonFifteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFifteenActionPerformed(evt);
            }
        });

        buttonSixteen.setText("Buhalterija");
        buttonSixteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixteenActionPerformed(evt);
            }
        });

        buttonSeventeen.setText("Rinkos kainos");
        buttonSeventeen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeventeenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Automatinė ūkio valdymo sistema");

        javax.swing.GroupLayout panelOneLayout = new javax.swing.GroupLayout(panelOne);
        panelOne.setLayout(panelOneLayout);
        panelOneLayout.setHorizontalGroup(
            panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelOneLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeventeen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        panelOneLayout.setVerticalGroup(
            panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeventeen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        mainPanel.add(panelOne, "panelOne");
        panelOne.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gyvūnų sveikatos ir lokacijos sekimas");

        buttonEighteen.setText("Grįžti");
        buttonEighteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEighteenActionPerformed(evt);
            }
        });

        jButton4.setText("Pridėti");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        textFieldThree.setText("Amzius");
        textFieldThree.setToolTipText("");
        textFieldThree.setVerifyInputWhenFocusTarget(false);
        textFieldThree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldThreeFocusGained(evt);
            }
        });
        textFieldThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldThreeActionPerformed(evt);
            }
        });

        textFieldOne.setText("ID");
        textFieldOne.setToolTipText("");
        textFieldOne.setVerifyInputWhenFocusTarget(false);
        textFieldOne.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldOneFocusGained(evt);
            }
        });
        textFieldOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOneActionPerformed(evt);
            }
        });

        textFieldTwo.setText("Veisle");
        textFieldTwo.setToolTipText("");
        textFieldTwo.setVerifyInputWhenFocusTarget(false);
        textFieldTwo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldTwoFocusGained(evt);
            }
        });
        textFieldTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTwoActionPerformed(evt);
            }
        });

        textFieldFour.setText("Lytis");
        textFieldFour.setToolTipText("");
        textFieldFour.setVerifyInputWhenFocusTarget(false);
        textFieldFour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFourFocusGained(evt);
            }
        });
        textFieldFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFourActionPerformed(evt);
            }
        });

        textFieldSix.setText("Lokacija");
        textFieldSix.setToolTipText("");
        textFieldSix.setVerifyInputWhenFocusTarget(false);
        textFieldSix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldSixFocusGained(evt);
            }
        });
        textFieldSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSixActionPerformed(evt);
            }
        });

        textFieldFive.setText("Suvartojamas maistas kilogramais");
        textFieldFive.setToolTipText("");
        textFieldFive.setVerifyInputWhenFocusTarget(false);
        textFieldFive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFiveFocusGained(evt);
            }
        });
        textFieldFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFiveActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(strin()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout panelTwoLayout = new javax.swing.GroupLayout(panelTwo);
        panelTwo.setLayout(panelTwoLayout);
        panelTwoLayout.setHorizontalGroup(
            panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTwoLayout.createSequentialGroup()
                .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTwoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTwoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTwoLayout.createSequentialGroup()
                                .addGap(521, 521, 521)
                                .addComponent(buttonEighteen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTwoLayout.createSequentialGroup()
                                .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldSix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                                    .addComponent(textFieldFour, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldFive, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldThree, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelTwoLayout.setVerticalGroup(
            panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTwoLayout.createSequentialGroup()
                        .addComponent(textFieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(textFieldTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldThree, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldFour, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldFive, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSix, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(buttonEighteen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textFieldThree.getAccessibleContext().setAccessibleName("textFieldOne");

        mainPanel.add(panelTwo, "panelTwo");

        panelThree.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelThreeMouseDragged(evt);
            }
        });
        panelThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelThreeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelThreeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelThreeMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Žemės teritorija, jos žymėjimas");

        jButton1.setText("Grįžti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ganyklos.setText("Ganyklos");
        ganyklos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganyklosActionPerformed(evt);
            }
        });

        Ukiniai.setText("Ukiniai pastatai");
        Ukiniai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UkiniaiActionPerformed(evt);
            }
        });

        ariama.setText("Ariama žemė");
        ariama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ariamaActionPerformed(evt);
            }
        });

        mastelisSlider.setMajorTickSpacing(50);
        mastelisSlider.setMinimum(1000);
        mastelisSlider.setMaximum(5000);
        mastelisSlider.setMinorTickSpacing(20);
        mastelisSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                mastelisSliderAncestorMoved(evt);
            }
        });
        mastelisSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mastelisSliderStateChanged(evt);
            }
        });

        mastelisLabel.setText("Mąstelis: ");

        done.setText("Žymėjimai baigti");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThreeLayout = new javax.swing.GroupLayout(panelThree);
        panelThree.setLayout(panelThreeLayout);
        panelThreeLayout.setHorizontalGroup(
            panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addGroup(panelThreeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelThreeLayout.createSequentialGroup()
                                .addComponent(ariama, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelThreeLayout.createSequentialGroup()
                                .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelThreeLayout.createSequentialGroup()
                                        .addComponent(Ukiniai, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mastelisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelThreeLayout.createSequentialGroup()
                                        .addComponent(ganyklos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mastelisSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelThreeLayout.setVerticalGroup(
            panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addComponent(ariama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThreeLayout.createSequentialGroup()
                        .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelThreeLayout.createSequentialGroup()
                                .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ukiniai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mastelisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ganyklos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mastelisSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThreeLayout.createSequentialGroup()
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        mainPanel.add(panelThree, "panelThree");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Žemės parametrų sekimas");
        panelFour.add(jLabel4);

        jButton2.setText("Grįžti");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelFour.add(jButton2);

        jLabel10.setText("Ph:");
        panelFour.add(jLabel10);

        jLabel11.setText("Derlingos žemės sluoksnis:");
        panelFour.add(jLabel11);

        jLabel12.setText("Dregmė:");
        panelFour.add(jLabel12);

        jLabel9.setText("Smėlingumas(%):");
        panelFour.add(jLabel9);

        mainPanel.add(panelFour, "panelFour");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Oro prognozės sekimas");

        jButton3.setText("Grįžti");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Alytus", "Vilnius", "Kaunas", "Klaipėda", "Panevėžys" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Nepasirinktas miestas");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleName("weatherToday");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Nepasirinktas miestas");
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.getAccessibleContext().setAccessibleName("weatherTomorrow");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Pasirinkite artimiausią miestą:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel14.setText("Šiandienos orai:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel15.setText("Rytojaus orai:");

        javax.swing.GroupLayout panelFiveLayout = new javax.swing.GroupLayout(panelFive);
        panelFive.setLayout(panelFiveLayout);
        panelFiveLayout.setHorizontalGroup(
            panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFiveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(185, 185, 185)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(panelFiveLayout.createSequentialGroup()
                .addGroup(panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                            .addGroup(panelFiveLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFiveLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelFiveLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(161, 161, 161)))
                .addContainerGap())
        );
        panelFiveLayout.setVerticalGroup(
            panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(65, 65, 65)
                .addGroup(panelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(panelFive, "panelFive");

        javax.swing.GroupLayout panelSixLayout = new javax.swing.GroupLayout(panelSix);
        panelSix.setLayout(panelSixLayout);
        panelSixLayout.setHorizontalGroup(
            panelSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelSixLayout.setVerticalGroup(
            panelSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelSix, "panelSix");

        javax.swing.GroupLayout panelSevenLayout = new javax.swing.GroupLayout(panelSeven);
        panelSeven.setLayout(panelSevenLayout);
        panelSevenLayout.setHorizontalGroup(
            panelSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelSevenLayout.setVerticalGroup(
            panelSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelSeven, "panelSeven");

        javax.swing.GroupLayout panelEightLayout = new javax.swing.GroupLayout(panelEight);
        panelEight.setLayout(panelEightLayout);
        panelEightLayout.setHorizontalGroup(
            panelEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelEightLayout.setVerticalGroup(
            panelEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelEight, "panelEight");

        javax.swing.GroupLayout panelNineLayout = new javax.swing.GroupLayout(panelNine);
        panelNine.setLayout(panelNineLayout);
        panelNineLayout.setHorizontalGroup(
            panelNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelNineLayout.setVerticalGroup(
            panelNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelNine, "panelNine");

        javax.swing.GroupLayout panelTenLayout = new javax.swing.GroupLayout(panelTen);
        panelTen.setLayout(panelTenLayout);
        panelTenLayout.setHorizontalGroup(
            panelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelTenLayout.setVerticalGroup(
            panelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelTen, "panelTen");

        javax.swing.GroupLayout panelElevenLayout = new javax.swing.GroupLayout(panelEleven);
        panelEleven.setLayout(panelElevenLayout);
        panelElevenLayout.setHorizontalGroup(
            panelElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelElevenLayout.setVerticalGroup(
            panelElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelEleven, "panelEleven");

        javax.swing.GroupLayout panelTwelveLayout = new javax.swing.GroupLayout(panelTwelve);
        panelTwelve.setLayout(panelTwelveLayout);
        panelTwelveLayout.setHorizontalGroup(
            panelTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelTwelveLayout.setVerticalGroup(
            panelTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelTwelve, "panelTwelve");

        javax.swing.GroupLayout panelThirteenLayout = new javax.swing.GroupLayout(panelThirteen);
        panelThirteen.setLayout(panelThirteenLayout);
        panelThirteenLayout.setHorizontalGroup(
            panelThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelThirteenLayout.setVerticalGroup(
            panelThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelThirteen, "panelThirteen");

        javax.swing.GroupLayout panelFourteenLayout = new javax.swing.GroupLayout(panelFourteen);
        panelFourteen.setLayout(panelFourteenLayout);
        panelFourteenLayout.setHorizontalGroup(
            panelFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelFourteenLayout.setVerticalGroup(
            panelFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelFourteen, "panelFourteen");

        javax.swing.GroupLayout panelFifteenLayout = new javax.swing.GroupLayout(panelFifteen);
        panelFifteen.setLayout(panelFifteenLayout);
        panelFifteenLayout.setHorizontalGroup(
            panelFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelFifteenLayout.setVerticalGroup(
            panelFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelFifteen, "panelFifteen");

        javax.swing.GroupLayout panelSixteenLayout = new javax.swing.GroupLayout(panelSixteen);
        panelSixteen.setLayout(panelSixteenLayout);
        panelSixteenLayout.setHorizontalGroup(
            panelSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelSixteenLayout.setVerticalGroup(
            panelSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelSixteen, "panelSixteen");

        javax.swing.GroupLayout panelSeventeenLayout = new javax.swing.GroupLayout(panelSeventeen);
        panelSeventeen.setLayout(panelSeventeenLayout);
        panelSeventeenLayout.setHorizontalGroup(
            panelSeventeenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelSeventeenLayout.setVerticalGroup(
            panelSeventeenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        mainPanel.add(panelSeventeen, "panelSeventeen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelTwo");
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonEighteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEighteenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_buttonEighteenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelThree");
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFive");
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFour");
    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelSeven");
    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelEight");
    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelNine");
    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelTen");
    }//GEN-LAST:event_buttonTenActionPerformed

    private void buttonElevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElevenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelEleven");
    }//GEN-LAST:event_buttonElevenActionPerformed

    private void buttonTwelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwelveActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelTwelve");
    }//GEN-LAST:event_buttonTwelveActionPerformed

    private void buttonThirteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThirteenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "Thirteen");
    }//GEN-LAST:event_buttonThirteenActionPerformed

    private void buttonFourteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourteenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFourteen");
    }//GEN-LAST:event_buttonFourteenActionPerformed

    private void buttonFifteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFifteenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFifteen");
    }//GEN-LAST:event_buttonFifteenActionPerformed

    private void buttonSixteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixteenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelSixteen");
    }//GEN-LAST:event_buttonSixteenActionPerformed

    private void buttonSeventeenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeventeenActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelSeventeen");
    }//GEN-LAST:event_buttonSeventeenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textFieldThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldThreeActionPerformed


    }//GEN-LAST:event_textFieldThreeActionPerformed

    private void textFieldThreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldThreeFocusGained

        textFieldThree.setText("");

    }//GEN-LAST:event_textFieldThreeFocusGained

    private void textFieldOneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldOneFocusGained
        textFieldOne.setText("");
    }//GEN-LAST:event_textFieldOneFocusGained

    private void textFieldOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOneActionPerformed

    private void textFieldTwoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldTwoFocusGained
        textFieldTwo.setText("");
    }//GEN-LAST:event_textFieldTwoFocusGained

    private void textFieldTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTwoActionPerformed

    private void textFieldFourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFourFocusGained
        textFieldFour.setText("");
    }//GEN-LAST:event_textFieldFourFocusGained

    private void textFieldFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFourActionPerformed

    private void textFieldSixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSixFocusGained
        textFieldSix.setText("");
    }//GEN-LAST:event_textFieldSixFocusGained

    private void textFieldSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSixActionPerformed

    private void textFieldFiveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFiveFocusGained
        textFieldFive.setText("");
    }//GEN-LAST:event_textFieldFiveFocusGained

    private void textFieldFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFiveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Gyvunas gyv = new Gyvunas(Integer.parseInt(textFieldOne.getText()),
                textFieldTwo.getText(),
                Integer.parseInt(textFieldThree.getText()),
                textFieldFour.getText(),
                Float.parseFloat(textFieldFive.getText()),
                textFieldSix.getText());
        gyvunai.add(gyv);
        textFieldOne.setText("ID");
        textFieldTwo.setText("Veisle");
        textFieldThree.setText("Amzius");
        textFieldFour.setText("Lytis");
        textFieldFive.setText("Suvartojamas maistas kilogramais");
        textFieldSix.setText("Lokacija");
        jComboBox1.addItem("" + gyv.getId());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void panelThreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelThreeMousePressed
        p1 = panelThree.getMousePosition();
    }//GEN-LAST:event_panelThreeMousePressed

    private void panelThreeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelThreeMouseDragged

        p2 = panelThree.getMousePosition();
        plotas = new ZemesPlotas(spalva, p1, p2, "");
        map.setPlotas(plotas);
        panelThree.repaint();
    }//GEN-LAST:event_panelThreeMouseDragged

    private void panelThreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelThreeMouseReleased
        String msg;
        msg = "";
        p2 = panelThree.getMousePosition();
        if (spalva == Color.green) {
            msg = "ok";
            plotas = new Ganyklos(spalva, p1, p2, "Ganyklos");

        }
        if (spalva == Color.blue) {
            msg = "ok";
            plotas = new UkiniaiPastatai(spalva, p1, p2, "Ukiniai Pastatai");
        }
        if (spalva == Color.magenta) {
            msg = "ok";
            plotas = new AriamiLaukai(spalva, p1, p2, "Ariami Laukai", new ZemesParametrai("Laukas", 0, 0, 0, 0, 0));
            if (map.check(p1) && map.check(p2)) {
                if ((Math.abs(plotas.getP1().x - plotas.getP2().x) > 5) && (Math.abs(plotas.getP1().y - plotas.getP2().y) > 5)) {
                    ariamiLaukai.add((AriamiLaukai) plotas);
                }
            }
        }
        if (msg != "") {
            map.setPlotas(plotas);
            map.updateList(plotas);
            panelThree.repaint();
        }
    }//GEN-LAST:event_panelThreeMouseReleased

    private void ganyklosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganyklosActionPerformed

        spalva = Color.green;
        Ukiniai.setSelected(false);
        ariama.setSelected(false);


    }//GEN-LAST:event_ganyklosActionPerformed

    private void UkiniaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UkiniaiActionPerformed
        spalva = Color.blue;
        ganyklos.setSelected(false);
        ariama.setSelected(false);
    }//GEN-LAST:event_UkiniaiActionPerformed

    private void ariamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ariamaActionPerformed
        spalva = Color.magenta;
        Ukiniai.setSelected(false);
        ganyklos.setSelected(false);
    }//GEN-LAST:event_ariamaActionPerformed

    private void panelThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelThreeMouseClicked

        JTextArea label = new JTextArea();
        label.setEditable(false);

        panelThree.add(label);
        String text;
        Point x = panelThree.getMousePosition();

        label.setBounds(x.x, x.y, 150, 30);
        if (!map.check(x)) {
            if (map.getPlotas() instanceof AriamiLaukai) {
                AriamiLaukai laukai = (AriamiLaukai) map.getPlotas();
                text = String.format(laukai.getMsg()
                        + "Dregmė: " + (laukai.getParametrai().getDregme())
                        + "Ph: " + (laukai.getParametrai().getPh())
                        + "Storis: " + (laukai.getParametrai().getStoris())
                        + "Smėlingumas: " + (laukai.getParametrai().getSmelisProcentais()) + "%");
            } else {
                label.setText(map.getPlotas().getMsg());
            }
        }
        label.setVisible(true);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                label.setVisible(false);
            }
        },
                2000
        );
    }//GEN-LAST:event_panelThreeMouseClicked

    private void mastelisSliderAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mastelisSliderAncestorMoved

    }//GEN-LAST:event_mastelisSliderAncestorMoved

    private void mastelisSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mastelisSliderStateChanged
        mastelisLabel.setText("Mąstelis: 1:" + mastelisSlider.getValue());
    }//GEN-LAST:event_mastelisSliderStateChanged

    Timer timer = new Timer(3000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            panelThree.repaint();
            timer.start();
        }

    });
    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        map.setSleptiNustatymus(1);
        map.setMastelis(mastelisSlider.getValue());
        tech.judejimoGreitis();
        tech.arimas();
        timer.start();
        Ukiniai.setVisible(false);
        ariama.setVisible(false);
        ganyklos.setVisible(false);
        mastelisSlider.setVisible(false);
        mastelisLabel.setVisible(false);
        done.setVisible(false);
        panelThree.repaint();

    }//GEN-LAST:event_doneActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int x = jComboBox1.getSelectedIndex();

        String st = String.format("Gyvuno ID: " + gyvunai.get(x).getId()
                + "%n%n"
                + "Veisle: " + gyvunai.get(x).getVeisle()
                + "%n%n"
                + "Amzius: " + gyvunai.get(x).getAmzius()
                + "%n%n"
                + "Lytis: " + gyvunai.get(x).getLytis()
                + "%n%n"
                + "Suvartojamas maistas: " + gyvunai.get(x).getSuvartojamasMaistas()
                + "%n%n"
                + "Lokacija: " + gyvunai.get(x).getGps()
        );
        jTextArea2.setText(st);
        jTextArea2.setEditable(false);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean x = false;
        try {
            x = prs.prisijungti(jTextField1.getText(), jTextField2.getText());
            if (x == true) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "panelOne");
            } else {
                JOptionPane.showMessageDialog(null, "Neteisingai įvesti prisijungimo duomenys", "Klaida", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(AutoUkis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String miestas;
        int city;
        miestas = (String)jComboBox2.getSelectedItem();
        switch(miestas)
        {
            case "Alytus":
            {
                city = 4152;
                break;
            }
            case "Vilnius":
            {
                city = 4230;
                break;
            }
            case "Kaunas":
            {
                city = 4202;
                break;
            }
            case "Klaipėda":
            {
                city = 4157;
                break;
            }
            case "Panevėžys":
            {
                city = 4175;
                break;
            }
            default:
            {
                city = 0;
            }
        }
        
        jTextArea1.setText(new Orai().weatherToday(city));
        jTextArea3.setText(new Orai().weatherTomorrow(city));
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
    public static void main(String args[]) throws IOException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutoUkis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoUkis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoUkis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoUkis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoUkis().setVisible(true);
            }
        });
    }

    public String[] strin() {
        String[] str = new String[gyvunai.size()];
        for (int i = 0; i < gyvunai.size(); i++) {
            str[i] = "" + gyvunai.get(i).getId();
        }
        return str;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ukiniai;
    private javax.swing.JRadioButton ariama;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEighteen;
    private javax.swing.JButton buttonEleven;
    private javax.swing.JButton buttonFifteen;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonFourteen;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSeventeen;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonSixteen;
    private javax.swing.JButton buttonTen;
    private javax.swing.JButton buttonThirteen;
    private javax.swing.JButton buttonTwelve;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton done;
    private javax.swing.JRadioButton ganyklos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mastelisLabel;
    private javax.swing.JSlider mastelisSlider;
    private javax.swing.JPanel panelEight;
    private javax.swing.JPanel panelEleven;
    private javax.swing.JPanel panelFifteen;
    private javax.swing.JPanel panelFive;
    private javax.swing.JPanel panelFour;
    private javax.swing.JPanel panelFourteen;
    private javax.swing.JPanel panelNine;
    private javax.swing.JPanel panelOne;
    private javax.swing.JPanel panelSeven;
    private javax.swing.JPanel panelSeventeen;
    private javax.swing.JPanel panelSix;
    private javax.swing.JPanel panelSixteen;
    private javax.swing.JPanel panelTen;
    private javax.swing.JPanel panelThirteen;
    private javax.swing.JPanel panelThree;
    private javax.swing.JPanel panelTwelve;
    private javax.swing.JPanel panelTwo;
    private javax.swing.JTextField textFieldFive;
    private javax.swing.JTextField textFieldFour;
    private javax.swing.JTextField textFieldOne;
    private javax.swing.JTextField textFieldSix;
    private javax.swing.JTextField textFieldThree;
    private javax.swing.JTextField textFieldTwo;
    // End of variables declaration//GEN-END:variables
}
