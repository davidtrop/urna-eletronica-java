package com.mycompany.urnamaicon;

import beans.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Urna extends javax.swing.JFrame {

    ArrayList<Candidato> candidatos = new ArrayList<>();

    int votosAnulados = 0;

    public Urna() {
        initComponents();
        this.setLocationRelativeTo(null);

        // ADIOCIONANDO CANDIDATOS
        candidatos.add(
                new Candidato(
                        456,
                        "Francisco Buarque de Hollanda",
                        "PPCC",
                        new javax.swing.ImageIcon(getClass().getResource("/imgs/chico.jpg"))));
        candidatos.add(
                new Candidato(
                        789,
                        "Antonio C G Belchior Fontenelle Fernandes",
                        "PQNF",
                        new javax.swing.ImageIcon(getClass().getResource("/imgs/belchior.jpg"))));

        // COLOCA IMAGEM DE CANDIDATO NEUTRA
        imgCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/null.png")));

    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPartido = new javax.swing.JLabel();
        imgCandidato = new javax.swing.JLabel();
        btnCandidato1 = new javax.swing.JButton();
        btnCandidato2 = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEncerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShow = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNumero.setText("0");

        jLabel4.setText("Número:");

        jLabel5.setText("Nome:");

        jLabel6.setText("Partido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(55, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                261, Short.MAX_VALUE)
                                                        .addComponent(txtPartido, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addGap(118, 118, 118)
                                .addComponent(imgCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(imgCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39,
                                                                Short.MAX_VALUE)
                                                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32,
                                                                Short.MAX_VALUE)
                                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtPartido, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28,
                                                                Short.MAX_VALUE))))
                                .addContainerGap(32, Short.MAX_VALUE)));

        btnCandidato1.setText("456");
        btnCandidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato1ActionPerformed(evt);
            }
        });

        btnCandidato2.setText("789");
        btnCandidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato2ActionPerformed(evt);
            }
        });

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Brasao.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel16.setText("Justiça Eleitoral de Massachusetts do Oeste");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEncerrar.setText("ENCERRAR VOTAÇÃO");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        txtShow.setColumns(20);
        txtShow.setRows(5);
        jScrollPane1.setViewportView(txtShow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jPanel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(btnCandidato1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(btnCandidato2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnAnular,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        120,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnConfirmar,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        120,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(151, 151, 151)
                                                                .addComponent(jLabel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel16,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 582,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 40, Short.MAX_VALUE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator2)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 208,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(btnCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnConfirmar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(8, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCandidato1ActionPerformed(java.awt.event.ActionEvent evt) {
        // BOTÃO PARA ESCOLHER O CANDIDATO 456

        // INSERINDO DADOS DO CANDIDATO NA TELA
        txtNumero.setText(String.valueOf(candidatos.get(0).getNumero()));
        txtNome.setText(candidatos.get(0).getNome());
        txtPartido.setText(candidatos.get(0).getPartido());
        imgCandidato.setIcon(candidatos.get(0).getFoto());
    }

    private void btnCandidato2ActionPerformed(java.awt.event.ActionEvent evt) {
        // BOTÃO PARAA ESCOLHER O CANDIDATO 789

        // INSERINDO DADOS DO CANDIDATO NA TELA
        txtNumero.setText(String.valueOf(candidatos.get(1).getNumero()));
        txtNome.setText(candidatos.get(1).getNome());
        txtPartido.setText(candidatos.get(1).getPartido());
        imgCandidato.setIcon(candidatos.get(1).getFoto());
    }

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {
        // BOTÃO DE ANULAR VOTO
        votosAnulados++;
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        // BOTÃO DE CONFIRMAR VOTO

        // RECEBENDO NUMERO DO CANDIDATO
        int numeroCandidato = Integer.parseInt(txtNumero.getText());

        // CONDIÇÃO SE FOI SELECIONADO ALGUM CANDIDADO
        if (numeroCandidato == 0) {
            // MENSAGEM DE ERRO PARA NENHUM CANDIDATO SELECIONADO
            JOptionPane.showMessageDialog(null, "Escolha um candidato antes", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            // CONDIÇÃO PARA VERIFICAR QUAL CANDIDATO
            if (numeroCandidato == candidatos.get(0).getNumero()) {
                candidatos.get(0).receberVoto();
            } else {
                candidatos.get(1).receberVoto();
            }

            // RESETANDO PAINEL DE CANDIDO
            txtNumero.setText("0");
            txtNome.setText("");
            txtPartido.setText("");
            imgCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/null.png")));
        }
    }

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {
        // BOTÃO PARA ENCERRAR VOTAÇÃO

        // RECEBNDO SENHA DE CONTROLE
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        // CONDIÇÃO PARA VERIFICAR SENHA
        if (senha.equals("abcd1234")) {
            // IMPRIMINDO RESULTADO DA VOTAÇÃO
            txtShow.append("\n------------------------------------------------\n");
            txtShow.append("\n[ RESULTADO DA VOTAÇÃO ]\n");
            for (Candidato candidato : candidatos) {
                txtShow.append("\n\n[CANDIDATO] " + candidato.getNome() + "\n[VOTOS]: " + candidato.getVotos());
            }
            txtShow.append("\n\n[VOTOS NULOS]:  " + votosAnulados);
            txtShow.append("\n------------------------------------------------");
        } else {
            // IMPRIMINDO ERRO DE SENHA
            JOptionPane.showMessageDialog(null, "Senha inválida", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urna().setVisible(true);
            }
        });
    }

    // VARIÁVEIS DO FRONT
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCandidato1;
    private javax.swing.JButton btnCandidato2;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JLabel imgCandidato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtPartido;
    private javax.swing.JTextArea txtShow;
}
