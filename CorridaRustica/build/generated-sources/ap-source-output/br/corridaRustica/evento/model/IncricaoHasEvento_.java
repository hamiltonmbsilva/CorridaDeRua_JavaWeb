package br.corridaRustica.evento.model;

import br.corridaRustica.evento.model.Evento;
import br.corridaRustica.evento.model.Incricao;
import br.corridaRustica.evento.model.IncricaoHasEventoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-31T16:46:37")
@StaticMetamodel(IncricaoHasEvento.class)
public class IncricaoHasEvento_ { 

    public static volatile SingularAttribute<IncricaoHasEvento, Evento> evento;
    public static volatile SingularAttribute<IncricaoHasEvento, IncricaoHasEventoPK> incricaoHasEventoPK;
    public static volatile SingularAttribute<IncricaoHasEvento, Incricao> incricao;

}