package Retangulo;

public class Retangulo {
  private int lado1;
  private  int lado2;

public Retangulo (int lado1,int lado2){//package
        //Construtor é usado quando vou instanciar (criar) um objeto
        //do Tipo retangulo
        this.lado1=lado1;
        this.lado2=lado2;
}
public Retangulo(){
        //Construtor padrão
}
public void getInformacao(String informacao){
    System.out.println(informacao);
}
public int recuperaLado1(){//vai retornar um int
    //obrigado a ter um elemento retornado
    //e ele deve ser do tipo int
    return lado1;//acaba com a execução do meu método
}
public void getInformacaoArea (){
    System.out.println("Valor da Área é:" + (lado1*lado2));
}

public void getInformacaoPerimetro (){
        System.out.println("Valor do Perimêtro é:" + (2*(lado1)+2*(lado2)));
}

public void getInformacaoOutra (){
        System.out.println("informação não disponível");
    }

    public void alteraLados(int lado1,int lado2){
    //Posso chamar toda vez que achar necessário realizar mudar o valor dos lados
    this.lado1=lado1;
    this.lado2=lado2;
    }

}
