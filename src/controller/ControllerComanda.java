package controller;

import dao.Dao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Comanda;
import model.ComandaItem;
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
    
    public static ControllerComanda getInstance() {
        if(instance == null){
            instance = new ControllerComanda();
        }
        return instance;
    }

    private ControllerComanda() {
        this.adicionaAcoesTela();
        this.setListasTela();
    }
    
    /**
     * Adiciona as ações na tela
     */
    private void adicionaAcoesTela() {
        this.adicionaAcaoAddItem();
    }
    
    /**
     * Adiciona a ação de adicionar o item
     */
    private void adicionaAcaoAddItem() {
        this.getInstanceView().adicionaAcaoAddItem(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int indice     = getInstanceView().getListaItens().getSelectedIndex(),
                    quantidade = getInstanceView().getQuantidade();
                
                if (indice < 0) {
                    getInstanceView().showMensagem("Selecione um item!");
                }
                else if(quantidade <= 0) {
                    getInstanceView().showMensagem("Informe uma quantidade válida!");
                } else {
                    ComandaItem comandaItem = new ComandaItem();
                    comandaItem.setItem(ControllerItem.getInstance().getItens().getLista().get(indice));
                    comandaItem.setQuantidade(quantidade);
                    comandaItem.setComanda(new Comanda());
//                    comandaItem.setValor(indice); TRATAR SAPORRA       TÁ BÃO

                    getInstanceView().getTableModelComandaItem().getModelos().add(comandaItem);
                    getInstanceView().getTableModelComandaItem().fireTableRowsInserted(indice, indice);
                }
            }
        });
    }
    
    /**
     * Seta as listas nos campos
     */
    private void setListasTela(){
        this.setaListaAtendentes();
        this.setaListaItens();
        this.setaListaClientes();
    }
    
    /**
     * Seta a lista dos atendentes
     */
    private void setaListaAtendentes() {
        getInstanceView().setListaAtendentes(ControllerAtendente.getInstance().listarAtendentes());
    }
    
    /**
     * Seta a lista dos itens
     */
    private void setaListaItens(){
        getInstanceView().setListaItens(ControllerItem.getInstance().listar());
    }
    
    /**
     * Seta a lista de clientes
     */
    private void setaListaClientes() {
        getInstanceView().setListaClientes(ControllerCliente.getInstance().listarClientes());
    }

}