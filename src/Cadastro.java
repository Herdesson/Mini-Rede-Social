
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FLAVIO
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }
    String url = "jdbc:mysql://localhost/cadastro";
    public static String sexo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        getCadNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        getCadSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getDia = new javax.swing.JSpinner();
        getDia1 = new javax.swing.JSpinner();
        getDia2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        sexFem = new javax.swing.JCheckBox();
        sexMasc = new javax.swing.JCheckBox();
        btCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        getCadNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        getCadSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data de nascimento:");

        getDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getDia.setEditor(new javax.swing.JSpinner.NumberEditor(getDia, ""));

        getDia1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getDia1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getDia1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getDia1.setEditor(new javax.swing.JSpinner.NumberEditor(getDia1, ""));

        getDia2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getDia2.setModel(new javax.swing.SpinnerNumberModel(1890, 1890, 2021, 1));
        getDia2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getDia2.setEditor(new javax.swing.JSpinner.NumberEditor(getDia2, ""));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sexo:");

        sexFem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sexFem.setText("Feminino");
        sexFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexFemActionPerformed(evt);
            }
        });

        sexMasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sexMasc.setText("Masculino");
        sexMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexMascActionPerformed(evt);
            }
        });

        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(getCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(getCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(getDia, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                    .addGap(3, 3, 3)
                                    .addComponent(getDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(getDia2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexMasc)
                                .addGap(18, 18, 18)
                                .addComponent(sexFem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btCad)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(getCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(getCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexMasc)
                    .addComponent(sexFem))
                .addGap(32, 32, 32)
                .addComponent(btCad)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sexFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexFemActionPerformed
        // TODO add your handling code here:
        sexMasc.setSelected(false);
        sexo = "F";
    }//GEN-LAST:event_sexFemActionPerformed

    private void sexMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexMascActionPerformed
        // TODO add your handling code here:
        sexFem.setSelected(false);
        sexo = "M";
    }//GEN-LAST:event_sexMascActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        try {
            // TODO add your handling code here:
            String novoNome = getCadNome.getText();
            String novaSenha = getCadSenha.getText();
            int ano = (int) getDia2.getValue();
            int mes = (int) getDia1.getValue();
            int dia = (int) getDia.getValue();            
            String novoNasc = ano+"-"+mes+"-"+dia;
            String insert = "INSERT INTO pessoa(nome, senha, nascimento, sexo) values('"+novoNome+"','"+novaSenha+"','"+novoNasc+"','"+sexo+"')";
            Connection conexao = (Connection) DriverManager.getConnection(url,"root","");
            PreparedStatement atualizar = conexao.prepareStatement(insert);
            atualizar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastrado!");
            dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btCadActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    public static javax.swing.JTextField getCadNome;
    public static javax.swing.JTextField getCadSenha;
    private javax.swing.JSpinner getDia;
    private javax.swing.JSpinner getDia1;
    private javax.swing.JSpinner getDia2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JCheckBox sexFem;
    public static javax.swing.JCheckBox sexMasc;
    // End of variables declaration//GEN-END:variables
}
