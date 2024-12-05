/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Painel;



import ClassesObj.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import ClassesObj.ControleAcesso;
import java.awt.event.KeyEvent;

public class PanEntrada extends javax.swing.JFrame {
    // OBJ CRIADO PARA EXECUTAR AS FINÇÕES DE SALVAR E EXIBIR
     ControleAcesso CA = new ControleAcesso();
    public PanEntrada() {
        initComponents();
        setLocationRelativeTo(null); // CENTRALIZA O PAINEL
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnVerTudo = new javax.swing.JButton();
        txtVH = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO  DE FNCIONÁRIOS");

        btnSair.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("DATA DE ADMISSÃO:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("VALOR HORA: ");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("HORAS TRABALHADAS:");

        txtNome.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVerTudo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnVerTudo.setText("VER TUDO");
        btnVerTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTudoActionPerformed(evt);
            }
        });

        txtVH.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVHActionPerformed(evt);
            }
        });
        txtVH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVHKeyPressed(evt);
            }
        });

        txtHT.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerTudo)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtVH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVerTudo)
                    .addComponent(btnSair))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //CADASTRO DOS FUNCIONÁRIOS
        Funcionario funcionario = new  Funcionario();
        // NOME DO FUNCIONÁRIO
        String nome = txtNome.getText();
        funcionario.setNome(nome);
        
        // DATA DE ADMISSÃO
        String aux = txtData.getText(); // recebe a data do usuário
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = df.parse(aux); // converte o texto em data
            funcionario.setDataAdmissao(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            return; // interrompe a execução caso a data seja inválida
        }

        
        // VALOR HORA
        try {
            float vh = Float.parseFloat(txtVH.getText());
            funcionario.setValorHora(vh);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor hora inválido!");
            return;
        }

        
        // HORAS TRABALHADAS
        try {
            float ht = Float.parseFloat(txtHT.getText());
            funcionario.setHorasTrabalhadas(ht);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas!");
            return;
        }
        
        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Tempo de empresa: " + funcionario.calcularTempoEmpresa()+ " anos");
        System.out.println("Salário a receber: R$ " + String.format("%.2f", funcionario.calcularSalario()));
        
        if(CA.salvar(funcionario)){ // O OBJ CA CHAMA A FUNÇÃO SALVAR QUE RECEBE POR PARAMÊTRO O OBJ FUNCIONÁRIO QUE ACABOU DE SER CRIADO
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            //LIPAR PAINEL DE CADASTRO
            txtNome.setText(" ");
            txtData.setText(" ");
            txtHT.setText(" ");
            txtVH.setText(" ");
            // O CURSOR VOLTA PARA O txtNome
            txtNome.requestFocus();            
        }else{
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário!");  
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVHActionPerformed

    private void btnVerTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTudoActionPerformed
        PanSaida ps = new PanSaida(CA);
        ps.setVisible(true);
    }//GEN-LAST:event_btnVerTudoActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtData.requestFocus();

        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtVH.requestFocus();

        }
    }//GEN-LAST:event_txtDataKeyPressed

    private void txtVHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVHKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHT.requestFocus();

        }
    }//GEN-LAST:event_txtVHKeyPressed

    
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
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerTudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtVH;
    // End of variables declaration//GEN-END:variables
}
