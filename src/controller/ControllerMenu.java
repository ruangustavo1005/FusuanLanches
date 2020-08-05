package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewCadastroUsuario;
import view.ViewIndex;

/**
 * Controller do index
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerMenu extends Controller {

    private static ControllerMenu instance;
    
    private ControllerMenu() {
        this.adicionaAcoesTela();
    }

    public static ControllerMenu getInstance() {
        if (instance == null) {
            instance = new ControllerMenu();
        }
        
        return instance;
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
                ControllerUsuario.getInstance().montaTela();
            }
        });
    }

    @Override
    protected ViewIndex getInstanceView() {
        return ViewIndex.getInstance();
    }
}