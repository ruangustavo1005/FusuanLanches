package view;

import java.util.ArrayList;
import model.Pessoa;

/**
 * View de consulta da pessoa
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ViewConsultaPessoa extends View {
    
    public static ViewConsultaPessoa instance;

    private ViewConsultaPessoa() {
        this.tableModel = new TableModelPadrao(Pessoa.class);
        initComponents();
    }
    
    public static ViewConsultaPessoa getInstance() {
        if (instance == null) {
            instance = new ViewConsultaPessoa();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta d ePessoas");

        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private TableModelPadrao<Pessoa> tableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        getInstance().setVisible(true);
    }
    
    public void setDadosTableModel(ArrayList<Pessoa> pessoas) {
        this.tableModel.setModelos(pessoas);
    }
    
}