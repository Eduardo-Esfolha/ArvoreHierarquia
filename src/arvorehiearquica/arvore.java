
package arvorehiearquica;

public class arvore {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        
        /*aluno a1 = new aluno ();
        a1.setNome("luis");
        a1.setMatricula(132456);
        a1.setCurso("informatica");
        a1.setIdade(30);
        a1.setSexo("m");
        a1.pagarmensalidade();
        System.out.println(a1.detalhepessoa());
        System.out.println(a1.detalhealuno());
        
        a1.pagarmensalidade();*/
        
        /*visitante v1 = new visitante();
        v1.setNome("marcia");
        v1.setIdade(60);
        v1.setSexo("F");
        System.out.println(v1.detalhepessoa());*/
        
        bolsista b1 = new bolsista();
        b1.setNome("irineu");
        b1.setIdade(23);
        b1.setSexo("m");
        b1.setMatricula(531112);
        b1.setCurso("padeiro");
        b1.pagarmensalidade();
        b1.renovarbolsa();
        System.out.println(b1.detalhepessoa());
        System.out.println(b1.detalhealuno());
        
        
        
        
        
        
        
    }
    
}
