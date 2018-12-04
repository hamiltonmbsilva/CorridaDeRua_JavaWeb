package br.eventoEsportivo.model.classe;

import br.eventoEsportivo.model.classe.Evento;
import br.eventoEsportivo.model.classe.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-03T20:38:49")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, String> pontuacao;
    public static volatile ListAttribute<Resultado, Usuario> usuarioList;
    public static volatile SingularAttribute<Resultado, String> posicao;
    public static volatile SingularAttribute<Resultado, Evento> eventoIdevento;
    public static volatile SingularAttribute<Resultado, Integer> idresultado;

}