/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.action.bean;

import br.eventoEsportivo.action.bean.status.EstatusCrud;
import br.eventoEsportivo.model.classe.Evento;
import br.eventoEsportivo.model.classe.Resultado;
import br.eventoEsportivo.model.dao.imp.EventoDAO;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hamilton
 */
@ManagedBean
@ViewScoped
public class EventoMB {
    
    private EstatusCrud status;
    private Date dataInicio, dataFim;    
    private List<Resultado> resultado;
    private List<Evento> meusEventos;
    private Evento evento;
    @ManagedProperty("#{loginMB}")
    private LoginMB loginMB;
    
    @PostConstruct
    public void init(){
    
        if(loginMB == null || loginMB.getUserLogado() == null){
        
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(EventoMB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        changeStatusView();
        
    }

    private void changeStatusView() {
       
        status = EstatusCrud.view;
        meusEventos = new EventoDAO().meusEventos(loginMB.getUserLogado());
    }
    
    public String pesquisa(){
        if (dataInicio == null || dataFim == null) {
            meusEventos = new EventoDAO().meusEventos(loginMB.getUserLogado());
        }else{
        status = EstatusCrud.view;
        meusEventos = new EventoDAO().pesquisaMeusEventos(loginMB.getUserLogado(), dataInicio, dataFim);
        }
        return "";
    }
    
    public String callSaveMode(){
        if (status == EstatusCrud.insert) {
            new EventoDAO().save(evento);    
            FacesContext.getCurrentInstance().addMessage("EVENTO", new FacesMessage("Salvo com sucesso"));
        }else if (status == EstatusCrud.edit) {
            new EventoDAO().edit(evento);
            FacesContext.getCurrentInstance().addMessage("EVENTO", new FacesMessage("Alterado com sucesso"));
        }        
        changeStatusView();
        return "";
    }
    
    public String callDetalheMode(Evento evtSelecionado){
        status = EstatusCrud.details;
        evento = evtSelecionado;
        return "";
    }
    
    public String callDeleteMode(Evento evtSelecionado){
        new EventoDAO().delete(evtSelecionado);
        changeStatusView();
        return "";
    }
    
    public String callEditMode(Evento evtSelecionado){
        status = EstatusCrud.edit;
        evento = evtSelecionado;
        return "";
    }
    
    public String callInsertMode(){
        status = EstatusCrud.insert;
        evento = new Evento();
//        evento.se(loginMB.getUserLogado());
        evento.setEventodata(new Date());
//        evento.setTipoEvento(new TipoAtividade());
        return "";
    }
    
    public String callViewMode(){
        status = EstatusCrud.view;
        return "";
    }
    
    

    public EstatusCrud getStatus() {
        return status;
    }

    public void setStatus(EstatusCrud status) {
        this.status = status;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

  

    public List<Resultado> getResultado() {
        return resultado;
    }

    public void setResultado(List<Resultado> resultado) {
        this.resultado = resultado;
    }

    public List<Evento> getMeusEventos() {
        return meusEventos;
    }

    public void setMeusEventos(List<Evento> meusEventos) {
        this.meusEventos = meusEventos;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LoginMB getLoginMB() {
        return loginMB;
    }

    public void setLoginMB(LoginMB loginMB) {
        this.loginMB = loginMB;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    
    
    
}
