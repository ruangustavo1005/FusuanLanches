package controller;

import dao.Dao;
import exceptions.ExceptionMetodoNaoImplementado;
import java.util.ArrayList;
import model.Pessoa;
import view.View;

/**
 * Controlador da pessoa
 * @author Leonardo Alex Fusinato <leonardo.fusinato@edu.udesc.br>
 */
public class ControllerPessoa extends Controller  {
    
    public static ControllerPessoa instance;
    
    private Dao<Pessoa> pessoas;
    
    public static ControllerPessoa getInstance() {
        if (instance == null) {
            instance = new ControllerPessoa();
        }
        return instance;
    }

    public ControllerPessoa() {
        pessoas = new Dao<>();
    }
    
    @Override
    protected View getInstanceView() throws ExceptionMetodoNaoImplementado {
        throw new ExceptionMetodoNaoImplementado("getInstanceView", this.getClass().getName());
    }
    
    public ArrayList<Pessoa> listar() {
        return this.pessoas.getLista();
    }
    
    protected boolean salvar(Pessoa pessoa) {
        pessoas.add(pessoa);
        return true;
    }
    
}