/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.views;

/**
 *
 * @author Admin
 */
public class AddSpecialistView extends javax.swing.JFrame implements DarkNimbus{

    /**
     * Creates new form AddSpecialistView
     */
    public AddSpecialistView() {
        initComponents();
        setDarkNimbus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        introPanel = new javax.swing.JPanel();
        typeCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        confirmBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        goMenuBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        infoPanel = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        confirmBtn1 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        goMenuBtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        changingLB1 = new javax.swing.JLabel();
        changingLB2 = new javax.swing.JLabel();
        xpTF = new javax.swing.JTextField();
        eduTF = new javax.swing.JTextField();
        certificatesTF = new javax.swing.JTextField();
        changingTF1 = new javax.swing.JTextField();
        changingTF2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NBUBtn = new javax.swing.JRadioButton();
        MDPanel = new javax.swing.JPanel();
        jToolBar5 = new javax.swing.JToolBar();
        goMenuBtn2 = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        confirmBtn2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel10.setText("jLabel10");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        introPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programátor", "Bezpečnostný konzultant/Špecialista", "Administrátor", " " }));
        introPanel.add(typeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, 30));

        jLabel2.setText("Špecializácia");
        introPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        confirmBtn.setText("Potvrdiť");
        confirmBtn.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar1.add(confirmBtn);

        introPanel.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 80, 40));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Úvod");
        introPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        goMenuBtn.setText("Návrat");
        goMenuBtn.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar2.add(goMenuBtn);

        introPanel.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 90, 40));

        jLabel12.setText("Meno");
        introPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 70, 30));
        introPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, -1));

        jTabbedPane1.addTab("Špecializácia", introPanel);

        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        confirmBtn1.setText("Potvrdiť");
        confirmBtn1.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar3.add(confirmBtn1);

        infoPanel.add(jToolBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 80, 40));

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);

        goMenuBtn1.setText("Návrat");
        goMenuBtn1.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar4.add(goMenuBtn1);

        infoPanel.add(jToolBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 90, 40));

        jLabel5.setText("Dĺžka praxe");
        infoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setText("Najvyššie dosiahnuté vzdelanie");
        infoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setText("Získané certifikáty");
        infoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        infoPanel.add(changingLB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 20));
        infoPanel.add(changingLB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 20));
        infoPanel.add(xpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 160, -1));
        infoPanel.add(eduTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, -1));
        infoPanel.add(certificatesTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, -1));
        infoPanel.add(changingTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, -1));
        infoPanel.add(changingTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Zadajte údaje");
        infoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        NBUBtn.setText("jRadioButton1");
        infoPanel.add(NBUBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 30));

        jTabbedPane1.addTab("Údaje", infoPanel);

        MDPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        goMenuBtn2.setText("Návrat");
        goMenuBtn2.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar5.add(goMenuBtn2);

        MDPanel.add(jToolBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 90, 40));

        jToolBar6.setFloatable(false);
        jToolBar6.setRollover(true);

        confirmBtn2.setText("Potvrdiť");
        confirmBtn2.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar6.add(confirmBtn2);

        MDPanel.add(jToolBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 80, 40));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Určite cenu za Man-Day");
        MDPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(50, 0, null, 5));
        MDPanel.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, -1));

        jLabel11.setText("Cena");
        MDPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jTabbedPane1.addTab("Plat", MDPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 2, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddSpecialistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSpecialistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSpecialistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSpecialistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSpecialistView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MDPanel;
    private javax.swing.JRadioButton NBUBtn;
    private javax.swing.JTextField certificatesTF;
    private javax.swing.JLabel changingLB1;
    private javax.swing.JLabel changingLB2;
    private javax.swing.JTextField changingTF1;
    private javax.swing.JTextField changingTF2;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton confirmBtn1;
    private javax.swing.JButton confirmBtn2;
    private javax.swing.JTextField eduTF;
    private javax.swing.JButton goMenuBtn;
    private javax.swing.JButton goMenuBtn1;
    private javax.swing.JButton goMenuBtn2;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel introPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JTextField nameTF;
    private javax.swing.JComboBox<String> typeCB;
    private javax.swing.JTextField xpTF;
    // End of variables declaration//GEN-END:variables
}
