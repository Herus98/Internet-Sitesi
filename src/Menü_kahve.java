/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Men�_kahve extends javax.swing.JFrame {

    /**
     * Creates new form Men�_kahve
     */
    public Men�_kahve() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadio_boyut1 = new javax.swing.JRadioButton();
        jRadio_boyut2 = new javax.swing.JRadioButton();
        jRadio_boyut3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadio_seker1 = new javax.swing.JRadioButton();
        jRadio_seker2 = new javax.swing.JRadioButton();
        jRadio_seker3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadio_yanurun1 = new javax.swing.JRadioButton();
        jRadio_yanurun2 = new javax.swing.JRadioButton();
        jRadio_yanurun3 = new javax.swing.JRadioButton();
        jLbl_hesap = new javax.swing.JLabel();
        jBtn_hesapla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kahvenizi Nas�l Al�rd�n�z?");

        jLabel2.setText("Boyut");

        buttonGroup1.add(jRadio_boyut1);
        jRadio_boyut1.setText("B�y�k");

        buttonGroup1.add(jRadio_boyut2);
        jRadio_boyut2.setText("Orta");

        buttonGroup1.add(jRadio_boyut3);
        jRadio_boyut3.setText("K���k");

        jLabel3.setText("�eker");

        buttonGroup2.add(jRadio_seker1);
        jRadio_seker1.setText("�ok");

        buttonGroup2.add(jRadio_seker2);
        jRadio_seker2.setText("Orta");

        buttonGroup2.add(jRadio_seker3);
        jRadio_seker3.setText("Az");

        jLabel4.setText("Yan �r�n");

        buttonGroup3.add(jRadio_yanurun1);
        jRadio_yanurun1.setText("Kurabiye");

        buttonGroup3.add(jRadio_yanurun2);
        jRadio_yanurun2.setText("�ikolata");

        buttonGroup3.add(jRadio_yanurun3);
        jRadio_yanurun3.setText("S�t");

        jLbl_hesap.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLbl_hesap.setForeground(new java.awt.Color(0, 153, 0));
        jLbl_hesap.setText("HESAP: 0TL");

        jBtn_hesapla.setText("Hesapla");
        jBtn_hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_hesaplaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadio_boyut1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadio_boyut2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadio_boyut3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadio_seker1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadio_seker2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadio_seker3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbl_hesap, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtn_hesapla)
                        .addGap(234, 234, 234))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadio_yanurun1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadio_yanurun2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadio_yanurun3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadio_boyut1)
                                    .addComponent(jRadio_boyut2)
                                    .addComponent(jRadio_boyut3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLbl_hesap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadio_seker1)
                            .addComponent(jRadio_seker2)
                            .addComponent(jRadio_seker3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_hesapla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio_yanurun1)
                    .addComponent(jRadio_yanurun2)
                    .addComponent(jRadio_yanurun3))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_hesaplaActionPerformed
        int hesap = 0;
        if (jRadio_boyut1.isSelected())
        {
            hesap = hesap+20;
        }
        if (jRadio_boyut2.isSelected())
        {
            hesap = hesap+15;
        }
        if (jRadio_boyut3.isSelected())
        {
            hesap = hesap+10;
        }
        if (jRadio_seker1.isSelected())
        {
            hesap = hesap+15;
        }
        if (jRadio_seker2.isSelected())
        {
            hesap = hesap+10;
        }
        if (jRadio_seker3.isSelected())
        {
            hesap = hesap+5;
        }
        if (jRadio_yanurun1.isSelected())
        {
            hesap = hesap+10;
        }
        if (jRadio_yanurun2.isSelected())
        {
            hesap = hesap+8;
        }
        if (jRadio_yanurun3.isSelected())
        {
            hesap = hesap+5;
        }
        
        jLbl_hesap.setText("HESAP: " + hesap + "TL");
    }//GEN-LAST:event_jBtn_hesaplaActionPerformed

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
            java.util.logging.Logger.getLogger(Men�_kahve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Men�_kahve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Men�_kahve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Men�_kahve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Men�_kahve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBtn_hesapla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbl_hesap;
    private javax.swing.JRadioButton jRadio_boyut1;
    private javax.swing.JRadioButton jRadio_boyut2;
    private javax.swing.JRadioButton jRadio_boyut3;
    private javax.swing.JRadioButton jRadio_seker1;
    private javax.swing.JRadioButton jRadio_seker2;
    private javax.swing.JRadioButton jRadio_seker3;
    private javax.swing.JRadioButton jRadio_yanurun1;
    private javax.swing.JRadioButton jRadio_yanurun2;
    private javax.swing.JRadioButton jRadio_yanurun3;
    // End of variables declaration//GEN-END:variables
}
