package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

    public class Conexao {

        private String caminho;
        private String usuario;
        private String senha;
        private Connection aPropriaConexao;

        public Conexao(){
            caminho = "jdbc:postgresql://localhost:5432/BDcondo";
            usuario = "postgres";
            senha = "Atla123@";
        }

        public Conexao(String c, String u, String s){
            caminho = c;
            usuario = u;
            senha = s;
        }

        public void conectar(){
            try{
                Class.forName("org.postgresql.Driver"); //carregar o driver
                aPropriaConexao = DriverManager.getConnection(caminho, usuario, senha); //abrir a conexão
            }catch(Exception e){
                System.out.println("Erro na conexão: "+e.getMessage());
            }
        }
        public void desconectar(){
            try{
                aPropriaConexao.close();
            }catch(Exception e){
                System.out.println("Erro na desconexão: "+e.getMessage());
            }
        }
        public Connection getConexao(){
            return aPropriaConexao;
        }
    }