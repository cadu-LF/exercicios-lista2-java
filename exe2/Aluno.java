package br.com.unifacef.exe2;

/**
 *
 * @author Cadu Lourenço
 */
public class Aluno {
    
    private int nroAluno, idade;
    private String nome;
    private double p1, p2;
    
    public Aluno(){
    }
    
    public Aluno(String nome, int nroAluno, int idade, double p1, double p2){
        setNome(nome);
        setNroAluno(nroAluno);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    }
    
    public final void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Nome digitado contém mais de 30  caracteres");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public final void setNroAluno(int nroAluno){
        String aux = String.valueOf(nroAluno);
        if(aux.length() == 6){
            this.nroAluno = nroAluno;
        }
        else{
            System.out.println("Valor do núemro do aluno inválido!");
        }
    }
    
    public int getNroAluno(){
        return nroAluno;
    }
    
    public final void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }
        else{
            System.out.println("Valor da idade inválido!");
        }
    }
    
    public int getIdade(){
        return idade;
    }
    
    public final void setP1(double p1){
        if((p1 >= 0) && (p1 <= 10)){
            this.p1 = p1;
        }
        else{
            System.out.println("Valor da P1 inválido!");
        }
    }
    
    public double getP1(){
        return p1;
    }
    
    public final void setP2(double p2){
        if((p2 >= 0) && (p2 <= 10)){
            this.p2 = p2;
        }
        else{
            System.out.println("Valor da P2 inválido!");
        }
    }
    
    public double getP2(){
        return p2;
    }
    
    public void notaFinal(double p1, double p2){
        System.out.println("\nNota final: " + (p1+p2) / 2);
    }
    
    public void dadosAluno(){
        System.out.println("\nNúmero do aluno: " + nroAluno + " - Nome: " + nome +
                " - Idade: " + idade);
    }
    
}
