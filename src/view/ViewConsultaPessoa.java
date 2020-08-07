package view;

/**
 * View de consulta da pessoa
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ViewConsultaPessoa extends View {
    
    public static ViewConsultaPessoa instance;

    private ViewConsultaPessoa() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta d ePessoas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        getInstance().setVisible(true);
    }
    
}