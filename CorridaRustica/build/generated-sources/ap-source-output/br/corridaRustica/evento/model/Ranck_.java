package br.corridaRustica.evento.model;

import br.corridaRustica.evento.model.Resultado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-31T16:46:37")
@StaticMetamodel(Ranck.class)
public class Ranck_ { 

    public static volatile SingularAttribute<Ranck, String> posicao;
    public static volatile ListAttribute<Ranck, Resultado> resultadoList;
    public static volatile SingularAttribute<Ranck, String> nome;
    public static volatile SingularAttribute<Ranck, Integer> idranck;
    public static volatile SingularAttribute<Ranck, String> tipoevento;

}