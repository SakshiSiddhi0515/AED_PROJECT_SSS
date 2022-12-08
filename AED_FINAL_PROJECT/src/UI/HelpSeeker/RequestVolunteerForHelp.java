/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HelpSeeker;

/**
 *
 * @author Sakshi Sasalate
 */
public class RequestVolunteerForHelp extends javax.swing.JPanel {

    /**
     * Creates new form RequestVolunteerForHelp
     */
    public RequestVolunteerForHelp() {
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
        manageEnt2 = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        createRequestButton = new javax.swing.JButton();
        manageEnt3 = new javax.swing.JLabel();
        manageEnt4 = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        firstName = new javax.swing.JLabel();
        viewYourProfile = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        otherHelpPanel = new javax.swing.JPanel();
        helpDetails = new javax.swing.JLabel();
        serviceTypeCombo = new javax.swing.JComboBox();
        helpDetailsTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        serviceType = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestHistoryTable = new javax.swing.JTable();
        manageEnt5 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        helpjTable = new javax.swing.JTable();
        newHelpRadioBtn = new javax.swing.JRadioButton();

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Heart Help");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        manageEnt1.setText("Required Help not in the Table:");

        createRequestButton.setText("Create Request");
        createRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequestButtonActionPerformed(evt);
            }
        });

        manageEnt3.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt3.setText("Help Requests History:");

        manageEnt4.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        manageEnt4.setText("Select the radio button  ");

        LastName.setText("Last Name:");

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        gender.setText("Gender:");

        dobField.setEnabled(false);

        firstName.setText("First Name:");

        viewYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile.setText("Volunteer Details:");

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        dateOfBirth.setText("Date Of Birth ");

        genderField.setEnabled(false);

        helpDetails.setFont(new java.awt.Font("Malayalam MN", 3, 14)); // NOI18N
        helpDetails.setText(" Enter details about the help needed.");

        serviceTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select Amount", "5$", "10$", "15$", "20$" }));

        jLabel1.setText("Enter details of help needed: ");

        serviceType.setText("Service Type");

        org.jdesktop.layout.GroupLayout otherHelpPanelLayout = new org.jdesktop.layout.GroupLayout(otherHelpPanel);
        otherHelpPanel.setLayout(otherHelpPanelLayout);
        otherHelpPanelLayout.setHorizontalGroup(
            otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(otherHelpPanelLayout.createSequentialGroup()
                .add(otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(otherHelpPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(serviceType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(83, 83, 83)
                        .add(otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(serviceTypeCombo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(helpDetailsTxtField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(helpDetails))
                .addContainerGap())
        );
        otherHelpPanelLayout.setVerticalGroup(
            otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(otherHelpPanelLayout.createSequentialGroup()
                .add(helpDetails)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 24, Short.MAX_VALUE)
                .add(otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(helpDetailsTxtField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(otherHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(serviceTypeCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(serviceType))
                .addContainerGap())
        );

        workRequestHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Help Recieved", "Requested Date", "Volunteer ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestHistoryTable);

        manageEnt5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt5.setText("Request Volunteer For Help:");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        helpjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Help ID", "Help Needed", "Help Type", "Help Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(helpjTable);

        newHelpRadioBtn.setText("New Help");
        newHelpRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHelpRadioBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(389, 389, 389)
                        .add(manageEnt2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(manageEnt1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(manageEnt4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(newHelpRadioBtn))
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 482, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(otherHelpPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(347, 347, 347)
                        .add(createRequestButton))
                    .add(backJButton1))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(49, 49, 49)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(firstName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(firstNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(dateOfBirth)
                                            .add(LastName))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(gender)
                                        .add(12, 12, 12)))
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(genderField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, lastNameField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, dobField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(viewYourProfile)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(manageEnt3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 289, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 475, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(38, 38, 38)
                    .add(manageEnt5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(666, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(8, 8, 8)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(manageEnt2)
                        .add(60, 60, 60)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(manageEnt1)
                            .add(manageEnt4)
                            .add(manageEnt3)
                            .add(newHelpRadioBtn)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(viewYourProfile)
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(firstName)
                            .add(firstNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(LastName)
                            .add(lastNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(dateOfBirth)
                            .add(dobField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(genderField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(gender))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(otherHelpPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(33, 33, 33)
                                .add(createRequestButton))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(67, 67, 67)
                                .add(backJButton1))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(40, 40, 40))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(51, 51, 51)
                    .add(manageEnt5)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1054, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 563, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequestButtonActionPerformed

        NeedHelp needHelp;

        if(newHelpRadioBtn.isSelected())
        {

            if(helpDetailsTxtField.getText().trim().isEmpty() || serviceTypeCombo.getSelectedIndex() <0)
            {
                JOptionPane.showMessageDialog(this, "Please Enter data in all the fields ", "warning", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            needHelp = ecoSystem.addNeedHelp();
            needHelp.setHelp("Others");
            needHelp.setNewHelp(helpDetailsTxtField.getText());
            needHelp.setServiceType((String)serviceTypeCombo.getSelectedItem());
        }
        else
        {
            int selectedRow = helpjTable.getSelectedRow();
            if(selectedRow<0)
            {
                JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            needHelp = (NeedHelp)helpjTable.getValueAt(selectedRow, 0);
        }

        SubmitHelpRequestJPanel submitHelpRequestJPanel = new SubmitHelpRequestJPanel(userProcessContainer, userAccount,volunteer, needHelp, organization);
        userProcessContainer.add("SubmitHelpRequestJPanel", submitHelpRequestJPanel);
        newHelpRadioBtn.setSelected(false);
        helpDetailsTxtField.setText("");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_createRequestButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void newHelpRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHelpRadioBtnActionPerformed
        populateComboBxHelpType();
        otherHelpPanel.setVisible(true);
    }//GEN-LAST:event_newHelpRadioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton createRequestButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel helpDetails;
    private javax.swing.JTextField helpDetailsTxtField;
    private javax.swing.JTable helpjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel manageEnt3;
    private javax.swing.JLabel manageEnt4;
    private javax.swing.JLabel manageEnt5;
    private javax.swing.JRadioButton newHelpRadioBtn;
    private javax.swing.JPanel otherHelpPanel;
    private javax.swing.JLabel serviceType;
    private javax.swing.JComboBox serviceTypeCombo;
    private javax.swing.JLabel viewYourProfile;
    private javax.swing.JTable workRequestHistoryTable;
    // End of variables declaration//GEN-END:variables
}
