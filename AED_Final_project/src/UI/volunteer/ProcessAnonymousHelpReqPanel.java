/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.volunteer;

/**
 *
 * @author DELL
 */
public class ProcessAnonymousHelpReqPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessAnonymousHelpReqPanel
     */
    public ProcessAnonymousHelpReqPanel() {
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
        submitRequest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxtAreaField = new javax.swing.JTextArea();
        needTransport = new javax.swing.JLabel();
        needTransportCombo = new javax.swing.JComboBox();
        requestStatus = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestResultCombo = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();

        submitRequest.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        submitRequest.setText("Process Work Request :");

        jLabel2.setText("Add comments: ");

        commentsTxtAreaField.setColumns(20);
        commentsTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(commentsTxtAreaField);

        needTransport.setText("Need Transport:");

        needTransportCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        requestStatus.setText("Help Request ");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestResultCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(backJButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(requestStatus))
                                            .addGap(50, 50, 50)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(needTransport)
                                            .addGap(50, 50, 50)
                                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(submitJButton)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(submitRequest)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStatus)
                    .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(needTransport)
                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(submitJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewAnonymousRequestJPanel viewAnonymousRequestPanel = (ViewAnonymousRequestJPanel) component;
        viewAnonymousRequestPanel.populateAnonymousHelpRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(requestResultCombo.getSelectedIndex()<0 || commentsTxtAreaField.getText().trim().isEmpty()
            || needTransportCombo.getSelectedIndex()<0     )
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(commentsTxtAreaField.getText().length()>50 )
        {
            JOptionPane.showMessageDialog(null, "Please enter few words in text area", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        request.setRequestResult((String)requestResultCombo.getSelectedItem());
        request.setComments(commentsTxtAreaField.getText());
        request.setStatus(SupervisorWorkRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        String needTransport = (String)needTransportCombo.getSelectedItem();

        JOptionPane.showMessageDialog(null, "Help Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);

        if(needTransport.equals("YES"))
        {
            NeedTransportWorkRequest needTransportWorkRequest = new NeedTransportWorkRequest();
            needTransportWorkRequest.setMessage("Need Transport");
            needTransportWorkRequest.setSender(userAccount);
            needTransportWorkRequest.setStatus("Sent");
            needTransportWorkRequest.setNeedTransport((String)needTransportCombo.getSelectedItem());
            needTransportWorkRequest.setRequestDate(new Date());
            Organization organization = null;
            for(Organization org : od.getOrganizationList())
            {
                if(org instanceof TransportOrganization)
                {
                    organization = org;
                }
            }
            if(organization == null)
            {
                JOptionPane.showMessageDialog(null, "Unable to create transport request! Please create transport organization !!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            organization.getWorkQueue().getWorkRequestList().add(needTransportWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(needTransportWorkRequest);

            JOptionPane.showMessageDialog(null, "Transport Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            commentsTxtAreaField.setText("");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea commentsTxtAreaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel needTransport;
    private javax.swing.JComboBox needTransportCombo;
    private javax.swing.JComboBox requestResultCombo;
    private javax.swing.JLabel requestStatus;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel submitRequest;
    // End of variables declaration//GEN-END:variables
}
