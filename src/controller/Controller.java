package controller;

import view.View;

/**
 * Controlador padrão do sistema
 * @author Ruan
 */
public abstract class Controller {
    
//    protected Model model;
    protected abstract View getInstanceView();
    
    public void montaTela(){
        this.getInstanceView().setVisible(true);
    }
    
}