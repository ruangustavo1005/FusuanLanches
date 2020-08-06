package controller;

import dao.Dao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Configuracoes;
import view.View;
import view.ViewConfiguracoes;

/**
 *
 * @author Ruan
 */
public class ControllerConfiguracoes extends Controller {

    private static ControllerConfiguracoes instance;

    private Dao<Configuracoes> configuracoes;
    
    private ControllerConfiguracoes() {
        this.configuracoes = new Dao<>();
        this.adicionaAcoes();
    }

    public static ControllerConfiguracoes getInstance() {
        if (instance == null) {
            instance = new ControllerConfiguracoes();
        }
        
        return instance;
    }
    
    @Override
    protected ViewConfiguracoes getInstanceView() {
        return ViewConfiguracoes.getInstance();
    }
    
    private void adicionaAcoes() {
        this.adicionaAcaoSalvar();
    }
    
    private void adicionaAcaoSalvar() {
        this.getInstanceView().adicionaAcaoBotaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (salvar()) {
                    getInstanceView().showMensagem("Configuracoes salvas com sucesso!");
                    getInstanceView().setVisible(false);
                }
                else {
                    getInstanceView().showMensagem("Houve um erro ao salvar suas configurações.");
                }
            }
        });
    }
    
    private boolean salvar() {
        this.configuracoes.add(this.getInstanceView().getModelFromTela());
        
        return true;
    }
    
}