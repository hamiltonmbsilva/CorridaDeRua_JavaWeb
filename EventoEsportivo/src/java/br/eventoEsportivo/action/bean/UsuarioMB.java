/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.action.bean;


import br.eventoEsportivo.model.classe.Usuario;
import br.eventoEsportivo.model.dao.imp.UsuarioDao;
import br.eventoEsportivo.util.Crypto;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author aluno
 */
@ManagedBean
@ViewScoped
public class UsuarioMB {

    private Usuario usuario;
    private String segundaSenha;
    
    public void verificaCamposSenha(FacesContext context, UIComponent componente, String value){
        String confereSenha = value;
        
        String senha = (String) ((UIInput) componente.findComponent("senha")).getLocalValue();
        
        if (confereSenha == null || senha == null || !senha.equals(confereSenha)){
            throw new ValidatorException(new FacesMessage("Senhas diferentes"));
        }        
    }
    
    public void verificaSenhaFraca(FacesContext context, UIComponent componente, String value){
        if (!value.matches("^.*(?=.{5,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).*$")) {
            throw new ValidatorException(new FacesMessage("Senha fraca"));
        }
    }
    
    public String salvarUsuario(){        
        usuario.setSenha(Crypto.md5(usuario.getSenha()));
        
        new UsuarioDao().save(usuario);
        FacesContext.getCurrentInstance().addMessage("Usuário", 
                new FacesMessage("Salvo com sucesso!!!"));
        return null;
    }
    
    public UsuarioMB() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getSegundaSenha() {
        return segundaSenha;
    }

    public void setSegundaSenha(String segundaSenha) {
        this.segundaSenha = segundaSenha;
    }
    
    
    
}
