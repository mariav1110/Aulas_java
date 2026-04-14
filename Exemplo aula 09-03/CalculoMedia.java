import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        //criamos 5 variáveis nota
        //ctrl + shift +f
    Scanner sc = new Scanner(System.in);
    String nome="";
    double nota1=0;
    double nota2=0;
    double nota3=0;
    double nota4 = 0;
    System.out.println("Escreva um nome:");
    nome = sc.nextLine(); //recuperou o nome e armazenou em nome
    System.out.println("Digite a sua nota 1:");
    nota1 =sc.nextDouble();//recuperou a nota  e armazenou em nota1
    System.out.println("Digite a sua nota 2:");
    nota2 =sc.nextDouble();
    System.out.println("Digite a sua nota 3:");
    nota3 =sc.nextDouble();
    System.out.println("Digite a sua nota 4:");
    nota4 =sc.nextDouble();
    double media= (nota1+nota2+nota3+nota4)/4;
    System.out.println("Nome:" + nome  +"\n Média:" + Math.round(media)+"\n");
    System.out.format("Nome: %s \n Média: %.2f",nome,media);
    }
}
