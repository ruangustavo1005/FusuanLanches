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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnNovaComanda = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        imCadastroUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fusuan Lanches");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnNovaComanda.setText("Nova Comanda");

        btnConfiguracoes.setText("Configurações");

        menuCadastros.setText("Cadastros");

        imCadastroUsuario.setText("Usuário");
        menuCadastros.add(imCadastroUsuario);

        jMenuBar1.add(menuCadastros);

        jMenu2.setText("Consultas");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaComanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(btnConfiguracoes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnNovaComanda))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConfiguracoes)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnNovaComanda;
    private javax.swing.JMenuItem imCadastroUsuario;
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
