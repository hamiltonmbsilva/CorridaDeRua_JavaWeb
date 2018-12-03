/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.model.classe;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hamilton
 */
@Entity
@Table(catalog = "evento_esportivos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findByIdevento", query = "SELECT e FROM Evento e WHERE e.idevento = :idevento")
    , @NamedQuery(name = "Evento.findByModalidade", query = "SELECT e FROM Evento e WHERE e.modalidade = :modalidade")
    , @NamedQuery(name = "Evento.findByEstado", query = "SELECT e FROM Evento e WHERE e.estado = :estado")
    , @NamedQuery(name = "Evento.findBySituacao", query = "SELECT e FROM Evento e WHERE e.situacao = :situacao")
    , @NamedQuery(name = "Evento.findByEventodata", query = "SELECT e FROM Evento e WHERE e.eventodata = :eventodata")
    , @NamedQuery(name = "Evento.findByNomeEvento", query = "SELECT e FROM Evento e WHERE e.nomeEvento = :nomeEvento")
    , @NamedQuery(name = "Evento.findByDescricao", query = "SELECT e FROM Evento e WHERE e.descricao = :descricao")
    , @NamedQuery(name = "Evento.findByEventohora", query = "SELECT e FROM Evento e WHERE e.eventohora = :eventohora")
    , @NamedQuery(name = "Evento.findByEquipeevento", query = "SELECT e FROM Evento e WHERE e.equipeevento = :equipeevento")
    , @NamedQuery(name = "Evento.findByIniciopercurso", query = "SELECT e FROM Evento e WHERE e.iniciopercurso = :iniciopercurso")
    , @NamedQuery(name = "Evento.findByFimpercurso", query = "SELECT e FROM Evento e WHERE e.fimpercurso = :fimpercurso")
    , @NamedQuery(name = "Evento.findByTempolimite", query = "SELECT e FROM Evento e WHERE e.tempolimite = :tempolimite")
    , @NamedQuery(name = "Evento.findByInicioInscrica", query = "SELECT e FROM Evento e WHERE e.inicioInscrica = :inicioInscrica")
    , @NamedQuery(name = "Evento.findByValorIncricao", query = "SELECT e FROM Evento e WHERE e.valorIncricao = :valorIncricao")
    , @NamedQuery(name = "Evento.findBySituacaoIncricao", query = "SELECT e FROM Evento e WHERE e.situacaoIncricao = :situacaoIncricao")
    , @NamedQuery(name = "Evento.findBySituacaoUsuario", query = "SELECT e FROM Evento e WHERE e.situacaoUsuario = :situacaoUsuario")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idevento;
    @Column(length = 45)
    private String modalidade;
    @Column(length = 45)
    private String estado;
    private Short situacao;
    @Temporal(TemporalType.DATE)
    private Date eventodata;
    @Column(length = 45)
    private String nomeEvento;
    @Column(length = 45)
    private String descricao;
    @Column(length = 45)
    private String eventohora;
    @Column(length = 45)
    private String equipeevento;
    @Column(length = 45)
    private String iniciopercurso;
    @Column(length = 45)
    private String fimpercurso;
    @Column(length = 45)
    private String tempolimite;
    @Temporal(TemporalType.DATE)
    private Date inicioInscrica;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double valorIncricao;
    private Short situacaoIncricao;
    private Short situacaoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoIdevento")
    private List<Resultado> resultadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoIdevento")
    private List<Usuario> usuarioList;

    public Evento() {
    }

    public Evento(Integer idevento) {
        this.idevento = idevento;
    }

    public Integer getIdevento() {
        return idevento;
    }

    public void setIdevento(Integer idevento) {
        this.idevento = idevento;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Short getSituacao() {
        return situacao;
    }

    public void setSituacao(Short situacao) {
        this.situacao = situacao;
    }

    public Date getEventodata() {
        return eventodata;
    }

    public void setEventodata(Date eventodata) {
        this.eventodata = eventodata;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEventohora() {
        return eventohora;
    }

    public void setEventohora(String eventohora) {
        this.eventohora = eventohora;
    }

    public String getEquipeevento() {
        return equipeevento;
    }

    public void setEquipeevento(String equipeevento) {
        this.equipeevento = equipeevento;
    }

    public String getIniciopercurso() {
        return iniciopercurso;
    }

    public void setIniciopercurso(String iniciopercurso) {
        this.iniciopercurso = iniciopercurso;
    }

    public String getFimpercurso() {
        return fimpercurso;
    }

    public void setFimpercurso(String fimpercurso) {
        this.fimpercurso = fimpercurso;
    }

    public String getTempolimite() {
        return tempolimite;
    }

    public void setTempolimite(String tempolimite) {
        this.tempolimite = tempolimite;
    }

    public Date getInicioInscrica() {
        return inicioInscrica;
    }

    public void setInicioInscrica(Date inicioInscrica) {
        this.inicioInscrica = inicioInscrica;
    }

    public Double getValorIncricao() {
        return valorIncricao;
    }

    public void setValorIncricao(Double valorIncricao) {
        this.valorIncricao = valorIncricao;
    }

    public Short getSituacaoIncricao() {
        return situacaoIncricao;
    }

    public void setSituacaoIncricao(Short situacaoIncricao) {
        this.situacaoIncricao = situacaoIncricao;
    }

    public Short getSituacaoUsuario() {
        return situacaoUsuario;
    }

    public void setSituacaoUsuario(Short situacaoUsuario) {
        this.situacaoUsuario = situacaoUsuario;
    }

    @XmlTransient
    public List<Resultado> getResultadoList() {
        return resultadoList;
    }

    public void setResultadoList(List<Resultado> resultadoList) {
        this.resultadoList = resultadoList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.eventoEsportivo.model.classe.Evento[ idevento=" + idevento + " ]";
    }
    
}
