package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewCadastroComanda;
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
        this.adicionaAcaoNovaComanda();
        this.adicionaAcaoItemMenuCadastroItem();
        this.adicionaAcaoConfiguracoes();
        this.adicionaAcaoConsultarItens();
    }
    
    /**
     * Adiciona a ação de nova comanda
     */
    private void adicionaAcaoNovaComanda(){
        this.getInstanceView().adicionaAcaoNovaComanda(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerComanda.getInstance().montaTela();
            }
        });
    }
    
    /**
     * Adiciona a ação do item menu de cadastro de usuário
     */
    private void adicionaAcaoItemMenuCadastroUsuario(){
        this.getInstanceView().adicionaAcaoItemMenuCadastroUsuario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerUsuario.getInstance().montaTela();
            }
        });
    }
    
    /**
     * Adiciona a ação do item menu de cadastro do item
     */
    private void adicionaAcaoItemMenuCadastroItem() {
        this.getInstanceView().adicionaAcaoItemMenuCadastroItem(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerItem.getInstance().montaTela();
            }
        });
    }

    /**
     * Adiciona a ação do botão de editar configurações
     */
    private void adicionaAcaoConfiguracoes() {
        this.getInstanceView().adicionaAcaoConfiguracoes(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerConfiguracoes.getInstance().montaTela();
                
            }
        });
    }

    /**
     * Adiciona a ação do botão de consultar itens
     */
    private void adicionaAcaoConsultarItens() {
        this.getInstanceView().adicionaAcaoConsultaItem(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerConsultaItem.getInstance().montaTela();
            }
        });
    }
    
    @Override
    protected ViewIndex getInstanceView() {
        return ViewIndex.getInstance();
    }
}
