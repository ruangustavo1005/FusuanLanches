package controller;

import view.ViewConsultaPessoa;

/**
 * Controlador da consulta das pessoas
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerConsultaPessoa extends Controller {

    private static ControllerConsultaPessoa instance;

    public ControllerConsultaPessoa() {
        
    }
    
    public static ControllerConsultaPessoa getInstance() {
        if (instance == null) {
            instance = new ControllerConsultaPessoa();
        }
        return instance;
    }
    
    @Override
    public void montaTela() {
        this.getInstanceView().setDadosTableModel(ControllerPessoa.getInstance().listar());
        super.montaTela();
    }
    
    @Override
    protected ViewConsultaPessoa getInstanceView() {
        return ViewConsultaPessoa.getInstance();
    }

}