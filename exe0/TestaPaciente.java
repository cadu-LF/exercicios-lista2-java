package br.com.unifacef.exe0;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaPaciente {

    public static void main(String[] args) {
        Paciente obj1 = new Paciente();
        obj1.setNome("Alex"); 
        obj1.setIdade(-8); 
        obj1.setIdade(18); 
        obj1.setPeso(890);
        obj1.setPeso(65); 
        obj1.setAltura(4.20f);
        obj1.setAltura(1.73f); 
        // as variáveis que não estão encapsuladas permitem a má manipulação das variáveis
        System.out.println("Obj1: \nNome: " + obj1.getNome() + " - Idade: " +
                obj1.getIdade() + " - Peso: " + obj1.getPeso() + " - Altura: " 
                + obj1.getAltura());
        
        Paciente obj2 = new Paciente("Bruno", 350, -4, 3.1f);
        obj2.setNome("Letícia");
        obj2.setIdade(18);
        obj2.setPeso(45);
        obj2.setAltura(1.64f);
        System.out.println("Obj2: \nNome: " + obj2.getNome() + " - Idade: " + 
                obj2.getIdade() + " - Peso: " + obj2.getPeso() + " - Altura: "
                + obj2.getAltura());
    }
    
}
