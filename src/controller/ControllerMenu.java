package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;
import view.ViewCadastroUsuario;
import view.ViewIndex;

/**
 * Controller do index
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerMenu extends Controller {

    private ControllerLogin controllerLogin;
    
    public ControllerMenu() {
        this.controllerLogin = new ControllerLogin();
        this.adicionaAcoesTela();
    }

    @Override
    public void montaTela() {
        this.getInstanceView().setVisible(true);
        this.getInstanceView().setEnabled(false);
        this.controllerLogin.montaTela();
    }

    /**
     * Adiciona as ações na tela
     */
    private void adicionaAcoesTela() {
        this.adicionaAcaoItemMenuCadastroUsuario();
    }
    
    /**
     * Adiciona a ação do item menu de cadastro de usuário
     */
    public void adicionaAcaoItemMenuCadastroUsuario(){
        this.getInstanceView().adicionaAcaoItemMenuCadastroUsuario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ViewCadastroUsuario.getInstance().setVisible(true);
            }
        });
    }

    @Override
    protected ViewIndex getInstanceView() {
        return ViewIndex.getInstance();
    }
}