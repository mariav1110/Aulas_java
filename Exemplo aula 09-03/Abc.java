public class Abc {
    public static void main(String[] args) {
 //>= 0.5 arredonda para cima se < do que 0.5 arredonda para baixo
        double valor = 2.00000001;
        System.out.println("Numero arredondado:" + (Math.round(2.5) +2));
        System.out.println("Numero arredondado:" + Math.round(valor));
 //sempre arredonda para baixo (piso)
        System.out.println("Numero arredondado:" + (Math.floor(2.5)));
        System.out.println("Numero arredondado:" + Math.floor(valor));
        //sempre arredonda para cima;
        System.out.println("Numero arredondado:" + (Math.ceil(2.0)));
        System.out.println("Numero arredondado:" + Math.ceil(valor));
        //raiz quadrada ou sqrt
        double valorPassado=81;
        System.out.println("Raiz Quadrada:" + Math.sqrt(9));
        System.out.println("Raiz Quadrada:" + (Math.sqrt(valorPassado) + 3));
        //pow exponencial
        // se valor do exponecial > 1 eleva o valor
        // se valor >0 e <1 tira raiz do valor
        // passarei 2 valores 1 para a base e o segundo será o valor do expoente
        double base = 4;
        double expoente =0.5;
        System.out.println("Elevar:" + Math.pow(base,expoente));
        System.out.println("Elevar:" + Math.pow(2,3));
        System.out.println("Elevar:" + Math.pow(base,5));

        int a =5;
        a= a + 2; //carrega o histórico da própria variável
        System.out.println("Valor da Variavel:" + a); //7

        //++ funciona com a = a + 1;
        int incremento =0;
        //incremento = incremento +1;//1 exemplo sem essa facilitação
        //System.out.println(++incremento);//soma a variavel e ja usa a variavel atualizada
        //incremento = incremento + 1;equivalente
        int temporario = incremento++;
        System.out.println(temporario);// soma a variavel mas apenas depois usa a variavel atualizada
        System.out.println(incremento);
        // ++ sempre para somar +1.
        // +=10
        int x =0;
        System.out.println(x);//0
        x+=1;// equivalente x=x+1
        System.out.println(x);//1
        x-=1;//equivalente x=x-1
        x/=1;//equivalente x=x/1
        x*=1;//equivalente x=x*1
        x%=1;//equivalente x=x*1

      /*  System.out.print("\tNome: \"Henrique\" \n");// mandar o cursor para a próxima linha
        System.out.print("Sobrenome: \nDias Pastor");*/
        String nome="Henrique";
        System.out.format("O professor %s ministra DDD\n",nome);//estou reservando esse espaço para um string
        System.out.format("O professor %s ministra DDD e passo a nota %.2f","Henrique",2.555f);//estou reservando esse espaço para um string





    }

}