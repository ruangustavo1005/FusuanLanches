package controller;

import view.View;

/**
 * Controlador padrão do sistema
 * @author Ruan
 */
public abstract class Controller {
    
//    protected Model model;
    protected View view;
    
    public abstract void montaTela();
    
}