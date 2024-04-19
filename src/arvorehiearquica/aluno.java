
package arvorehiearquica;

public class aluno extends pessoa {
    
    private int matricula;
    private String curso;
    
    public void pagarmensalidade(){
        System.out.println("pagando mensalidade");
        
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
        
  
    }

  
    public String detalhealuno() {
        return "detalhes aluno " + "matricula:" + matricula + ", curso:" + curso + '}';
    }
    
    
}
