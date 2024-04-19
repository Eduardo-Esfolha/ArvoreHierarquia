
package arvorehiearquica;


public class pessoa {
    protected String nome;
    private int idade;
    private String sexo;
    
    public void fazeraniver(){
        this.idade ++;
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String detalhepessoa() {
        return "dados da pessoa " + "\nnome:" + nome + ", \nidade:" + idade + ", \nsexo:" + sexo + '}';
    }
    
    
}
