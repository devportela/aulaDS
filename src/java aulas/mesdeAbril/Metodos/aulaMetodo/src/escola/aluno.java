package escola;

public class aluno {
    String nome;
    int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void enviarDados(){
        System.out.println("sua idade é de "+getIdade());
        System.out.println("seu nome é de"+getNome());
    }


    
    
}
