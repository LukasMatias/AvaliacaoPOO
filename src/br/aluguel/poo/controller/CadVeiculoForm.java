package br.aluguel.poo.controller;

import br.aluguel.poo.model.dao.ConexaoBD;
import br.aluguel.poo.model.dao.VeiculoDao;
import br.aluguel.poo.model.entidades.Veiculo;
import br.aluguel.poo.model.services.ValidacoesService;
import br.aluguel.poo.model.services.VeiculoService;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author lukas
 */
public class CadVeiculoForm extends javax.swing.JFrame {

    Veiculo v = new Veiculo();
    VeiculoService service = new VeiculoService();
    ConexaoBD conecta = new ConexaoBD();

    public CadVeiculoForm() throws SQLException {
        initComponents();
        listarVeiculos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLayoutCadastro = new javax.swing.JPanel();
        jPanelCadstro = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelTanque = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelKM = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelTipoVeic = new javax.swing.JLabel();
        jLabelDisponibilidade = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jFormattedTextFieldPlaca = new javax.swing.JFormattedTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jTextFieldKM = new javax.swing.JTextField();
        jComboBoxDisponibilidade = new javax.swing.JComboBox<>();
        jComboBoxTanque = new javax.swing.JComboBox<>();
        jTextFieldAno = new javax.swing.JTextField();
        jLabelTipoVeicModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisar = new javax.swing.JLabel();
        jComboBoxPesquisar = new javax.swing.JComboBox<>();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLayoutCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelCadstro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelCodigo.setText("Código:");

        jLabelTanque.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelTanque.setText("Tanque:");

        jLabelMarca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMarca.setText("Marca:");

        jLabelKM.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelKM.setText("Kilometragem:");

        jLabelAno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelAno.setText("Ano:");

        jLabelPlaca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelPlaca.setText("Placa:");

        jLabelTipoVeic.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelTipoVeic.setText("Tipo de Veículo:");

        jLabelDisponibilidade.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDisponibilidade.setText("Disponibilidade:");

        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldMarca.setEnabled(false);

        jFormattedTextFieldPlaca.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "ECONÔMICO", "SEDAN", "SUV", "PRÊMIUM" }));
        jComboBoxTipo.setEnabled(false);

        jTextFieldKM.setEnabled(false);

        jComboBoxDisponibilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "DISPONÍVEL", "INDISPONÍVEL" }));
        jComboBoxDisponibilidade.setEnabled(false);

        jComboBoxTanque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "VAZIO ", "CHEIO ", "METADE (1/2)", "UM QUARTO (1/4)", "TRES QUARTO (3/4)" }));
        jComboBoxTanque.setEnabled(false);

        jTextFieldAno.setEnabled(false);

        jLabelTipoVeicModelo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelTipoVeicModelo.setText("Modelo:");

        jTextFieldModelo.setEnabled(false);

        javax.swing.GroupLayout jPanelCadstroLayout = new javax.swing.GroupLayout(jPanelCadstro);
        jPanelCadstro.setLayout(jPanelCadstroLayout);
        jPanelCadstroLayout.setHorizontalGroup(
            jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadstroLayout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanelCadstroLayout.createSequentialGroup()
                        .addComponent(jLabelTanque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTanque, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDisponibilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanelCadstroLayout.createSequentialGroup()
                        .addComponent(jLabelTipoVeic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelKM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKM, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTipoVeicModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCadstroLayout.setVerticalGroup(
            jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelAno)
                    .addComponent(jLabelPlaca)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoVeic)
                    .addComponent(jLabelKM)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoVeicModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelCadstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTanque)
                    .addComponent(jLabelDisponibilidade)
                    .addComponent(jComboBoxDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar "));

        jLabelPesquisar.setText("Pesquisar por:");

        jComboBoxPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "MARCA E MODELO", "PREÇO", "CATEGORIA", " " }));
        jComboBoxPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MARCA", "MODELO", "ANO", "DISPONIBILIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addComponent(jLabelPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisar)
                    .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jButtonSalvar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSair))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonSair))
        );

        javax.swing.GroupLayout jPanelLayoutCadastroLayout = new javax.swing.GroupLayout(jPanelLayoutCadastro);
        jPanelLayoutCadastro.setLayout(jPanelLayoutCadastroLayout);
        jPanelLayoutCadastroLayout.setHorizontalGroup(
            jPanelLayoutCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayoutCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayoutCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCadstro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayoutCadastroLayout.setVerticalGroup(
            jPanelLayoutCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayoutCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelLayoutCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLayoutCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void validacao() {

        if (jComboBoxTipo.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Por favor, Selecione um tipo de veículo válido!");
            return;
        }
        if (jComboBoxTanque.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Por favor, Selecione o status do tanque do veículo!");
            return;
        }
        if (jComboBoxDisponibilidade.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Por favor, Selecione a Disponibilidade do veículo!");
            return;
        }
        if (jTextFieldMarca.getText().trim().equals("") || jTextFieldMarca.getText().matches(".*[0-9].*")) {
            JOptionPane.showMessageDialog(null, "Por favor, informe uma marca válida para o veículo!");
            return;
        }
        if (jTextFieldAno.getText().trim().equals("") || jTextFieldAno.getText().matches(".*[a-z].*")
                || jTextFieldAno.getText().matches(".*[,].*") || jTextFieldAno.getText().trim().length() != 4) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o ano válido do veículo!");
            return;
        }
        if (jFormattedTextFieldPlaca.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, informe a placa do veículo!");
            return;
        }
        if (jTextFieldKM.getText().trim().equals("") || jTextFieldKM.getText().matches(".*[a-z].*") || jTextFieldKM.getText().matches(".*[,].*")) {
            JOptionPane.showMessageDialog(null, "Por favor, informe a Kilometragem Correta do veículo!");
            return;
        }
        if (jTextFieldModelo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o modelo do veículo!");
            return;
        }

    }

    public void limparCampos() {
        jTextFieldCodigo.setText("");
        jTextFieldMarca.setText("");
        jTextFieldAno.setText("");
        jFormattedTextFieldPlaca.setText("");
        jTextFieldKM.setText("");
        jTextFieldModelo.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        jComboBoxTanque.setSelectedIndex(0);
        jComboBoxDisponibilidade.setSelectedIndex(0);
    }

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        validacao();
        v.setIdVeiculo(jTextFieldCodigo.getText());
        v.setMarca(jTextFieldMarca.getText());
        v.setAno(jTextFieldAno.getText());
        v.setPlaca(jFormattedTextFieldPlaca.getText());
        v.setTipo((String) jComboBoxTipo.getSelectedItem());
        v.setKilometragem(Float.parseFloat(jTextFieldKM.getText()));
        v.setModelo(jTextFieldModelo.getText());
        v.setTanque((String) jComboBoxTanque.getSelectedItem());
        v.setDisponibilidade((String) jComboBoxDisponibilidade.getSelectedItem());

        try {
            if (v.getIdVeiculo().equals("")) {
                service.incluir(v);
            }
            listarVeiculos();
        } catch (SQLException ex) {
            Logger.getLogger(CadVeiculoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int rsp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o produto?", "Excluir Produto",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (rsp == JOptionPane.YES_OPTION) {
            v.setIdVeiculo(jTextFieldCodigo.getText());
            try {
                service.excluir(v);
                listarVeiculos();
                limparCampos();
                jTextFieldMarca.setEnabled(false);
                jTextFieldAno.setEnabled(false);
                jFormattedTextFieldPlaca.setEnabled(false);
                jTextFieldMarca.setEnabled(false);
                jTextFieldKM.setEnabled(false);
                jTextFieldAno.setEnabled(false);
                jTextFieldModelo.setEnabled(false);
                jFormattedTextFieldPlaca.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jComboBoxTanque.setEnabled(false);
                jComboBoxDisponibilidade.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonNovo.setEnabled(true);

            } catch (SQLException ex) {
                Logger.getLogger(CadVeiculoForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (jTable1.getSelectedRow() != 1) {
                DefaultTableModel dtmProdutos = (DefaultTableModel) jTable1.getModel();
                dtmProdutos.removeRow(jTable1.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um Vículo pra excluir");
            }
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTextFieldMarca.setEnabled(true);
        jTextFieldAno.setEnabled(true);
        jFormattedTextFieldPlaca.setEnabled(true);
        jTextFieldMarca.setEnabled(true);
        jTextFieldKM.setEnabled(true);
        jTextFieldAno.setEnabled(true);
        jTextFieldModelo.setEnabled(true);
        jFormattedTextFieldPlaca.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jComboBoxTanque.setEnabled(true);
        jComboBoxDisponibilidade.setEnabled(true);
        String id = "" + jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        try {
            conecta.conectar();
            conecta.executaSQL("select * from veiculo where ID ='" + id + "'");
            conecta.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("ID")));
            jTextFieldMarca.setText(conecta.rs.getString("MARCA"));
            jTextFieldAno.setText(conecta.rs.getString("ANO"));
            jFormattedTextFieldPlaca.setText(conecta.rs.getString("PLACA"));
            jComboBoxTipo.setSelectedItem(conecta.rs.getString("TIPO"));
            jTextFieldMarca.setText(conecta.rs.getString("marca"));
            jTextFieldKM.setText(String.valueOf(conecta.rs.getFloat("KILOMETRAGEM")));
            jTextFieldModelo.setText((conecta.rs.getString("MODELO")));
            jComboBoxTanque.setSelectedItem(conecta.rs.getString("TANQUE"));
            jComboBoxDisponibilidade.setSelectedItem(conecta.rs.getString("DISPONIBILIDADE"));
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar dados" + ex);
        }
        conecta.desconectar();

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldMarca.setEnabled(true);
        jTextFieldAno.setEnabled(true);
        jFormattedTextFieldPlaca.setEnabled(true);
        jTextFieldMarca.setEnabled(true);
        jTextFieldKM.setEnabled(true);
        jTextFieldAno.setEnabled(true);
        jTextFieldModelo.setEnabled(true);
        jFormattedTextFieldPlaca.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jComboBoxTanque.setEnabled(true);
        jComboBoxDisponibilidade.setEnabled(true);
        limparCampos();
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSair.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonVoltar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        limparCampos();
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jButtonSair.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonVoltar.setEnabled(true);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        validacao();
        v.setIdVeiculo(jTextFieldCodigo.getText().trim());
        v.setMarca(jTextFieldMarca.getText());
        v.setAno(jTextFieldAno.getText());
        v.setPlaca(jFormattedTextFieldPlaca.getText());
        v.setTipo((String) jComboBoxTipo.getSelectedItem());
        v.setKilometragem(Float.parseFloat(jTextFieldKM.getText()));
        v.setModelo(jTextFieldModelo.getText());
        v.setTanque((String) jComboBoxTanque.getSelectedItem());
        v.setDisponibilidade((String) jComboBoxDisponibilidade.getSelectedItem());
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jButtonSair.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonVoltar.setEnabled(true);
        try {
            service.alterar(v);
            listarVeiculos();
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(CadVeiculoForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null, "Finalizando...");
        JOptionPane.showMessageDialog(null, "Programa Finalizado!");
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        FormInicio abrirInicio = new FormInicio();
        abrirInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPesquisarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        if (jComboBoxPesquisar.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Opção Invalida, Selecione uma das opções abaixo!");
        }
        if (jComboBoxPesquisar.getSelectedItem().equals("<MARCA E MODELO>")) {
            try {
                preencherMarca(jTextFieldPesquisar.getText());
            } catch (SQLException ex) {
                Logger.getLogger(CadVeiculoForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    public void listarVeiculos() throws SQLException {

        List<Veiculo> resultados = service.listar();
        Vector resultadoVector = new Vector<>();
        for (Veiculo v : resultados) {
            Vector<Object> linha = new Vector<>();
            linha.add(v.getIdVeiculo());
            linha.add(v.getMarca());
            linha.add(v.getModelo());
            linha.add(v.getAno());
            linha.add(v.getDisponibilidade());

            resultadoVector.add(linha);
        }

        Vector<String> colunasVector = new Vector(Arrays.asList("ID", "MARCA", "MODELO", "ANO", "DISPONIBILIDADE"));

        // Adicionar resultados no jTable1
        jTable1.removeAll();

        TableModel model = new DefaultTableModel(resultadoVector, colunasVector) {
            @Override
            public Class getColumnClass(int column) {
                for (int row = 0; row < getRowCount(); row++) {
                    Object o = getValueAt(row, column);
                    if (o != null) {
                        return o.getClass();
                    }
                }
                return Object.class;
            }
        };
        jTable1.setModel(model);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadVeiculoForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadVeiculoForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxDisponibilidade;
    private javax.swing.JComboBox<String> jComboBoxPesquisar;
    private javax.swing.JComboBox<String> jComboBoxTanque;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPlaca;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDisponibilidade;
    private javax.swing.JLabel jLabelKM;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTanque;
    private javax.swing.JLabel jLabelTipoVeic;
    private javax.swing.JLabel jLabelTipoVeicModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadstro;
    private javax.swing.JPanel jPanelLayoutCadastro;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldKM;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables

    private void preencherMarca(String text) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        VeiculoDao dao = new VeiculoDao();

        for (Veiculo v : dao.listar()) {
            modelo.addRow(new Object[]{
                v.getIdVeiculo(),
                v.getMarca(),
                v.getModelo(),
                v.getTipo()
            });
        }
    }
}
