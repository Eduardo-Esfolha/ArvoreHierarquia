
package arvorehiearquica;


public class bolsista extends aluno {
    private double bolsa;
    
    public void renovarbolsa(){
        System.out.println("renovando bolsa de " + this.nome);
        
    }
    @Override
    public void pagarmensalidade(){
        System.out.println(this.nome + " \n é bolsista! pagamento facilitado" );
    }
}
