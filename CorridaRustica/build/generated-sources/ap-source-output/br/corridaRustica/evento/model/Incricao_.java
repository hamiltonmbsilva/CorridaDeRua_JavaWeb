package br.corridaRustica.evento.model;

import br.corridaRustica.evento.model.IncricaoHasEvento;
import br.corridaRustica.evento.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-31T16:46:37")
@StaticMetamodel(Incricao.class)
public class Incricao_ { 

    public static volatile SingularAttribute<Incricao, Date> datainicio;
    public static volatile SingularAttribute<Incricao, Short> situacao;
    public static volatile ListAttribute<Incricao, Usuario> usuarioList;
    public static volatile SingularAttribute<Incricao, Short> situacaousaurio;
    public static volatile ListAttribute<Incricao, IncricaoHasEvento> incricaoHasEventoList;
    public static volatile SingularAttribute<Incricao, Integer> valor;
    public static volatile SingularAttribute<Incricao, Date> datafinal;
    public static volatile SingularAttribute<Incricao, Integer> idincricao;

}