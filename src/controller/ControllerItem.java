package controller;

import dao.Dao;
import model.Item;
import view.View;
import view.ViewCadastroItem;

/**
 * Controller do Item
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerItem extends Controller {

    private static ControllerItem instance;
    
    private Item item;
    
    private Dao<Item> daoItem;
    
    @Override
    protected ViewCadastroItem getInstanceView() {
        return ViewCadastroItem.getInstance();
    }
    
}