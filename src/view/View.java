package view;

import exceptions.ExceptionMetodoNaoImplementado;
import javax.swing.JOptionPane;

/**
 * Classe abstrata da View
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public abstract class View extends javax.swing.JFrame implements Runnable {

    protected View() {
        initComponents();
    }
    
    /**
     * Retorna o modelo com os dados setados da tela.
     * @throws ExceptionMetodoNaoImplementado dispara caso seja chamado por um controlador sem ter sido implementado
     */
    public Object getModelFromTela() throws ExceptionMetodoNaoImplementado {
        throw new ExceptionMetodoNaoImplementado("getModelFromTela", this.getClass().getName());
    }
    
    /**
     * Retorna o modelo com os dados setados da tela.
     * @throws ExceptionMetodoNaoImplementado dispara caso seja chamado por um controlador sem ter sido implementado
     */
    public void setModelTela() throws ExceptionMetodoNaoImplementado {
        throw new ExceptionMetodoNaoImplementado("setModelTela", this.getClass().getName());
    }

    /**
     * Dispara uma mensagem
     */
    public void showMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
