package br.eventoEsportivo.model.classe;

import br.eventoEsportivo.model.classe.Evento;
import br.eventoEsportivo.model.classe.Ranck;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T23:04:22")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, String> pontuacao;
    public static volatile SingularAttribute<Resultado, Ranck> ranckIdranck;
    public static volatile SingularAttribute<Resultado, String> posicao;
    public static volatile SingularAttribute<Resultado, Evento> eventoIdevento;
    public static volatile SingularAttribute<Resultado, String> nome;
    public static volatile SingularAttribute<Resultado, Integer> idresultado;

}