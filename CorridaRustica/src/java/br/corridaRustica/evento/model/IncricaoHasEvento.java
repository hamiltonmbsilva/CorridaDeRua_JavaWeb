/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corridaRustica.evento.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hamilton
 */
@Entity
@Table(name = "incricao_has_evento", catalog = "evento_esportivos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IncricaoHasEvento.findAll", query = "SELECT i FROM IncricaoHasEvento i")
    , @NamedQuery(name = "IncricaoHasEvento.findByIncricaoIdincricao", query = "SELECT i FROM IncricaoHasEvento i WHERE i.incricaoHasEventoPK.incricaoIdincricao = :incricaoIdincricao")
    , @NamedQuery(name = "IncricaoHasEvento.findByEventoIdevento", query = "SELECT i FROM IncricaoHasEvento i WHERE i.incricaoHasEventoPK.eventoIdevento = :eventoIdevento")
    , @NamedQuery(name = "IncricaoHasEvento.findById", query = "SELECT i FROM IncricaoHasEvento i WHERE i.incricaoHasEventoPK.id = :id")})
public class IncricaoHasEvento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IncricaoHasEventoPK incricaoHasEventoPK;
    @JoinColumn(name = "evento_idevento", referencedColumnName = "idevento", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Evento evento;
    @JoinColumn(name = "incricao_idincricao", referencedColumnName = "idincricao", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Incricao incricao;

    public IncricaoHasEvento() {
    }

    public IncricaoHasEvento(IncricaoHasEventoPK incricaoHasEventoPK) {
        this.incricaoHasEventoPK = incricaoHasEventoPK;
    }

    public IncricaoHasEvento(int incricaoIdincricao, int eventoIdevento, int id) {
        this.incricaoHasEventoPK = new IncricaoHasEventoPK(incricaoIdincricao, eventoIdevento, id);
    }

    public IncricaoHasEventoPK getIncricaoHasEventoPK() {
        return incricaoHasEventoPK;
    }

    public void setIncricaoHasEventoPK(IncricaoHasEventoPK incricaoHasEventoPK) {
        this.incricaoHasEventoPK = incricaoHasEventoPK;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Incricao getIncricao() {
        return incricao;
    }

    public void setIncricao(Incricao incricao) {
        this.incricao = incricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (incricaoHasEventoPK != null ? incricaoHasEventoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IncricaoHasEvento)) {
            return false;
        }
        IncricaoHasEvento other = (IncricaoHasEvento) object;
        if ((this.incricaoHasEventoPK == null && other.incricaoHasEventoPK != null) || (this.incricaoHasEventoPK != null && !this.incricaoHasEventoPK.equals(other.incricaoHasEventoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.corridaRustica.evento.model.IncricaoHasEvento[ incricaoHasEventoPK=" + incricaoHasEventoPK + " ]";
    }
    
}
