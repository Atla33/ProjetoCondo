package Persistencia;

public class PessoaDAO {

    private Conexao minhaConexao = new Conexao();
    private String BUSCAR = "select * from \"usuario\" where \" ;
    private String ;
    private String ;
    private String ;


    private final String RELATORIO = "select * from \"Socio\"";
    private final String RELATORIONOMES = "select \"nome_s\" from \"Socio\"";
    private final String BUSCAR = "select * from \"Socio\" where \"pk_cpf_s\"=?";
    private final String INCLUIR = "insert into \"Socio\" (\"pk_cpf_s\", \"nome_s\", "
            + "\"data_adm\") values (?, ?, ?)";
    private final String EXCLUIR = "delete from \"Socio\" where \"pk_cpf_s\"=?";
    private final String ALTERAR = "update \"Socio\" set \"pk_cpf_s\"=?, \"nome_s\"=?, "
            + "\"data_adm\"=? where \"pk_cpf_s\"=?";

}
