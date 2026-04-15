package heranca2;

public class Animal {
   protected String nome;
   protected int idade;
   protected Habitat habitat;

    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public void infor() {
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
        System.out.println("Habitat" + getHabitat());
    }
}
