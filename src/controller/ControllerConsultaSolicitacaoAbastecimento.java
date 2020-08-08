package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.SolicitacaoAbastecimento;
import view.ViewConsultaSolicitacaoAbastecimento;

/**
 *
 * @author Ruan
 */
public class ControllerConsultaSolicitacaoAbastecimento extends Controller {

    private static ControllerConsultaSolicitacaoAbastecimento instance;

    private ControllerConsultaSolicitacaoAbastecimento() {
        this.setDadosTableModel();
        this.adicionaAcaoDuploCliqueRegistro();
    }

    public static ControllerConsultaSolicitacaoAbastecimento getInstance() {
        if (instance == null) {
            instance = new ControllerConsultaSolicitacaoAbastecimento();
        }
        
        return instance;
    }
    
    private void adicionaAcaoDuploCliqueRegistro() {
        getInstanceView().adicionaAcaoDuploCliqueRegistro(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    ViewConsultaSolicitacaoAbastecimento view = getInstanceView();
                    
                    int indiceSelecionado = view.getTbSolocitacaoAbastecimento().getSelectedRow();
                    
                    ControllerSolicitacaoAbastecimento controllerSolicitacaoAbastecimento = ControllerSolicitacaoAbastecimento.getInstance();
                    
                    SolicitacaoAbastecimento solicitacaoAbastecimento = view.getTableModel().getModelos().get(indiceSelecionado);
                    
                    controllerSolicitacaoAbastecimento.setSolicitacaoAbastecimento(solicitacaoAbastecimento);
                    controllerSolicitacaoAbastecimento.montaTela();
                }
            }
            
        });
    }
    
    private void setDadosTableModel() {
        getInstanceView().setDadosTableModel(ControllerSolicitacaoAbastecimento.getInstance().listar());
    }
    
    @Override
    protected ViewConsultaSolicitacaoAbastecimento getInstanceView() {
        return ViewConsultaSolicitacaoAbastecimento.getInstance();
    }
    
}