/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corridaRustica.evento.model;

import java.io.Serializable;
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
    @NamedQuery(name = "Ranck.findAll", query = "SELECT r FROM Ranck r")
    , @NamedQuery(name = "Ranck.findByIdranck", query = "SELECT r FROM Ranck r WHERE r.idranck = :idranck")
    , @NamedQuery(name = "Ranck.findByNome", query = "SELECT r FROM Ranck r WHERE r.nome = :nome")
    , @NamedQuery(name = "Ranck.findByPosicao", query = "SELECT r FROM Ranck r WHERE r.posicao = :posicao")
    , @NamedQuery(name = "Ranck.findByTipoevento", query = "SELECT r FROM Ranck r WHERE r.tipoevento = :tipoevento")})
public class Ranck implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idranck;
    @Column(length = 45)
    private String nome;
    @Column(length = 45)
    private String posicao;
    @Column(length = 45)
    private String tipoevento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ranckIdranck")
    private List<Resultado> resultadoList;

    public Ranck() {
    }

    public Ranck(Integer idranck) {
        this.idranck = idranck;
    }

    public Integer getIdranck() {
        return idranck;
    }

    public void setIdranck(Integer idranck) {
        this.idranck = idranck;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    @XmlTransient
    public List<Resultado> getResultadoList() {
        return resultadoList;
    }

    public void setResultadoList(List<Resultado> resultadoList) {
        this.resultadoList = resultadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idranck != null ? idranck.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ranck)) {
            return false;
        }
        Ranck other = (Ranck) object;
        if ((this.idranck == null && other.idranck != null) || (this.idranck != null && !this.idranck.equals(other.idranck))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.corridaRustica.evento.model.Ranck[ idranck=" + idranck + " ]";
    }
    
}
