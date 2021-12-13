package Dominio;
import Dominio.Morador;
import Dominio.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);
    boolean autorizado = false;

    Morador morador = new Morador("enzo","enzo.danjour@gmail.com","27/05/1999","123456",89);

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public ArrayList<Pessoa> getUsuarios(){
        return pessoas;
    };

}
