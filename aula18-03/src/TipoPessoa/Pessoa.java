package TipoPessoa;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int pesoEmGramas;
    private int alturaEmCentimetros;

    Pessoa (String nome, String  sobrenome, int pesoEmGramas, int alturaEmCentimetros) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pesoEmGramas = pesoEmGramas;
        this.alturaEmCentimetros = alturaEmCentimetros;
    }

    public Pessoa(){

    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double getPesoEmKilogramas() {
        return pesoEmGramas / 1000;
    }

    // Altura em metros
    public double getAlturaEmMetros() {
        return alturaEmCentimetros / 100;
    }
}
