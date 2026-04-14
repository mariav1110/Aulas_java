package TipoPessoa;
import  TipoPessoa.Pessoa;
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa daniel = new Pessoa("Daniel","Costa","65,5","1,70" );
        System.out.printf("Nome e Sobrenome;" + daniel.getNomeCompleto());
    }
}
