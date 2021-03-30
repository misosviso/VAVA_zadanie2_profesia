/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.views;

import javax.swing.JOptionPane;
import sk.stu.fiit.controllers.EmployerManagerController;

/**
 *
 * @author Admin
 */
public class ManageEmployerView extends javax.swing.JFrame implements DarkNimbus{
    
    private final EmployerManagerController controller;
    private final int employerIndex;

    /**
     * Creates new form ShowHiredView
     * @param controller
     * @param employerIndex
     */
    public ManageEmployerView(EmployerManagerController controller, int employerIndex) {
        this.controller = controller;
        this.employerIndex = employerIndex;
        initComponents();
        setDarkNimbus();
        displayCompany();
    }
    
    private void displayCompany(){
        this.logoLb.setIcon(this.controller.getLogo(employerIndex, logoLb.getWidth(), logoLb.getHeight()));
        this.cmpNameLb.setText(this.controller.getCompanyName(employerIndex));
        this.sectorLb.setText("Oblasť podnikania:" + this.controller.getCompanySector(employerIndex));
        this.NOPLb.setText("Počet zamestnancov: " + String.valueOf(this.controller.getNOP(employerIndex)));
        displayHired();
    }
    
    private void displayHired(){
        this.hiredSpecialistsList.setModel(this.controller.getHiredSpecialistsModel(employerIndex));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        cmpNameLb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hiredSpecialistsList = new javax.swing.JList<>();
        logoLb = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        cancelHiringBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        sectorLb = new javax.swing.JLabel();
        NOPLb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(450, 350));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmpNameLb.setFont(new java.awt.Font("Segoe WP", 1, 16)); // NOI18N
        cmpNameLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cmpNameLb.setText("Meno spoločnosti");
        jDesktopPane1.add(cmpNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, -1));

        jScrollPane1.setViewportView(hiredSpecialistsList);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 90));

        logoLb.setText("jLabel2");
        jDesktopPane1.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 130));

        jToolBar3.setFloatable(false);
        jToolBar3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar3.setRollover(true);

        cancelHiringBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cancelHiringBtn.setText("Zrušiť prenájom");
        cancelHiringBtn.setFocusable(false);
        cancelHiringBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelHiringBtn.setMinimumSize(new java.awt.Dimension(28, 28));
        cancelHiringBtn.setPreferredSize(new java.awt.Dimension(150, 28));
        cancelHiringBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelHiringBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelHiringBtnMouseReleased(evt);
            }
        });
        jToolBar3.add(cancelHiringBtn);

        goBackBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        goBackBtn.setText("Návrat");
        goBackBtn.setFocusable(false);
        goBackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goBackBtn.setPreferredSize(new java.awt.Dimension(150, 28));
        goBackBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        goBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackBtnMouseReleased(evt);
            }
        });
        jToolBar3.add(goBackBtn);

        jDesktopPane1.add(jToolBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, 60));

        sectorLb.setText("Sektor podnikania");
        jDesktopPane1.add(sectorLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 20));

        NOPLb.setText("Počet zamestnancov");
        jDesktopPane1.add(NOPLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));

        jLabel1.setText("Prenajatí freelanceri");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, -1));

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnMouseReleased
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_goBackBtnMouseReleased

    private void cancelHiringBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelHiringBtnMouseReleased
        // TODO add your handling code here:
        int userInput = JOptionPane.showConfirmDialog(rootPane, "Naozaj chcete zrušiť prenájom?");
        if(userInput == JOptionPane.YES_OPTION){
            int selectedSpecialistIndex = this.hiredSpecialistsList.getSelectedIndex();
            if(selectedSpecialistIndex < 0){
                JOptionPane.showMessageDialog(rootPane, "vyberte špecialistu");
            } else{
                this.controller.unhireSpecialist(employerIndex, selectedSpecialistIndex);
                displayCompany();
            }
        }
    }//GEN-LAST:event_cancelHiringBtnMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOPLb;
    private javax.swing.JButton cancelHiringBtn;
    private javax.swing.JLabel cmpNameLb;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JList<String> hiredSpecialistsList;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel logoLb;
    private javax.swing.JLabel sectorLb;
    // End of variables declaration//GEN-END:variables
}
