/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.sensor;

/**
 *
 * @author DELL
 */
public class ManageHelpSeekerProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHelpSeekerProfileJPanel
     */
    public ManageHelpSeekerProfileJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        getAlertFromHH = new javax.swing.JLabel();
        manageVitalSignJBtn = new javax.swing.JButton();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        helpSeekerName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        viewVitalSignHistory = new javax.swing.JButton();
        SendVitalDataToDoctorBtn = new javax.swing.JButton();
        viewVitalSignInfo = new javax.swing.JButton();

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Manage Help Seeker Profile ");

        manageVitalSignJBtn.setText("Manage Vital Signs");
        manageVitalSignJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignJBtnActionPerformed(evt);
            }
        });

        viewAndUpdateProfileBtn.setText("View / Update Profile");
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });

        helpSeekerName.setText("Help Seeker Name");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewVitalSignHistory.setText("View Vital Sign History");
        viewVitalSignHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignHistoryActionPerformed(evt);
            }
        });

        SendVitalDataToDoctorBtn.setText("Send Vital Info To Doctor");
        SendVitalDataToDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendVitalDataToDoctorBtnActionPerformed(evt);
            }
        });

        viewVitalSignInfo.setText("View Vital Sign Info");
        viewVitalSignInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewAndUpdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageVitalSignJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(303, 303, 303)
                            .addComponent(viewVitalSignHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SendVitalDataToDoctorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(viewVitalSignInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(backJButton)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAlertFromHH)
                    .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(viewAndUpdateProfileBtn)
                .addGap(18, 18, 18)
                .addComponent(manageVitalSignJBtn)
                .addGap(18, 18, 18)
                .addComponent(viewVitalSignHistory)
                .addGap(18, 18, 18)
                .addComponent(SendVitalDataToDoctorBtn)
                .addGap(18, 18, 18)
                .addComponent(viewVitalSignInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVitalSignJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignJBtnActionPerformed
        ManageVitalSignJPanel manageVitalSignJPanel = new ManageVitalSignJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVitalSignJPanel", manageVitalSignJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignJBtnActionPerformed

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
        UpdateHelpSeekerProfile viewVolunteerProfile = new UpdateHelpSeekerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewVitalSignHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignHistoryActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ViewVitalSignHistoryJPanel viewVitalSignHistoryJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVitalSignHistoryJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignHistoryActionPerformed

    private void SendVitalDataToDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendVitalDataToDoctorBtnActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SendVitalSignDataToDoctorPanel sendVitalSignDataToDoctorPanel = new SendVitalSignDataToDoctorPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendVitalSignDataToDoctorPanel", sendVitalSignDataToDoctorPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SendVitalDataToDoctorBtnActionPerformed

    private void viewVitalSignInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignInfoActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ViewVitalSignInfoJPanel viewVitalSignInfoJPanel = new ViewVitalSignInfoJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVitalSignInfoJPanel", viewVitalSignInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendVitalDataToDoctorBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JLabel helpSeekerName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageVitalSignJBtn;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    private javax.swing.JButton viewVitalSignHistory;
    private javax.swing.JButton viewVitalSignInfo;
    // End of variables declaration//GEN-END:variables
}