package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import model.AbastecimentoItem;
import model.Fornecedor;
import model.Item;
import model.SolicitacaoAbastecimento;
import util.NumberUtils;

/**
 *
 * @author Ruan
 */
public class ViewCadastroSolicitacaoAbastecimento extends View {

    private static ViewCadastroSolicitacaoAbastecimento instance;
    
    private SolicitacaoAbastecimento solicitacaoAbastecimento;
    
    private ViewCadastroSolicitacaoAbastecimento() {
        this.tableModelItens            = new TableModelPadrao(Item.class);
        this.tableModelSolicitacaoItens = new TableModelPadrao(AbastecimentoItem.class);
        this.solicitacaoAbastecimento   = new SolicitacaoAbastecimento();
        initComponents();
        this.formataCampos();
    }

    public static ViewCadastroSolicitacaoAbastecimento getInstance() {
        if (instance == null) {
            instance = new ViewCadastroSolicitacaoAbastecimento();
        }
        
        return instance;
    }
    
    @Override
    public SolicitacaoAbastecimento getModelFromTela() {
        this.solicitacaoAbastecimento.setData("");
        this.solicitacaoAbastecimento.setDataLimite("");
        return this.solicitacaoAbastecimento;
    }

    public void setaDadosTabelaItens(ArrayList<Item> itens) {
        this.tableModelItens.setModelos(itens);
    }
    
    private void formataCampos() {
        this.formataCampo(txtQuantidade, CAMPO_CODIGO, '0');
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        btnAdicionarItem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSolicitacaoItens = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova solicitação de abastecimento");

        jLabel1.setText("Fornecedor:");

        tbItens.setModel(tableModelItens);
        jScrollPane1.setViewportView(tbItens);

        btnAdicionarItem.setText("Adicionar");

        tbSolicitacaoItens.setModel(tableModelSolicitacaoItens);
        jScrollPane2.setViewportView(tbSolicitacaoItens);

        btnRemover.setText("Remover");

        jLabel2.setText("Quantidade:");

        btnFinalizar.setText("Finalizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarItem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemover)
                        .addComponent(btnFinalizar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionarItem)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        getInstance().setVisible(true);
    }

    public void adicionaAcaoAdicionarItem(ActionListener actionListener) {
        this.btnAdicionarItem.addActionListener(actionListener);
    }
    
    public void adicionaAcaoFinalizar(ActionListener actionListener) {
        this.btnFinalizar.addActionListener(actionListener);
    }
    
    public void adicionaAcaoRemover(ActionListener actionListener) {
        this.btnRemover.addActionListener(actionListener);
    }

    public TableModelPadrao<Item> getTableModelItens() {
        return tableModelItens;
    }

    public TableModelPadrao<AbastecimentoItem> getTableModelSolicitacaoItens() {
        return tableModelSolicitacaoItens;
    }

    public JTable getTbItens() {
        return tbItens;
    }

    public JTable getTbSolicitacaoItens() {
        return tbSolicitacaoItens;
    }

    public int getQuantidade() {
        return NumberUtils.parseInt(this.txtQuantidade.getText());
    }
    
    private TableModelPadrao<Item>              tableModelItens;
    private TableModelPadrao<AbastecimentoItem> tableModelSolicitacaoItens;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<Fornecedor> cbFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbItens;
    private javax.swing.JTable tbSolicitacaoItens;
    private javax.swing.JFormattedTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
