/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
    }

    public static ControllerComanda getInstance() {
        if(instance == null){
            instance = new ControllerComanda();
        }
        return instance;
    }
    
}
