package controller;

import dao.Dao;
import model.Comanda;
import view.ViewCadastroComanda;

/**
 * Controller da comanda
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerComanda extends Controller{

    private static ControllerComanda instance;
    
    private Comanda comanda;
    
    private Dao<Comanda> daoComanda;
    
    @Override
    protected ViewCadastroComanda getInstanceView() {
        return ViewCadastroComanda.getInstance();
    }

    private ControllerComanda() {
        this.setListasTela();
    }
    
    /**
     * Seta as listas nos campos
     */
    private void setListasTela(){
        this.setaListaItens();
    }
    
    private void setaListaItens(){
        getInstanceView().setListaItens(ControllerItem.getInstance().listar());
    }

    public static ControllerComanda getInstance() {
        if(instance == null){
            instance = new ControllerComanda();
        }
        return instance;
    }
    
}
