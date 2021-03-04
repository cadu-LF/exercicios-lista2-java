package br.com.unifacef.exe1;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaCliente {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("12345678", "369128", "Brunao", -100);
        c1.imprime();
        c1.setNroConta("1234567-8");
        c1.imprime();
        c1.setNroAgencia("12345-7");
        c1.imprime();
        c1.setNroConta("123456-8");
        c1.imprime();
        c1.setNroAgencia("1234-6");
        c1.imprime();
        c1.realizarDeposito(2100);
        c1.imprime();
        c1.realizarSaque(3000);
        c1.imprime();        
        
        Cliente c2 = new Cliente();
        c2.setNroConta("123456-7");
        c2.imprime();
        c2.setNroAgencia("123456");
        c2.imprime();
        c2.setNroAgencia("1234-5");
        c2.imprime();
        c2.setNome("Letícia");
        c2.imprime();
        c2.setSaldo(0);
        c2.imprime();
        c2.realizarSaque(10.50f);
        c2.imprime();
        c2.realizarDeposito(1.0e3f);
        c2.imprime();
        c2.realizarSaque(5.50f);
        c2.imprime();
    }
    
}
