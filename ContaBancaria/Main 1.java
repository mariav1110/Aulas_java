package ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ContaBancaria henrique = new ContaBancaria("Henrique", 200);
    ContaBancaria pedro = new ContaBancaria("Pedro", 2000);
    henrique.mostraDados();
    pedro.mostraDados();
    ContaBancaria.alterarTaxa(0.1);
    henrique.aplicarTaxa();
    pedro.aplicarTaxa();
    henrique.mostraDados();
    pedro.mostraDados();
        ContaBancaria.alterarTaxa(0.15);
        ContaBancaria manuel = new ContaBancaria("Manuel", 2000);
        henrique.aplicarTaxa();
        henrique.mostraDados();
        henrique.setTitular("JOse");
        System.out.println(henrique.getTitular());
        String titual = henrique.getTitular();
    }
}