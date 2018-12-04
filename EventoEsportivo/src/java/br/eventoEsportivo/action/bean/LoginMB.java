/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.action.bean;


import br.eventoEsportivo.model.classe.Usuario;
import br.eventoEsportivo.model.dao.imp.UsuarioDao;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author aluno
 */
@ManagedBean
@SessionScoped
public class LoginMB {

    private String login, senha;
    private Usuario userLogado;
    
//    public LoginMB() {
//            
//        
//    }
    @PostConstruct
    public void init(){
        System.out.println("Criou sessão");
    }
    @PreDestroy
    public void destoy(){
        System.out.println("limpou sessão");
    }
    
    
    public String logout(){
       // FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        
        return "index?faces-redirect=true";
        
    }
    
    public String logar(){
        
        userLogado = new UsuarioDao().findByLoginAndSenha(login, senha);
        if (userLogado == null) {
            login = senha = "";
            FacesContext.getCurrentInstance().addMessage("Login", new FacesMessage("Login ou senha incorreta"));
            return "login";
        }else{
            return "login?faces-redirect=true";
        }
        
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUserLogado() {
        return userLogado;
    }

    public void setUserLogado(Usuario userLogado) {
        this.userLogado = userLogado;
    }
    
    
    
}
