package br.com.unifacef.exe0;

/**
 *
 * @author Cadu Lourenço
 */
public class Paciente {
    private String nome; // encapsulamento das variáveis
    private int idade; // com a variável encapsulada não é possível alterá-las de forma direta
    private float peso, altura; // as variáveis serão acessadas pelos métodos setter e getter
    
    public Paciente(){
    
    }
    
    public Paciente(String nome, int idade, float peso, float altura){
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    public final void setNome(String nome){ // não permite que os filhos possam mecham nos métodos herdados pelo pai
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public final void setIdade(int idade){ // altera a variável
        if((idade >= 0) && (idade <= 150)){
            this.idade = idade;
        }
        else{
            System.out.println("Valor da idade inválido");
        }
    }
    
    public int getIdade(){ // acessa a variável
        return idade;
    }
    
    public final void setPeso(float peso){
        if((peso > 0) && (peso <= 250)){ // com o if protegemos a variável peso de mal uso
            this.peso = peso;
        }
        else{
            System.out.println("Valor do peso inválido");
        }
    }
    
    public float getPeso(){
        return peso;
    }
    
    public final void setAltura(float altura){
        if((altura > 0) && (altura <= 2.5f)){
            this.altura = altura;
        }
        else{
            System.out.println("Valor da altura inválido");
        }
    }
    
    public float getAltura(){
        return altura;
    }
    
}
