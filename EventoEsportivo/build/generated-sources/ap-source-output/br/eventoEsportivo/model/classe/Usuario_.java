package br.eventoEsportivo.model.classe;

import br.eventoEsportivo.model.classe.Incricao;
import br.eventoEsportivo.model.classe.Tipousuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T23:04:22")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Integer> idade;
    public static volatile SingularAttribute<Usuario, Integer> telefone;
    public static volatile SingularAttribute<Usuario, Tipousuario> tipousuarioId;
    public static volatile SingularAttribute<Usuario, Incricao> incricaoIdincricao;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, Boolean> sexo;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;

}