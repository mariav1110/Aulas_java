package ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;
    static double taxa = 0.02;
     ContaBancaria(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    void depositar(double valor){
        saldo = saldo + valor;
        //saldo +=valor;
    }
    void sacar(double valor){
        saldo = saldo - valor;
        //saldo -=valor;
    }
    void aplicarTaxa(){
        saldo -= saldo*taxa;
    }

    static void alterarTaxa(double novaTaxa){
taxa=novaTaxa;
    }
    void mostraDados(){
        System.out.println("Nome:" + titular +"\n"+
                           "Saldo:" + saldo );
    }
    public void setTitular(String titular) {
     //   if (titular.isEmpty()) {
      //  } else {
            this.titular = titular;
      //  }
    }
    public String getTitular(){
        return titular;
    }
}
