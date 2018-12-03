/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eventoEsportivo.model.classe;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Resultado.findAll", query = "SELECT r FROM Resultado r")
    , @NamedQuery(name = "Resultado.findByIdresultado", query = "SELECT r FROM Resultado r WHERE r.idresultado = :idresultado")
    , @NamedQuery(name = "Resultado.findByPosicao", query = "SELECT r FROM Resultado r WHERE r.posicao = :posicao")
    , @NamedQuery(name = "Resultado.findByPontuacao", query = "SELECT r FROM Resultado r WHERE r.pontuacao = :pontuacao")})
public class Resultado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idresultado;
    @Column(length = 45)
    private String posicao;
    @Column(length = 45)
    private String pontuacao;
    @JoinColumn(name = "evento_idevento", referencedColumnName = "idevento", nullable = false)
    @ManyToOne(optional = false)
    private Evento eventoIdevento;
    @OneToMany(mappedBy = "resultadoIdresultado")
    private List<Usuario> usuarioList;

    public Resultado() {
    }

    public Resultado(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public Integer getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Evento getEventoIdevento() {
        return eventoIdevento;
    }

    public void setEventoIdevento(Evento eventoIdevento) {
        this.eventoIdevento = eventoIdevento;
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
        hash += (idresultado != null ? idresultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultado)) {
            return false;
        }
        Resultado other = (Resultado) object;
        if ((this.idresultado == null && other.idresultado != null) || (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.eventoEsportivo.model.classe.Resultado[ idresultado=" + idresultado + " ]";
    }
    
}
