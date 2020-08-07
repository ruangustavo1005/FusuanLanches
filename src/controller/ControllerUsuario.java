package controller;

import dao.Dao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Item;
import model.Usuario;
import view.ViewCadastroUsuario;

/**
 * Controlador das rotinas de usuário do sistema
 * @author Ruan
 */
public class ControllerUsuario extends Controller {
    
    private static ControllerUsuario instance;
    
    private Usuario usuario;
    
    private Dao<Usuario> usuarios;

    private ControllerUsuario() {
        usuarios = new Dao<>();
        this.adicionaAcoesTela();
    }

    public static ControllerUsuario getInstance() {
        if (instance == null) {
            instance = new ControllerUsuario();
        }
        
        return instance;
    }
    
    /**
     * Adiciona as ações na tela
     */
    private void adicionaAcoesTela(){
        this.adicionaAcaoCadastrar();
        this.adicionaAcaoCancelar();
    }
    
    /**
     * Adiciona a ação de cadastrar na tela
     */
    private void adicionaAcaoCadastrar() {
        this.getInstanceView().adicionaAcaoBotaoCadastrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(senhasIguais()){
                    if(salvar()){
                        getInstanceView().showMensagem("Usuário adicionado com sucesso!");
                        getInstanceView().dispose();
                    }else{
                        getInstanceView().showMensagem("Houve um erro ao cadastrar o usuário");
                    }
                }else{
                    getInstanceView().showMensagem("As senhas devem ser iguais!");
                }
            }
        });
    }
    
    private boolean senhasIguais() {
        return getInstanceView().getModelFromTela().getSenha().equals(getInstanceView().getSenhaConfirmacao());
    }
    
    /**
     * Adiciona a ação de cancelar na tela
     */
    private void adicionaAcaoCancelar(){
        this.getInstanceView().adicionaAcaoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getInstanceView().setVisible(false);
            }
        });
    }

    @Override
    protected ViewCadastroUsuario getInstanceView() {
        return ViewCadastroUsuario.getInstance();
    }
    
    /**
     * Salva o item no ArrayList
     * @return boolean
     */
    private boolean salvar() {
        this.usuarios.add(this.getInstanceView().getModelFromTela());
        return true;
    }
    
    public ArrayList<Usuario> listar() {
        return this.usuarios.getLista();
    }

    public Dao<Usuario> getItens() {
        return usuarios;
    }

}