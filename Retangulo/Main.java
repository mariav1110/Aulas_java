package Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r1= new Retangulo(1,2);
        //criei meu objeto r1 e iniciei com os lados com valores 1 e 2
        r1.getInformacao("Gostaria de saber de valores");
        r1.getInformacaoArea();
        r1.getInformacaoPerimetro();
        r1.getInformacaoOutra();
        r1.alteraLados(2,3);
        int lado1= r1.recuperaLado1();
        System.out.println("O lado 1 é:" + (lado1 +5));
        //System.out.println("O lado 1 é:" + (r1.recuperaLado1() +5));
    }
}