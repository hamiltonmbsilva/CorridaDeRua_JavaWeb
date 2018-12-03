package br.eventoEsportivo.model.classe;

import br.eventoEsportivo.model.classe.Evento;
import br.eventoEsportivo.model.classe.Incricao;
import br.eventoEsportivo.model.classe.IncricaoHasEventoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T23:04:22")
@StaticMetamodel(IncricaoHasEvento.class)
public class IncricaoHasEvento_ { 

    public static volatile SingularAttribute<IncricaoHasEvento, Evento> evento;
    public static volatile SingularAttribute<IncricaoHasEvento, IncricaoHasEventoPK> incricaoHasEventoPK;
    public static volatile SingularAttribute<IncricaoHasEvento, Incricao> incricao;

}