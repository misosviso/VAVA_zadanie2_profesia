/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.views;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sk.stu.fiit.controllers.EmployerManagerController;

/**
 *
 * @author Admin
 */
public class AddCompanyView extends javax.swing.JFrame {
    
    private final EmployersView parent;
    private final EmployerManagerController controller;

    /**
     * Creates new form AddCompanyView
     * @param parent
     * @param controller
     */
    public AddCompanyView(EmployersView parent, EmployerManagerController controller) {
        this.parent = parent;
        this.controller = controller;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        findLogoBtn1 = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        goMenuBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        sectorTF = new javax.swing.JTextField();
        noeSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logoTA = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(380, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        findLogoBtn1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        findLogoBtn1.setText("Vybra?? logo");
        findLogoBtn1.setPreferredSize(new java.awt.Dimension(100, 28));
        findLogoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                findLogoBtn1MouseReleased(evt);
            }
        });
        jToolBar1.add(findLogoBtn1);

        confirmBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        confirmBtn.setText("Potvrdi??");
        confirmBtn.setPreferredSize(new java.awt.Dimension(80, 28));
        confirmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmBtnMouseReleased(evt);
            }
        });
        jToolBar1.add(confirmBtn);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, 40));

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        goMenuBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        goMenuBtn.setText("N??vrat");
        goMenuBtn.setPreferredSize(new java.awt.Dimension(80, 28));
        jToolBar2.add(goMenuBtn);

        jPanel1.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 40));

        jLabel13.setText("Meno");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));

        jLabel12.setText("Po??et zamestnancov");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel14.setText("Oblas?? podnikania");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));
        jPanel1.add(sectorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, -1));

        noeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10));
        jPanel1.add(noeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vytvori?? nov?? spolo??nos??");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, -1));

        jLabel3.setText("Vybrat?? logo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 30));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        logoTA.setColumns(20);
        logoTA.setRows(5);
        jScrollPane1.setViewportView(logoTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBtnMouseReleased
        // TODO add your handling code here:
        String name = nameTF.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Nezadali ste meno");
            return;
        }
        String sector = sectorTF.getText();
        if(sector.equals("")){
            JOptionPane.showMessageDialog(this, "Nezadali ste oblas?? podnikania");
            return;
        }
        int noe;
        try {
            noe = getNOE();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Zl?? form??t po??tu zamestnancov");
            return;
        }
        String pathToLogo = this.logoTA.getText();
        try {
            this.controller.addEmployer(name, sector, noe, pathToLogo);
            parent.displayEmployers();
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "S??bor sa nepodarilo na????ta??");
        }
        
        
    }//GEN-LAST:event_confirmBtnMouseReleased

    private void findLogoBtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findLogoBtn1MouseReleased
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.logoTA.setText(fileChooser.getSelectedFile().getAbsolutePath());
}
    }//GEN-LAST:event_findLogoBtn1MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton findLogoBtn1;
    private javax.swing.JButton goMenuBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextArea logoTA;
    private javax.swing.JTextField nameTF;
    private javax.swing.JSpinner noeSpinner;
    private javax.swing.JTextField sectorTF;
    // End of variables declaration//GEN-END:variables


    private int getNOE() throws ParseException {
        noeSpinner.commitEdit();
        System.out.println((Integer) noeSpinner.getValue());
        return (Integer) noeSpinner.getValue();
    }
}
