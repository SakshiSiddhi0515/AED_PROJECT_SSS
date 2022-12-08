/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HelpSeeker;

/**
 *
 * @author Sakshi Sasalate
 */
public class HelpSeekerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HelpSeekerWorkArea
     */
    public HelpSeekerWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageHelpSeekerProfile = new javax.swing.JButton();
        writeTestimonialForVolBtn = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        alertsPanel = new javax.swing.JPanel();
        manageHelpFromVolunteer = new javax.swing.JButton();

        manageHelpSeekerProfile.setText("Manage Profile and Vital Signs");
        manageHelpSeekerProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHelpSeekerProfileActionPerformed(evt);
            }
        });

        writeTestimonialForVolBtn.setText("Write Testimonial for Volunteer");
        writeTestimonialForVolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeTestimonialForVolBtnActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Help Seeker Work Area");

        alertsPanel.setBackground(new java.awt.Color(153, 204, 0));

        org.jdesktop.layout.GroupLayout alertsPanelLayout = new org.jdesktop.layout.GroupLayout(alertsPanel);
        alertsPanel.setLayout(alertsPanelLayout);
        alertsPanelLayout.setHorizontalGroup(
            alertsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 509, Short.MAX_VALUE)
        );
        alertsPanelLayout.setVerticalGroup(
            alertsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 497, Short.MAX_VALUE)
        );

        manageHelpFromVolunteer.setText("Manage Help From Volunteer");
        manageHelpFromVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHelpFromVolunteerActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(147, 147, 147)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(writeTestimonialForVolBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(manageHelpSeekerProfile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(manageHelpFromVolunteer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(manageEnt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 306, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(alertsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(alertsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(manageEnt)
                        .add(121, 121, 121)
                        .add(manageHelpSeekerProfile)
                        .add(18, 18, 18)
                        .add(writeTestimonialForVolBtn)
                        .add(18, 18, 18)
                        .add(manageHelpFromVolunteer)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 987, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 573, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageHelpSeekerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHelpSeekerProfileActionPerformed
        ManageHelpSeekerProfileJPanel manageHelpSeekerProfileJPanel = new ManageHelpSeekerProfileJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageHelpSeekerProfileJPanel", manageHelpSeekerProfileJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHelpSeekerProfileActionPerformed

    private void writeTestimonialForVolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeTestimonialForVolBtnActionPerformed

        WriteTestimonialForVolJPanel writeTestimonialForVolJPanel = new WriteTestimonialForVolJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WriteTestimonialForVolJPanel", writeTestimonialForVolJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_writeTestimonialForVolBtnActionPerformed

    private void manageHelpFromVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHelpFromVolunteerActionPerformed
        ManageHelpFromVolunteer manageHelpFromVolunteer = new ManageHelpFromVolunteer(userProcessContainer, userAccount, ecoSystem, enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageHelpFromVolunteer", manageHelpFromVolunteer);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHelpFromVolunteerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageHelpFromVolunteer;
    private javax.swing.JButton manageHelpSeekerProfile;
    private javax.swing.JButton writeTestimonialForVolBtn;
    // End of variables declaration//GEN-END:variables
}
