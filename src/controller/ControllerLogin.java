package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Usuario;
import util.MD5;
import view.ViewLogin;

/**
 * Controlador das rotinas de login do sistema
 * @author Ruan
 */
public class ControllerLogin extends Controller {

    private static ControllerLogin instance;

    private static Usuario usuarioLogado;

    private ControllerLogin() {
        this.adicionaAcoesTela();
    }

    public static ControllerLogin getInstance() {
        if (instance == null) {
            instance = new ControllerLogin();
        }
        
        return instance;
    }
    
    /**
     * Adiciona as ações na tela
     */
    private void adicionaAcoesTela() {
        this.adicionaAcaoEntrarTela();
        this.adicionaAcaoCadastroTela();
    }
    
    /**
     * Adiciona a ação de click de entrar no sistema
     */
    private void adicionaAcaoEntrarTela() {
        this.getInstanceView().adicionaAcaoBotaoEntrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usuario = getInstanceView().getModelFromTela();
                if (validaLogin(usuario)) {
//                  Acho que seria mas persistir antes pra salvar os dados da pessoa, que são mais importantes.
                    usuarioLogado = usuario;
                    getInstanceView().setVisible(false);
                    ControllerMenu.getInstance().montaTela();
                }
                else {
                    getInstanceView().showMensagemDadosIncorretos();
                }
            }
        });
    }
    
    /**
     * Adiciona ação de click de cadastro de usuário
     */
    private void adicionaAcaoCadastroTela(){
        this.getInstanceView().adicionaAcaoBotaoCadastro(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerUsuario.getInstance().montaTela();
            }
        });
    }
    
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        ControllerLogin.usuarioLogado = usuarioLogado;
    }

    private boolean validaLogin(Usuario usuario) {
        boolean retorno = false;
        
        if (usuario.getLogin().equals("123") && usuario.getSenha().equals(MD5.md5("123"))) {
            retorno = true;
        }
        
        return retorno;
    }

    @Override
    protected ViewLogin getInstanceView() {
        return ViewLogin.getInstance();
    }
    
}
