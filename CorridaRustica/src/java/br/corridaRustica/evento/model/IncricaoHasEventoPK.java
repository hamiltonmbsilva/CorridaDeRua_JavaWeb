/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corridaRustica.evento.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hamilton
 */
@Embeddable
public class IncricaoHasEventoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "incricao_idincricao", nullable = false)
    private int incricaoIdincricao;
    @Basic(optional = false)
    @Column(name = "evento_idevento", nullable = false)
    private int eventoIdevento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int id;

    public IncricaoHasEventoPK() {
    }

    public IncricaoHasEventoPK(int incricaoIdincricao, int eventoIdevento, int id) {
        this.incricaoIdincricao = incricaoIdincricao;
        this.eventoIdevento = eventoIdevento;
        this.id = id;
    }

    public int getIncricaoIdincricao() {
        return incricaoIdincricao;
    }

    public void setIncricaoIdincricao(int incricaoIdincricao) {
        this.incricaoIdincricao = incricaoIdincricao;
    }

    public int getEventoIdevento() {
        return eventoIdevento;
    }

    public void setEventoIdevento(int eventoIdevento) {
        this.eventoIdevento = eventoIdevento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) incricaoIdincricao;
        hash += (int) eventoIdevento;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IncricaoHasEventoPK)) {
            return false;
        }
        IncricaoHasEventoPK other = (IncricaoHasEventoPK) object;
        if (this.incricaoIdincricao != other.incricaoIdincricao) {
            return false;
        }
        if (this.eventoIdevento != other.eventoIdevento) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.corridaRustica.evento.model.IncricaoHasEventoPK[ incricaoIdincricao=" + incricaoIdincricao + ", eventoIdevento=" + eventoIdevento + ", id=" + id + " ]";
    }
    
}
