package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Usuario;
import view.ViewCadastroUsuario;

/**
 * Controlador das rotinas de usuário do sistema
 * @author Ruan
 */
public class ControllerUsuario extends Controller {
    
    private ViewCadastroUsuario viewCadastroUsuario;
    
    private Usuario usuario;

    public ControllerUsuario() {
        this.viewCadastroUsuario = new ViewCadastroUsuario();
        this.adicionaAcoesTela();
    }
    
    @Override
    public void montaTela() {
        this.viewCadastroUsuario.setVisible(true);
    }
    
    /**
     * Adiciona as ações na tela
     */
    public void adicionaAcoesTela(){
        this.adicionaAcaoCancelar();
    }
    
    /**
     * Adiciona a ação de cancelar na tela
     */
    public void adicionaAcaoCancelar(){
        this.viewCadastroUsuario.adicionaAcaoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewCadastroUsuario.setVisible(false);
            }
        });
    }

}