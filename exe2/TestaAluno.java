package br.com.unifacef.exe2;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaAluno {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", 1234568, -19, -19, -11);
        a1.dadosAluno();
        a1.setNroAluno(123456);
        a1.dadosAluno();
        a1.setIdade(19);
        a1.dadosAluno();
        a1.setP1(13);
        a1.dadosAluno();
        a1.setP1(10);
        a1.dadosAluno();
        a1.setP2(12);
        a1.dadosAluno();
        a1.setP2(8);
        a1.dadosAluno();
        a1.notaFinal(a1.getP1(), a1.getP2());
    
        Aluno a2 = new Aluno();
        a2.setIdade(400);
        String s = new String();
        String aux = "";
        for(int i = 0; i < 23; i++){
            aux = aux + String.valueOf(i);
            s = s.concat(aux);
        }
        //System.out.println(aux.length());
        a2.setNome(s);
        a2.dadosAluno();
        a2.setNome("Fabio");
        a2.dadosAluno();
        a2.setP1(-12);
        a2.dadosAluno();
        a2.setP1(5.4);
        a2.dadosAluno();
        a2.setP2(-1.5);
        a2.dadosAluno();
        a2.setP2(7.2);
        a2.dadosAluno();
        a2.notaFinal(a2.getP1(), a2.getP2());
        
    }
}
