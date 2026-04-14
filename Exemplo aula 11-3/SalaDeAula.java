public class SalaDeAula {
    int numeroDaSala;
    int numeroDeComputadores;
    int andar;
    SalaDeAula(int numeroDaSala,int numeroDeComputadores,int andar){
        this.numeroDaSala=numeroDaSala;
        this.numeroDeComputadores=numeroDeComputadores;
        this.andar=andar;
    }
    SalaDeAula(){
        //construtor padrão
    }

void alterarTudo(int numeroDaSala,int numeroDeComputadores,int andar){
this.numeroDaSala=numeroDaSala;
this.numeroDeComputadores=numeroDeComputadores;
this.andar=andar;
}

    void imprimeNumeroDeComputadores(){
        //não retorna valor para uso posterior
        int abc=10;
        System.out.println(numeroDeComputadores);
        System.out.println(abc);
    }
    void imprimeNumeroDeAndares(){
        //não retorna valor para uso posterior
        System.out.println(andar);


    }
    //criar metodo que altere o andar
    void alterarAndar(int qtdeAndar){
        andar=qtdeAndar;
        //System.out.println(qtdeAndar);
    }

}
