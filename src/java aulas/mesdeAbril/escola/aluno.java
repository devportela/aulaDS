package mesdeAbril.escola;

public class aluno {


    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void enviarDados() {
        System.out.println("aluno,nome é " + getNome());
        System.out.println("aluno,sua idade é de:" + getidade());
    }

    public int getidade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String nome;
    private int idade;

}
