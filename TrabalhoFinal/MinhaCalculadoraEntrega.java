/*
Trabalho final do curso de Introdução à Programação - Pacetech
Pacer Sylvio Carneiro Júnior
Blumenau, SC - 29 de março de 2022
Atualização: 03 abr. 2022
*/
package TrabalhoFinal;


public class MinhaCalculadoraEntrega extends javax.swing.JFrame {

    public double num1,num2, resultado;
    String texto = "";
    public boolean somar = false;
    public boolean subtrair = false;
    public boolean multiplicar = false;
    public boolean dividir = false;
    
    public MinhaCalculadoraEntrega() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botao_somar_ = new javax.swing.JButton();
        botao_subtrair_ = new javax.swing.JButton();
        botao_multiplicar_ = new javax.swing.JButton();
        botao_dividir_ = new javax.swing.JButton();
        botao_igual_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botao_1_ = new javax.swing.JButton();
        botao_3_ = new javax.swing.JButton();
        botao_2_ = new javax.swing.JButton();
        botao_4_ = new javax.swing.JButton();
        botao_5_ = new javax.swing.JButton();
        botao_6_ = new javax.swing.JButton();
        botao_7_ = new javax.swing.JButton();
        botao_8_ = new javax.swing.JButton();
        botao_9_ = new javax.swing.JButton();
        botao_0_ = new javax.swing.JButton();
        botao_pontoDecimal_ = new javax.swing.JButton();
        botao_limpar_ = new javax.swing.JButton();
        botao_sair_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora Pacetech", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 22), new java.awt.Color(255, 255, 255)))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_somar_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_somar_.setText("+");
        botao_somar_.setBorder(javax.swing.BorderFactory.createTitledBorder("Adição"));
        botao_somar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_somar_ActionPerformed(evt);
            }
        });

        botao_subtrair_.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botao_subtrair_.setText("-");
        botao_subtrair_.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtração"));
        botao_subtrair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_subtrair_ActionPerformed(evt);
            }
        });

        botao_multiplicar_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_multiplicar_.setText("x");
        botao_multiplicar_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Multiplicação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        botao_multiplicar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_multiplicar_ActionPerformed(evt);
            }
        });

        botao_dividir_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_dividir_.setText("/");
        botao_dividir_.setBorder(javax.swing.BorderFactory.createTitledBorder("Divisão"));
        botao_dividir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_dividir_ActionPerformed(evt);
            }
        });

        botao_igual_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_igual_.setText("=");
        botao_igual_.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        botao_igual_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_igual_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_subtrair_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_dividir_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_somar_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_multiplicar_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_igual_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_somar_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_subtrair_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_multiplicar_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_dividir_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_igual_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_1_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_1_.setText("1");
        botao_1_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_1_ActionPerformed(evt);
            }
        });

        botao_3_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_3_.setText("3");
        botao_3_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_3_ActionPerformed(evt);
            }
        });

        botao_2_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_2_.setText("2");
        botao_2_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_2_ActionPerformed(evt);
            }
        });

        botao_4_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_4_.setText("4");
        botao_4_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_4_ActionPerformed(evt);
            }
        });

        botao_5_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_5_.setText("5");
        botao_5_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_5_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_5_ActionPerformed(evt);
            }
        });

        botao_6_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_6_.setText("6");
        botao_6_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_6_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_6_ActionPerformed(evt);
            }
        });

        botao_7_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_7_.setText("7");
        botao_7_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_7_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_7_ActionPerformed(evt);
            }
        });

        botao_8_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_8_.setText("8");
        botao_8_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_8_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_8_ActionPerformed(evt);
            }
        });

        botao_9_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_9_.setText("9");
        botao_9_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_9_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_9_ActionPerformed(evt);
            }
        });

        botao_0_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_0_.setText("0");
        botao_0_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_0_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_0_ActionPerformed(evt);
            }
        });

        botao_pontoDecimal_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_pontoDecimal_.setText(".");
        botao_pontoDecimal_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_pontoDecimal_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pontoDecimal_ActionPerformed(evt);
            }
        });

        botao_limpar_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_limpar_.setText("C");
        botao_limpar_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Limpar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        botao_limpar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao_0_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(botao_pontoDecimal_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao_7_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_8_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botao_4_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_5_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(botao_3_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_6_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_9_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_limpar_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_3_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_4_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_5_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_6_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_7_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_8_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_9_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao_0_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_pontoDecimal_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botao_limpar_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_sair_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botao_sair_.setText("Sair");
        botao_sair_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sair_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pacer Sylvio Carneiro Jr - Blumenau, SC.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Curso de Introdução à Programação - fev/mar 2022.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botao_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_1_ActionPerformed
        // BOTÃO 1:
        jTextField1.setText("1");
        texto = texto + "1";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_1_ActionPerformed

    private void botao_2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_2_ActionPerformed
        // BOTÃO 2:
        jTextField1.setText("2");
        texto = texto + "2";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_2_ActionPerformed

    private void botao_3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_3_ActionPerformed
        // BOTÃO 3:
        jTextField1.setText("3");
        texto = texto + "3";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_3_ActionPerformed

    private void botao_4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_4_ActionPerformed
        // BOTÃO 4:
        jTextField1.setText("4");
        texto = texto + "4";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_4_ActionPerformed

    private void botao_5_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_5_ActionPerformed
        // BOTÃO 5:
        jTextField1.setText("5");
        texto = texto + "5";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_5_ActionPerformed

    private void botao_6_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_6_ActionPerformed
        // BOTÃO 6:
        jTextField1.setText("6");
        texto = texto + "6";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_6_ActionPerformed

    private void botao_7_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_7_ActionPerformed
        // BOTÃO 7:
        jTextField1.setText("7");
        texto = texto + "7";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_7_ActionPerformed

    private void botao_8_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_8_ActionPerformed
        // BOTÃO 8:
        jTextField1.setText("8");
        texto = texto + "8";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_8_ActionPerformed

    private void botao_9_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_9_ActionPerformed
        // BOTÃO 9:
        jTextField1.setText("9");
        texto = texto + "9";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_9_ActionPerformed

    private void botao_0_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_0_ActionPerformed
        // BOTÃO 0:
        jTextField1.setText("0");
        texto = texto + "0";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_0_ActionPerformed

    private void botao_pontoDecimal_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pontoDecimal_ActionPerformed
        // BOTÃO PONTO DECIMAL:
        jTextField1.setText(".");
        texto = texto + ".";
        jTextField1.setText(texto);
    }//GEN-LAST:event_botao_pontoDecimal_ActionPerformed

    private void botao_limpar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpar_ActionPerformed
        // BOTÃO "LIMPAR".
        jTextField1.setText("");
        texto = "";
        num1 = num2 = 0;
        somar = subtrair = multiplicar = dividir = false;
    }//GEN-LAST:event_botao_limpar_ActionPerformed

    private void botao_somar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_somar_ActionPerformed
        // Rotina de SOMAR:
        jTextField1.setText("");  // Limpa a tela para a próxima digitação ...
        num1 = Double.parseDouble(texto);
        texto = "";
        somar = true;
    }//GEN-LAST:event_botao_somar_ActionPerformed

    private void botao_subtrair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_subtrair_ActionPerformed
        // Rotina de SUBTRAIR:
        jTextField1.setText("");  // Limpa a tela para a próxima digitação ...
        num1 = Double.parseDouble(texto);
        texto = "";
        subtrair = true;
    }//GEN-LAST:event_botao_subtrair_ActionPerformed

    private void botao_multiplicar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_multiplicar_ActionPerformed
        // Rotina de MULTIPLICAR:
        jTextField1.setText("");  // Limpa a tela para a próxima digitação ...
        num1 = Double.parseDouble(texto);
        texto = "";
        multiplicar = true;
    }//GEN-LAST:event_botao_multiplicar_ActionPerformed

    private void botao_dividir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_dividir_ActionPerformed
        // Rotina de DIVIDIR:
        jTextField1.setText("");  // Limpa a tela para a próxima digitação ...
        num1 = Double.parseDouble(texto);
        texto = "";
        dividir = true;
    }//GEN-LAST:event_botao_dividir_ActionPerformed

    private void botao_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sair_ActionPerformed
        // BOTÃO "SAIR".
        System.exit(0);
    }//GEN-LAST:event_botao_sair_ActionPerformed

    private void botao_igual_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_igual_ActionPerformed
        // Rotina de EXIBIR RESULTADO (=):
        jTextField1.setText("");  // Limpa a tela para a exibição do resultado.
        num2 = Double.parseDouble(texto);  // Leitura do segundo número.
        
        if (somar) {
            resultado = num1 + num2;
        }
        
        if (subtrair) {
            resultado = num1 - num2;
        }
        
        if (multiplicar) {
            resultado = num1 * num2;
        }
        
        if (dividir) {
            resultado = num1 / num2;
        }
        
                                
        jTextField1.setText(String.valueOf(resultado));
        texto = "";
    }//GEN-LAST:event_botao_igual_ActionPerformed

    
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
            java.util.logging.Logger.getLogger(MinhaCalculadoraEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaCalculadoraEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaCalculadoraEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaCalculadoraEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhaCalculadoraEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_0_;
    private javax.swing.JButton botao_1_;
    private javax.swing.JButton botao_2_;
    private javax.swing.JButton botao_3_;
    private javax.swing.JButton botao_4_;
    private javax.swing.JButton botao_5_;
    private javax.swing.JButton botao_6_;
    private javax.swing.JButton botao_7_;
    private javax.swing.JButton botao_8_;
    private javax.swing.JButton botao_9_;
    private javax.swing.JButton botao_dividir_;
    private javax.swing.JButton botao_igual_;
    private javax.swing.JButton botao_limpar_;
    private javax.swing.JButton botao_multiplicar_;
    private javax.swing.JButton botao_pontoDecimal_;
    private javax.swing.JButton botao_sair_;
    private javax.swing.JButton botao_somar_;
    private javax.swing.JButton botao_subtrair_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
