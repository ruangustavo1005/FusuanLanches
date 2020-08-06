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
    
    private static ControllerUsuario instance;
    
    private Usuario usuario;

    private ControllerUsuario() {
        this.adicionaAcoesTela();
    }

    public static ControllerUsuario getInstance() {
        if (instance == null) {
            instance = new ControllerUsuario();
        }
        
        return instance;
    }
    
    /**
     * Adiciona as ações na tela
     */
    private void adicionaAcoesTela(){
        this.adicionaAcaoCancelar();
    }
    
    /**
     * Adiciona a ação de cancelar na tela
     */
    private void adicionaAcaoCancelar(){
        this.getInstanceView().adicionaAcaoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getInstanceView().setVisible(false);
            }
        });
    }

    @Override
    protected ViewCadastroUsuario getInstanceView() {
        return ViewCadastroUsuario.getInstance();
    }

}