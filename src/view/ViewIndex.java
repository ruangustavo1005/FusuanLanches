package view;

import java.awt.event.ActionListener;

/**
 * Tela principal do sistema
 * @author Ruan
 */
public class ViewIndex extends View {

    private static ViewIndex instance;
    
    private ViewIndex() {
        initComponents();
    }

    public static ViewIndex getInstance() {
        if (instance == null) {
            instance = new ViewIndex();
        }
        return instance;
    }
    
    /**
     * Adiciona o item de cadastro de usuário no menu
     */
    public void adicionaAcaoItemMenuCadastroUsuario(ActionListener actionListener) {
        this.imCadastroUsuario.addActionListener(actionListener);
    }
    
    /**
     * Adiciona o item de cadastro do item no menu
     */
    public void adicionaAcaoItemMenuCadastroItem(ActionListener actionListener) {
        this.imCadastroItem.addActionListener(actionListener);
    }
    
    /**
     * Adiciona a ação de nova comanda
     */
    public void adicionaAcaoNovaComanda(ActionListener actionListener){
        this.btnNovaComanda.addActionListener(actionListener);
    }
    
    /**
     * Adiciona a ação de editar configurações
     */
    public void adicionaAcaoConfiguracoes(ActionListener actionListener){
        this.btnConfiguracoes.addActionListener(actionListener);
    }
    
    /**
     * Adiciona a ação de consultar itens
     */
    public void adicionaAcaoConsultaItem(ActionListener actionListener){
        this.imConsultaItem.addActionListener(actionListener);
    }
    
    /**
     * Adiciona a ação de consultar os usuários
     */
    public void adicionaAcaoConsultaUsuarios(ActionListener actionListener){
        this.imConsultaUsuario.addActionListener(actionListener);
    }
    
    /**
     * Adiciona a ação de cadastrar solicitação de abastecimento
     */
    public void adicionaAcaoCadastroSolicitacaoAbastecimento(ActionListener actionListener){
        this.btnCadastroSolicitacaoAbastecimento.addActionListener(actionListener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnNovaComanda = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        btnCadastroSolicitacaoAbastecimento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        imCadastroUsuario = new javax.swing.JMenuItem();
        imCadastroItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        imConsultaItem = new javax.swing.JMenuItem();
        imConsultaUsuario = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fusuan Lanches");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnNovaComanda.setText("Nova Comanda");

        btnConfiguracoes.setText("Configurações");

        btnCadastroSolicitacaoAbastecimento.setText("Nova Solicitação de Abastecimento");

        menuCadastros.setText("Cadastros");

        imCadastroUsuario.setText("Usuário");
        menuCadastros.add(imCadastroUsuario);

        imCadastroItem.setText("Item");
        menuCadastros.add(imCadastroItem);

        jMenuBar1.add(menuCadastros);

        jMenu2.setText("Consultas");

        imConsultaItem.setText("Itens");
        jMenu2.add(imConsultaItem);

        imConsultaUsuario.setText("Usuários");
        jMenu2.add(imConsultaUsuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovaComanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastroSolicitacaoAbastecimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracoes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfiguracoes)
                    .addComponent(btnCadastroSolicitacaoAbastecimento)
                    .addComponent(btnNovaComanda))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroSolicitacaoAbastecimento;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnNovaComanda;
    private javax.swing.JMenuItem imCadastroItem;
    private javax.swing.JMenuItem imCadastroUsuario;
    private javax.swing.JMenuItem imConsultaItem;
    private javax.swing.JMenuItem imConsultaUsuario;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuCadastros;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        getInstance().setVisible(true);
    }
}
