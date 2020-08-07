package controller;

import dao.Dao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.SolicitacaoAbastecimento;
import view.ViewCadastroSolicitacaoAbastecimento;

/**
 *
 * @author Ruan
 */
public class ControllerSolicitacaoAbastecimento extends Controller {

    private static ControllerSolicitacaoAbastecimento instance;

    private Dao<SolicitacaoAbastecimento> dao;
    
    private ControllerSolicitacaoAbastecimento() {
        this.dao = new Dao<>();
        this.getInstanceView().setaDadosTabelaItens(ControllerItem.getInstance().listar());
        this.adicionaAcoesTela();
    }

    public static ControllerSolicitacaoAbastecimento getInstance() {
        if (instance == null) {
            instance = new ControllerSolicitacaoAbastecimento();
        }
        
        return instance;
    }

    private void adicionaAcoesTela() {
        this.adicionaAcaoAdicionarItem();
        this.adicionaAcaoFinalizar();
        this.adicionaAcaoRemover();
    }
    
    private void adicionaAcaoAdicionarItem() {
        this.getInstanceView().adicionaAcaoAdicionarItem(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void adicionaAcaoFinalizar() {
        this.getInstanceView().adicionaAcaoFinalizar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (salvar(getInstanceView().getModelFromTela())) {
                    getInstanceView().showMensagem("Solicação de Abastecimento incluída com sucesso!");
                    getInstanceView().dispose();
                }
                else {
                    getInstanceView().showMensagem("Houve um erro ao cadastrar a solicitação de abastecimento.");
                }
            }
        });
    }
    
    private void adicionaAcaoRemover() {
        this.getInstanceView().adicionaAcaoRemover(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private boolean salvar(SolicitacaoAbastecimento solicitacaoAbastecimento) {
        this.dao.add(solicitacaoAbastecimento);
        
        return true;
    }
    
    @Override
    protected ViewCadastroSolicitacaoAbastecimento getInstanceView() {
        return ViewCadastroSolicitacaoAbastecimento.getInstance();
    }

}