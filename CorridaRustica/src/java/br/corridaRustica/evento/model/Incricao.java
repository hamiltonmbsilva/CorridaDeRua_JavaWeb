/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corridaRustica.evento.model;

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
    @NamedQuery(name = "Incricao.findAll", query = "SELECT i FROM Incricao i")
    , @NamedQuery(name = "Incricao.findByIdincricao", query = "SELECT i FROM Incricao i WHERE i.idincricao = :idincricao")
    , @NamedQuery(name = "Incricao.findByDatainicio", query = "SELECT i FROM Incricao i WHERE i.datainicio = :datainicio")
    , @NamedQuery(name = "Incricao.findByDatafinal", query = "SELECT i FROM Incricao i WHERE i.datafinal = :datafinal")
    , @NamedQuery(name = "Incricao.findByValor", query = "SELECT i FROM Incricao i WHERE i.valor = :valor")
    , @NamedQuery(name = "Incricao.findBySituacao", query = "SELECT i FROM Incricao i WHERE i.situacao = :situacao")
    , @NamedQuery(name = "Incricao.findBySituacaousaurio", query = "SELECT i FROM Incricao i WHERE i.situacaousaurio = :situacaousaurio")})
public class Incricao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idincricao;
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Temporal(TemporalType.DATE)
    private Date datafinal;
    private Integer valor;
    private Short situacao;
    private Short situacaousaurio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "incricao")
    private List<IncricaoHasEvento> incricaoHasEventoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "incricaoIdincricao")
    private List<Usuario> usuarioList;

    public Incricao() {
    }

    public Incricao(Integer idincricao) {
        this.idincricao = idincricao;
    }

    public Integer getIdincricao() {
        return idincricao;
    }

    public void setIdincricao(Integer idincricao) {
        this.idincricao = idincricao;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Short getSituacao() {
        return situacao;
    }

    public void setSituacao(Short situacao) {
        this.situacao = situacao;
    }

    public Short getSituacaousaurio() {
        return situacaousaurio;
    }

    public void setSituacaousaurio(Short situacaousaurio) {
        this.situacaousaurio = situacaousaurio;
    }

    @XmlTransient
    public List<IncricaoHasEvento> getIncricaoHasEventoList() {
        return incricaoHasEventoList;
    }

    public void setIncricaoHasEventoList(List<IncricaoHasEvento> incricaoHasEventoList) {
        this.incricaoHasEventoList = incricaoHasEventoList;
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
        hash += (idincricao != null ? idincricao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incricao)) {
            return false;
        }
        Incricao other = (Incricao) object;
        if ((this.idincricao == null && other.idincricao != null) || (this.idincricao != null && !this.idincricao.equals(other.idincricao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.corridaRustica.evento.model.Incricao[ idincricao=" + idincricao + " ]";
    }
    
}
