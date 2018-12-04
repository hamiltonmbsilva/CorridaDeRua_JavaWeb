package br.eventoEsportivo.model.classe;

import br.eventoEsportivo.model.classe.Resultado;
import br.eventoEsportivo.model.classe.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-03T20:38:49")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Integer> idevento;
    public static volatile SingularAttribute<Evento, String> estado;
    public static volatile SingularAttribute<Evento, Short> situacao;
    public static volatile SingularAttribute<Evento, String> eventohora;
    public static volatile SingularAttribute<Evento, Short> situacaoUsuario;
    public static volatile ListAttribute<Evento, Usuario> usuarioList;
    public static volatile SingularAttribute<Evento, String> fimpercurso;
    public static volatile SingularAttribute<Evento, String> equipeevento;
    public static volatile SingularAttribute<Evento, Date> inicioInscrica;
    public static volatile ListAttribute<Evento, Resultado> resultadoList;
    public static volatile SingularAttribute<Evento, Double> valorIncricao;
    public static volatile SingularAttribute<Evento, String> iniciopercurso;
    public static volatile SingularAttribute<Evento, String> descricao;
    public static volatile SingularAttribute<Evento, Short> situacaoIncricao;
    public static volatile SingularAttribute<Evento, String> nomeEvento;
    public static volatile SingularAttribute<Evento, Date> eventodata;
    public static volatile SingularAttribute<Evento, String> tempolimite;
    public static volatile SingularAttribute<Evento, String> modalidade;

}