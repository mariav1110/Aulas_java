public class Exemplo {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        //== compara igualdade que é diferente do = que é uma atribuição de valores
        boolean comparacao= a==b;//se igual true, se diferente false
        System.out.println(comparacao);//true
        comparacao= a != b;//se igual true, se diferente false
        System.out.println(comparacao);//false
        comparacao= a>b;//false
        comparacao= a<b;//false
        comparacao= a>=b;//true
        comparacao= a<=b;//true
        boolean valor=true;
        System.out.println(!(valor));

        boolean exemplo = !((5>3)&&5<1);
        boolean exemplo3 = (!(5>3)&&5<1);
        boolean exemplo2 = ((5>3)&&5>1);
        System.out.println("Resposta:" + exemplo);
    }
}
