package br.com.unifacef.exe1;

/**
 *
 * @author Cadu Lourenço
 */
public class Cliente {
    
    private String nroConta, nroAgencia, nome;
    private float saldo;
    
    public Cliente(){
    
    }
    
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        setNroConta(nroConta);
        setNroAgencia(nroAgencia);
        setNome(nome);
        setSaldo(saldo);
    }
    
    public final void setNroConta(String nroConta){
        if((nroConta.length() == 8) && (nroConta.contains("-"))){
            this.nroConta = nroConta;
        }
        else{
            System.out.println("Valor do número da conta inválido");
        }
    }
    
    public String getNroConta(){
        return nroConta;
    }
    
    public final void setNroAgencia(String nroAgencia){
        if((nroAgencia.length() == 6) && (nroAgencia.contains("-"))){
            this.nroAgencia = nroAgencia;
        }
        else{
            System.out.println("Valor do número da agência inválido");
        }
    }
    
    public String getNroAgencia(){
        return nroAgencia;
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public final void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void realizarDeposito(float x){
        setSaldo(getSaldo() + x);
    }
    
    public void realizarSaque(float x){
        if(x <= getSaldo()){
            setSaldo(getSaldo() - x);
        }
        else{
            System.out.println("O valor do saque é maior que o valor do saldo");
        }
    }
    
    public void imprime(){
        System.out.println("Número do cliente: " + getNroConta() + " - Número da"
                + " Agência: " + getNroAgencia() + " - Nome: " + getNome() + 
                " - Saldo: R$" + getSaldo());
    }
    
}
