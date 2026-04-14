//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SalaDeAula s= new SalaDeAula(3,5,7);
        s.imprimeNumeroDeComputadores();
        s.numeroDeComputadores=10;
        s.imprimeNumeroDeComputadores();
         s= new SalaDeAula();
        s.imprimeNumeroDeComputadores();
        SalaDeAula fiap1= new SalaDeAula();
        fiap1.numeroDeComputadores=500;
        s.imprimeNumeroDeComputadores();
        fiap1.imprimeNumeroDeComputadores();
        fiap1.imprimeNumeroDeAndares();
        fiap1.alterarAndar(20);
        fiap1.alterarTudo(3,5,10);
    }
}